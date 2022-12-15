/*Develop a Java program to create a class Bank that maintains two kinds of account for its customers,
one called savings account and the other current account. The savings account provides compound
interest and withdrawal facilities but no cheque book facility. The current account provides cheque
book facility but no interest. Current account holders should also maintain a minimum balance and if
the balance falls below this level, a service charge is imposed.
Create a class Account that stores customer name, account number and type of account. From this
derive the classes Cur-acct and Sav-acct to make them more specific to their requirements. Include the
necessary methods in order to achieve the following tasks.
a) Accept deposit from customer and update the balance.
b) Display the balance.
c) Compute and deposit interest.
d) Permit withdrawal and update the balance.
Check for the minimum balance, impose penalty if necessary and update the balance */

/*////////////////////////////////////////////////////////////////////////////*/
import java.util.Scanner;


class bank{



}
abstract class account
{ 
  Scanner s=new Scanner(System.in);
  String name,acc_no,type;
  double balance=0;
  account(String n,String a,String t)
  {
    name=n;
    acc_no=a;
    type=t;
  }
abstract void deposit();
abstract void display();
abstract void withdrawal();
}
class saving extends account
{
 void deposit()
  {
   System.out.println("Enter the amount to deposit");
   double d=s.nextDouble();
  balance+=d;
  }
void withdrawal()
 {
  System.out.println("Enter the amount to Withdraw");
   double w=s.nextDouble();
  balance-=w;
  }
void display()
{
 System.out.println("The account no is : "+acc_no);
 double b=.06;
System.out.println("The balance is : "+balance);
  double interest=balance*b;
System.out.println("The balance is : "+interest);
     balance=balance+interest;
 System.out.println("The net balance is : "+balance);
}
 saving(String n,String a,String t)
 {
  super(n,a,t);
 int flag=1;

  System.out.println("Enter the choice 1.deposit  2.withdrawal 3.diplay balance 4.exit");
 int ch=s.nextInt();
while(flag==1)
{
 switch(ch)
  {
   case'1':deposit();
           break;
  case'2':withdrawal();
          break;
  case'3':display();
          break;
  case'4':flag=0;
break;
 
  }
  }
}
}
class week
 {
   public static void main(String args[])
  {
    saving n=new saving("shree","5634","save");
 }
}
   