
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

import java.util.Scanner;

class Account {
    Scanner s = new Scanner(System.in);
    public String name;
    long accountnum;
    int accountType;
    
}

class currentAccount extends Account {
    double penaltyPercent = 0.04;
    double balance = 0;

    void creation() {
        System.out.println("enter your name");
        name = s.nextLine();
        System.out.println("enter account number");
        accountnum = s.nextLong();
        System.out.println("enter amount greater than 5000 rupees");
        double x=s.nextDouble(); 
        if(x<500)
       System.out.println("insufficient amount to open the account");
       else
        balance =x;
    }
    void balance() {
        if (balance < 1000) {
            Double penalty = balance * penaltyPercent;
            balance -= penalty;
            System.out.println("penalty amount reduced because of low balance " + penalty + " rupees");
        }
        System.out.println("your account balance is " + balance);
    }

    void chequeBook() {
        System.out.println("you can avail chequeBook");
    }

    void deposit() {
        System.out.println("enter amount you want to deposit");
        balance += s.nextDouble();
    }

    void withdraw() {
        if (balance < 1000) {
            System.out.println("your account balance is lower than 1000 rupees so you can't withdraw");
        } else {
            System.out.println("enter amount you want to withdraw");
            double t=s.nextDouble();
            if(t>balance)
               System.out.println("insufficient amount");
           else
            balance -=t;
        }
        balance();
    }
}

class savingAccount extends Account {
    double interest = 6;
    int year;
    double balance = 0;

    void creation() {
        System.out.println("enter your name");
        name = s.nextLine();
        System.out.println("enter account number");
        accountnum = s.nextLong();
        System.out.println("enter amount to open account");
       balance = s.nextDouble();
     
    }
    void chequeBook() {
        System.out.println("you can't avail chequeBook");
    }

    void balance() {
       System.out.println("enter the year passed after deposition of amount");
         year = s.nextInt();
        balance += (balance * interest*year/100 );
        System.out.println("your account balance is " + balance);
    }

    void deposit() {
        System.out.println("enter amount you want to deposit");
        balance += s.nextDouble();
    }

    void withdraw() {

            System.out.println("enter amount you want to withdraw");
            double t=s.nextDouble();
        if (balance<t) 
            System.out.println("insufficient amount to wirthdraw");
        else
            balance -=t;
          System.out.println("the balance is "+balance);     
        
    }
}

 class bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter account type you want to have\n 1. for currentAccount\n2. for savingAccount");
        int n = s.nextInt();
        if (n == 1) {
            currentAccount c = new currentAccount();
            c.creation();
            Boolean b = true;
            while (b) {
                System.out.println("\n enter 1 for deposit\n2 for withdraw\n3 for balance\n4 for cheque book\n5 to exit");
                int ch = s.nextInt();
                switch (ch) {
                    case 1:
                        c.deposit();
                        break;
                    case 2:
                        c.withdraw();
                        break;
                    case 3:
                       C;
                        break;
                    case 4:  System.out.println(" enter 1.Withdraw using cheaue  2.deposit using cheaue");
                          int x=s.nextInt();
                          if(x==1)
                          c.withdraw();
                          if(x==2){
                           c.deposit();

                        break;
                    case 5:
                        System.out.println("Successfully logged out of your account");
                        b = false;
                        break;
                    default:
                        System.out.println("invalid input");
                        break;
                }
            }
        } else {
            Boolean b = true;
            savingAccount sa = new savingAccount();
            sa.creation();
            while (b) {
                System.out.println("\n enter 1 for deposit\n2 for withdraw\n3 for balance\n4 for cheque book\n5 to exit");
                int ch = s.nextInt();
                switch (ch) {
                    case 1:
                        sa.deposit();
                        break;
                    case 2:
                        sa.withdraw();
                        break;
                    case 3:
                        sa.balance();
                        break;
                    case 4:
                        sa.chequeBook();
                        break;
                    case 5:
                        System.out.println("Successfully logged out of your account");
                        b = false;
                        break;
                    default:
                        System.out.println("invalid input");
                        break;
                }
            }
        }
        s.close();
    }
}