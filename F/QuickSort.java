import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class QuickSort
{
    private static int partition(ArrayList<String> a,int l,int h)
   {
      String pivot=a.get(h);
      int low=l-1;
      for(int j=l;j<h;j++)
      {
         String s3=a.get(j);
         if(s3.compareTo(pivot)<=0)
         {
            low++;
            String t=a.get(low);
            a.set(low,a.get(j));
            a.set(j,t);
         }
      }
      String t=a.get(low+1);
      a.set(low+1,a.get(h));
      a.set(h,t);
      return low+1;
   }
   private static void qs(ArrayList<String> a,int l, int h)
   {
      if(l<h)
      {
         int p=partition(a,l,h);
         qs(a,l,p-1);
         qs(a,p+1,h);
      }
   }

   public static void main(String[] args) throws IOException
   {
      ArrayList<String> arr=new ArrayList<>();
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.printf("Enter the total number of array elements:");
      String s1=br.readLine();
      int n=Integer.parseInt(s1);
      for(int i=0;i<n;i++)
      {
         System.out.printf("Enter name %d:",i+1);
         String s2=br.readLine();
         arr.add(s2);
      }
      System.out.printf("Original array:\n");
      for(int i=0;i<n;i++)
      {
           System.out.println(arr.get(i));
      }
      qs(arr,0,n-1);
      System.out.printf("\nArray after Quick Sort:\n");
      for(int i=0;i<n;i++)
      {
           System.out.println(arr.get(i));
      }
      System.out.println();
   }
}
