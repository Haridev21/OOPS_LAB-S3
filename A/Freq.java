public class Freq
{
   public static void main(String[] args)
   {
      char str[]=new char[]{'b','a','l','l','o','o','n','\0'};
      char c='B';
      int i=0,freq=0;
      while(str[i]!='\0')
      {
         if(str[i]==c)
         {
            freq++;
         }
         i++;
      }
      System.out.printf("%c occurs %d times\n",c,freq);
   }
}

