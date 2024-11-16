class Employee1
{//parent class
   static public String name;
   private int age;
   protected int phonenumber;
   protected String address;
   double salary;

   Employee1()
   {
      //Default Constructor
   }

   Employee1(String name,int age,int phonenumber,String address, double salary)
   {
      this.name=name;
      this.age=age;
      this.phonenumber=phonenumber;
      this.address=address;
      this.salary=salary;
      System.out.println("SUPER CLASS CONSTRUCTOR HI");
   }

   /*Employee(Employee employee)
   {
   this.name=employee.name;
   }*/

   void printname()
   {
      System.out.println("name:"+name);
   }

   void printsalary()
   {
      System.out.println("Salary:"+salary);
   }

   int getage()//gets data of private variable and return
   {
      this.age=age;
      return age;
   }

}

class Officer extends Employee1 //subclass
{
   String Specialization;

   Officer(String name,int age,int phonenumber,String address, double salary,String Specialization)//constructor
   {
      super(name,age,phonenumber,address,salary);
      this.Specialization=Specialization;
      System.out.println("SUBCLASS OFFICER CONSTRUCTOR");
   }

   void display1()
   {
      System.out.println("--Officer--");
      //System.out.println("Name:"+name);
      printname();
      System.out.println("Age:"+getage());//private age
      System.out.println("Phonenumber:"+phonenumber);
      System.out.println("Address:"+address);
      printsalary(); 
      System.out.println("Specialization:"+Specialization);
      System.out.println();
   }

}


class Manger extends Employee1   //subclass
{
   String  department;

   Manger()
   {
      //Default constructor
   }

   Manger(String name,int age,int phonenumber,String address, double salary,String department)
   {
      super(name,age,phonenumber,address,salary);
      this.department=department;
      System.out.println("SUBCLASS MANGER CONSTRUCTOR");
      System.out.println();
   }
   void display2()
   { 
      System.out.println("---Manger--");
      System.out.println("Name:"+name);
      System.out.println("Age:"+getage());//private 
      System.out.println("Phonenumber:"+phonenumber);
      System.out.println("Address:"+address);
      printsalary();
      System.out.println("Department:"+department);
      System.out.println();

   }

}


public class Employee
{
   public static void main(String args[])
   {
      //char[] name={'H','a','r','i','d','e','v','\0'};
      //char[] address={'a','B','\0'};
      //char[] special={'I','T','\0'};

      //char[] name2={'S','r','e','e','k','u','t','t','a','n','\0'};
      //char[] address2={'a','B','\0'};
      //char[] department={'g','g','\0'};


      Officer officer=new Officer("Haridev",21,62824285,"Champakara",7272.2,"IT");
      Manger manger=new Manger("Sreehari",22,90628272,"Karukachal",2467.7,"CSE");
      officer.display1();
      manger.display2();
   }
}


























