/*Develop a Java program to create a class Student with members usn, name,
an array credits and an array marks. Include methods to accept and display details and a method to calculate SGPA of a student. */

import java.util.Scanner;
class student
{
 String name=new String();
 String usn=new String();
 int marks[]=new int[3];
 int credit[]=new int[3];
 Scanner sc=new Scanner(System.in);
 void access()
{ 
  System.out.println("enter the details");
  System.out.println("enter the name");
  name=sc.nextLine();
  System.out.println("enter the usn");
  usn=sc.nextLine();
  for(int i=0;i<3;i++)
  { 
   System.out.println("enter the marks and credit of subject"+(i+1));
  marks[i]=sc.nextInt();
  credit[i]=sc.nextInt();
  }
}
 void display()
{
 System.out.println("The entred details are:");
 System.out.println(name);
 System.out.println(usn);
 System.out.println( "the marks and credits are");
for(int i=0;i<3;i++)
{ 
 System.out.print(marks[i]);
 System.out.print("  "+credit[i]);
 System.out.println();
}
}
 float calculate()
{
  float msum=0,csum=0;
for(int i=0;i<3;i++)
{ if(marks[i]==100)
     {
       msum+=10*credit[i];
     }
 else
  msum+=(((marks[i]/10)+1)*(credit[i]));
  System.out.print("   ");
  csum+=credit[i];
}
 float cgpa=msum/csum;
return cgpa;
}
}

class week3{
 public static void main(String args[])
{
  student s=new student();
  student s1=new student();
 // Scanner sc=new Scanner(System.in);
 // System.out.println("enter the details");
  s.access();
  s.display();
  float res=s.calculate();
   System.out.println("the cgpa of the student "+s.name+" is: "+res);
  System.out.println("Enter the details of 2nd student:");
s1.access();
  s1.display();
  float res1=s1.calculate();
 System.out.println("the cgpa of the student "+s1.name+" is: "+res1);

}
}












  
  
