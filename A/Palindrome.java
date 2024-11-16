public class Palindrome
{
   public static void main(String[] args)
   {
      char str[]=new char[]{'c','i','v','i','c','\0'};
      char rev[]=new char[6];
      int i,j=0,same=0;
      for(i=4;i>=0;i--)
      {
         rev[j]=str[i];
         j++;
      }
      rev[j]='\0';
      i=0;
      while(str[i]!='\0')
      {
         if(str[i]==rev[i])
         {
            same++;
         }
         i++;
      }
      if(same==5)
      {
         System.out.println("It is a palindrome");
      }
      else
      {
         System.out.println("It is not a palindrome");
      }
   }
}
