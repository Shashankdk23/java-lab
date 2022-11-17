import java.util.Scanner;
 
class quad{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of a:");
double a=s.nextDouble();

if(a==0)
{
System.out.println("The given equation is not quadratic");
}
else{
System.out.println("Enter the value of b:");
double b=s.nextDouble();
System.out.println("Enter the value of c:");
double c=s.nextDouble();
double d=b*b-4*a*c;
if(d>0)
{
 double r1=(-b/(2*a));
 double r2=((Math.pow(d,0.5))/(2*a));
System.out.println("The roots are:"+""+(r1+r2));
System.out.println((r1-r2));

}
if(d==0)
{
double r1=-b/(2*a);
System.out.println("The root is:"+""+r1);
}
if(d<0)
{
System.out.println("The roots are imaginary");
double r1=-b/(2*a);
double r2=(Math.pow(-d,0.5)/(2*a));
System.out.println("The imaginary roots are :"+r1+"+i"+r2);
System.out.println(r1+"-i"+r2);
}
}
}
}

