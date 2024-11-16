import java.lang.Thread;
class Number
{
   static int num;
   static boolean evenNum;
   static boolean processed=true;
}
class RandomNum extends Thread
{
   public void run()
   {
      try
      {
         while(true)
         {
            synchronized (Number.class)
            {
               while(!Number.processed)
               {
                  Number.class.wait();
               }
               double r=Math.random();
               int n=(int)(r*10);
               Number.num=n;
               Number.evenNum=(n%2==0);
               System.out.println("Generated number:"+Number.num);
               Number.processed=false;
               Number.class.notifyAll();
            }
            Thread.sleep(1000);
         }
      }
      catch (Exception e)
      {
         System.out.println("Random class Exception");
      }
   }
}
class EvenNumSq extends Thread
{
   public void run()
   {
      try
      {
         while(true)
         {
            synchronized (Number.class)
            {
               while(Number.processed||!Number.evenNum)
               {
                  Number.class.wait();
               }
               System.out.println("Square of number:"+(Number.num*Number.num));
               System.out.println();
               Number.processed=true;
               Number.class.notifyAll();
            }
         }
      }
      catch(Exception e)
      {
         System.out.println("Even class Exception");
      }
   }
}
class OddNumCube extends Thread
{
   public void run()
   {
      try
      {
         while(true)
         {
            synchronized(Number.class)
            {
               while(Number.processed||Number.evenNum)
               {
                  Number.class.wait();
               }
               System.out.println("Cube of number:"+(Number.num*Number.num*Number.num));
               System.out.println();
               Number.processed=true;
               Number.class.notifyAll();
            }
         }   
      }
      catch(Exception e)
      {
         System.out.println("Odd class Exception");
      }
   }
}
public class MultiThread
{
   public static void main(String[] args)
   {
      RandomNum rn=new RandomNum();
      EvenNumSq s=new EvenNumSq();
      OddNumCube c=new OddNumCube();
      rn.start();
      s.start();
      c.start();
   }
}
