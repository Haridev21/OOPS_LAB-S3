import java.util.Scanner;

abstract class Shape
{
   abstract void numberOfSides();
   abstract void area();
/*
   protected void finalize()
   {
      System.out.println("Garbage collector");
   }
*/
}

class Rectangle extends Shape
{
   private int side;
   Rectangle(int s)
   {
      this.side=s;
   }
   void numberOfSides()
   {
      System.out.println("Number of sides in Rectangle is "+side);
   }
   void area()
   {
      float l,b;
      Scanner scan=new Scanner(System.in);
      System.out.printf("Enter length:");
      l=scan.nextFloat();
      System.out.printf("Enter breadth:");
      b=scan.nextFloat();
      float area=l*b;
      System.out.println("Area of Rectangle: "+area);
   }
}

class Triangle extends Shape
{
   private int side;
   Triangle(int s)
   {
      this.side=s;
   }
   void numberOfSides()
   {
      System.out.println("Number of sides in Triangle is "+side);
   }
   void area()
   {
      float b,h;
      Scanner scan=new Scanner(System.in);
      System.out.printf("Enter breadth:");
      b=scan.nextFloat();
      System.out.printf("Enter height:");
      h=scan.nextFloat();
      float area=(b*h)/2;
      System.out.println("Area of right triangle: "+area);
   }
}

class Hexagon extends Shape
{
   private int side;
   Hexagon(int s)
   {
      this.side=s;
   }
   void numberOfSides()
   {
      System.out.println("Number of sides in Hexagon is "+side);
   }
   void area()
   {
      Scanner scan=new Scanner(System.in);
      System.out.printf("Enter length of one side:");
      float a=scan.nextFloat();
      double area=(3*1.732*a*a)/2;
      System.out.println("Area of regular hexagon: "+area);
   }
}
public class Abstract
{
   public static void main(String[] args)
   {
      Rectangle r=new Rectangle(4);
      Triangle t=new Triangle(3);
      Hexagon h=new Hexagon(6);

      r.numberOfSides();
      t.numberOfSides();
      h.numberOfSides();

      Scanner sc=new Scanner(System.in);
      while(true)
      {
         System.out.println("Display area of:1.Rectangle 2.Triangle 3.Hexagon");
         System.out.printf("Enter your choice: ");
         int n=sc.nextInt();
         if(n==1)
         {
            r.area();
         }
         else if(n==2)
         {
            t.area();
         }
         else if(n==3)
         {
            h.area();
         }
         else
         {
            break;
         }
      }  
/*
      r=null;
      t=null;
      h=null;
      System.gc();
*/
   }
}
