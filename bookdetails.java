/*Create a class Book which contains four members: name, author, price, num_pages. Include a constructor to set the values for the members. 
Include methods to set and get the details of the objects. 
Include a toString( ) method that could display the complete details of the book. Develop a Java program to create n book objects.*/

import java.util.Scanner;
class Book{
 String name;
 String author;
 float price;
 int page_no;

 Book( String n, String a,float pr,int pa)
{ 
  name=n;
  author=a;
  price=pr;
  page_no=pa;
}
 void tostring()
{
  System.out.println("Book name: "+name);
  System.out.println("author name: "+author);
  System.out.println("Book price: "+price);
   System.out.println("Total no of pages in Book : "+page_no);
System.out.println();
 }
}
class week4{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no of books");
    int x=sc.nextInt();
  Book b[]=new Book[x];
 for(int i=0;i<x;i++)
{
 System.out.println("Enter the details of book"+(i+1)s+":");
  String n=sc.next();
  String a=sc.next();
  float pr=sc.nextFloat();
  int pa=sc.nextInt();

 b[i]=new Book(n,a,pr,pa);
}

for(int i=0;i<x;i++)
{

 System.out.println("Entered details of book"+(i+1)+" are:");
 b[i].tostring();
}
}
}

  