import java.util.Scanner;
public class banking {

    static double Money  = 0;

    static void deposit(double x){
        Money = x + Money;
        System.out.println("Money deposited");
        System.out.printf("current balance is %.2f%n", Money);
    }

    static void withdraw(double x){
        if(Money>=x){
            Money = Money - x;
            System.out.println("Money withdrawn");
            System.out.println("current balance is: "+  Money);
        }else{
            System.out.println("you do not have that much money");
        }


    }
    static void balance(){
        System.out.println(Money);
    }
    static void menu(){
        System.out.println("choose your task: ");
        System.out.println("1) withdraw");
        System.out.println("2) deposit");
        System.out.println("3) show balance");
        System.out.println("4) exit");
        System.out.println("________________________________________");

    }

    public static void main(String[] args) {
        int X;
        Scanner scan = new Scanner(System.in);

        do{
            menu();
            X = scan.nextInt();
            if(X == 1){
                System.out.print("enter the amount you want to withdraw: ");
                double x = scan.nextDouble();
                withdraw(x);
            } else if(X == 2){
                System.out.print("enter the amount you want to deposit: ");
                double x = scan.nextDouble();
                deposit(x);
            } else if(X == 3){
                balance();
            }else{
                System.out.println("invalid input");
            }
        }while(X != 4);
    }
}
