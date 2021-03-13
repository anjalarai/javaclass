package lab1;
import java.util.Scanner;

public class BankAccount {

    String name;
    double initialBalance;
    double deposit1;
    double withdraw1;
    double total=0;
    static int accountNumber;

    public BankAccount(int num)
    {
        accountNumber = num;
        System.out.println("Account number "+accountNumber);
    }

    public void openAccount(Scanner data)
    {
        String ans;

        System.out.println("Enter name: ");
        name = data.next();

        System.out.println("Do you wish to deposit? (y or n)");
        ans = data.next();

        if(new String("Y").equals(ans) || new String("y").equals(ans))
        {
            System.out.println("Enter balance: ");
            initialBalance = data.nextInt();
        }

        else
        {
            initialBalance = 0;
        }
        System.out.println("Welcome your new balance is"+initialBalance+".");

    }

    public void depositMoney(Scanner data)
    {
        System.out.println("Depositing Amount?");
        deposit1 = data.nextDouble();

        if(deposit1>=1000)
        {
            depositMoney(5);
            System.out.println("You have deposited $"+deposit1+" with interest rate of 5% ");
        }

        else
        {
            System.out.println("Deposit successful! You have deposited $"+deposit1+".");
            total = initialBalance + deposit1;
        }
        System.out.println(""+name+" has $"+total+" in the account");
        initialBalance = total;
    }

    public void withdrawMoney(Scanner data)
    {
        System.out.println("Amount you want to withdraw!");
        withdraw1 = data.nextDouble();

        if(withdraw1>initialBalance)
        {
            System.out.println(" Denied");
            System.out.println("You have $"+initialBalance+" in your account.");
        }

        else
        {
            if(withdraw1>=400)
            {
                withdrawMoney(100);
                System.out.println(""+name+" has $"+total+" in the account.");
            }

            else
            {
                total = initialBalance - withdraw1;
                System.out.println("" + name + " has $" + total + " in the account.");
                //initialBalance = total;
            }
            initialBalance = total;
        }
    }

    public void withdrawMoney(double rate)
    {
        total = initialBalance - (rate/100) -withdraw1;
    }

    public void depositMoney(double interest)
    {
        total = (initialBalance + deposit1)*(interest*0.01+1);
    }

    public void accountInfo()
    {
        System.out.println("Account number: "+accountNumber);
        System.out.println("Name: "+name);
        System.out.println("Amount remaining: "+initialBalance);
    }
    // main method to call the the other methods and do main task
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);

        BankAccount obj1 = new BankAccount(123456789);
        obj1.openAccount(data);

        int a = 1;
        while(a!=0)
        {
            System.out.println("Welcome. Please select from following");
            System.out.println("    1. Withdraw ");
            System.out.println("    2. Deposit ");
            System.out.println("    3. Account details.");
            System.out.print(" Or, press any other key to exit the program.\n\n");

            int selection = data.nextInt();

            if(selection == 1) // meaning open new account
            {
                obj1.withdrawMoney(data);
            }

            else if(selection == 2)
            {
                obj1.depositMoney(data);
            }

            else if(selection == 3)
            {
                obj1.accountInfo();
            }
            else
            {
                System.exit(0);
                a = 0;
            }

        }

    }
}
