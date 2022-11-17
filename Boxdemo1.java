import  java.util.Scanner;
class Box{
double wid,hei,bre;
double vol(){
return wid*hei*bre;}}
class Boxdemo{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the dimension");
  Box mybox1=new Box();
  mybox1.wid=s.nextDouble();
 mybox1.hei=s.nextDouble();
mybox1.bre=s.nextDouble();
System.out.println("The volume is"+" "+mybox1.vol());
}}