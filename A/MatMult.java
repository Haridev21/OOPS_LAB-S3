public class MatMult
{
   public static void main(String[] args)
   {
      int a[][]=new int[][]{{1,2,3},{4,5,6}};
      int b[][]=new int[][]{{7,8},{9,10},{11,12}};
      int c[][]=new int[2][2];
      int i,j,k;
      for(i=0;i<2;i++)
      {
         for(j=0;j<2;j++)
         {
            c[i][j]=0;
            for(k=0;k<3;k++)
            {
               c[i][j]+=a[i][k]*b[k][j];
            }
         }
      }
      
      for(i=0;i<2;i++)
      {
         for(j=0;j<2;j++)
         {
            System.out.printf("%d\t",c[i][j]);
         }
      System.out.println();
      }
   }
}
