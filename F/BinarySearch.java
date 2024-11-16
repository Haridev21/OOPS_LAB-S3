import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
class Searching
{
   ArrayList<Integer> arr;
   Searching(ArrayList<Integer> a)
   {
      this.arr=a;
   }
   void sort()
   {
      //bubble sort
      int n=arr.size()-1;
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<(n-i);j++)
         {
            if(arr.get(j)>arr.get(j+1))
            {
               int i1=arr.get(j);
               int i2=arr.get(j+1);
               arr.set(j,i2);
               arr.set(j+1,i1);
            }
         }
      }
   }
   void bSearch(int key)
   {
      sort();
      int l=0;
      int h=arr.size()-1;
      while(l<=h)
      {
         int mid=(l+h)/2;
         if(key>arr.get(mid))
         {
            l=mid+1;
         }
         else if(key<arr.get(mid))
         {
            h=mid-1;
         }
         else
         {
            System.out.println(key+" found");
            return;
         }
      }
      System.out.println("Element not present in the list");
   }

}
public class BinarySearch
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ArrayList<Integer> list=new ArrayList<>();
      System.out.printf("Enter total number of terms in list:");
      int n=Integer.parseInt(br.readLine());
      for(int i=0;i<n;i++)
      {
         System.out.printf("Enter term:");
         int ele=Integer.parseInt(br.readLine());
         list.add(ele);
      }
      System.out.printf("Enter element to be searched:");
      int key=Integer.parseInt(br.readLine());
      Searching s=new Searching(list);
      s.bSearch(key);
   }
}

