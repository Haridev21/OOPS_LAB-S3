import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperation
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
      System.out.printf("Enter file name:");
      String fname=s.readLine();
      
      FileWriter f=new FileWriter(fname);
      BufferedWriter bw=new BufferedWriter(f);
      System.out.printf("Enter strings to write:");
      String string;
      string=s.readLine();
      bw.write(string);
      bw.close();
      f.close();

      FileReader fr=null;
      try
      {
         fr=new FileReader(fname);
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found");
      }

      BufferedReader br=new BufferedReader(fr);
      String st;
      while((st=br.readLine())!=null)
      {
         System.out.println(st);
      }
      br.close();
      fr.close();
      s.close();
   }
}

