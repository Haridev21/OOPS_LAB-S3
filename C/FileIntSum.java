import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.EOFException;
public class FileIntSum
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
      System.out.printf("Enter file name:");
      String fname=s.readLine();
      
      DataInputStream d=new DataInputStream(System.in);
      DataOutputStream dis=new DataOutputStream(new FileOutputStream(fname));
      System.out.printf("Enter total number of integers to enter:");

      String n=d.readLine();
      int n1=Integer.parseInt(n);
      String ele;
      for(int i=0;i<n1;i++)
      {
         System.out.printf("Enter number %d:",i+1);
         ele=d.readLine();
         int ele1=Integer.parseInt(ele);
         dis.writeInt(ele1);
      }
      s.close();
      d.close();
      dis.close();
      int i,sum=0;
      try(DataInputStream din=new DataInputStream(new FileInputStream(fname)))
      {
         while(true)
         {
            try
            {
               i=din.readInt();
               sum=sum+i;
            }
            catch(EOFException f)
            {
               System.out.println("End of file reached");
               break;
            }
         }
      }
      catch(IOException e)
      {
         System.out.println("File not found");
      }
      System.out.println("Sum: "+sum);
   }
}
