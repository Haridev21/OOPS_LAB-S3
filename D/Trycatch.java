import java.io.*;
import java.lang.*;
class EvenException extends Exception
{
   EvenException(String s)
   {
       super(s);
   }
}
class OddException extends Exception
{
   OddException(String s)
   {
       super(s);
   }
}

public class Trycatch
{
   static void is_even_odd(int num) throws EvenException,OddException
   {
      if(num%2==0)
      {
         throw new EvenException("number is even");
      }
      else
      {
         throw new OddException("number is odd");
      }
   }
 public static void main(String [] args)
    {
      try
      {
          int c,b;

            BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter an Integer");
            b=Integer.parseInt(r.readLine());
            System.out.println("Enter another Integer");
            c=Integer.parseInt(r.readLine());
            try
            {
                 is_even_odd(b);
            }
            catch(EvenException e1)
            {
                  System.out.println(e1.getMessage());
            }
            catch(OddException e2)
            {
                 System.out.println(e2.getMessage());
            }
            is_even_odd(c);
}
     catch(EvenException ev)
     {
           System.out.println(ev.getMessage());
     }
     catch(Exception eo)
     {
            System.out.println(eo.getMessage());
     }
      finally
      {
         System.out.println("Exception handling is done!");
      }
   }
}
