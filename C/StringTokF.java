import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
public class StringTokF
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.printf("Enter a line of integers:");
      String line=br.readLine();
      StringTokenizer st=new StringTokenizer(line);
      int sum=0;
      while(st.hasMoreTokens())
      {
         int b=Integer.valueOf(st.nextToken());
         System.out.println(b);
         sum=sum+b;
      }
      System.out.println("Sum : "+sum);
      br.close();
   }
}
