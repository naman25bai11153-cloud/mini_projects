import java.util.Scanner;

class calc{
    public static double amm(double interest,double principle, int time, int rate) {
        double amount = principle * Math.pow((1 + interest / rate), (rate * time));
        return amount;
    }
}

public class comp_int_calc{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your principle amount: ");
        double P = scanner.nextDouble();

        System.out.print("enter time period: ");
        int T = scanner.nextInt();

        System.out.print("enter rate of interest: ");
        double I = scanner.nextDouble();

        System.out.print("enter rate interest applied per year: ");
        int n = scanner.nextInt();

        double total_amount = calc.amm(I,P,T,n);
        System.out.println(total_amount);

    }
}
