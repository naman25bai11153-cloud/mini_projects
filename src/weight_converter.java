import java.util.Scanner;
class weight_con{
    public static double kg_lbs(double value){
        double CV = value * 2.20462;
        return CV;
        }
    public static double lbs_kg(double value){
        double CV = value / 2.20462;
        return CV;
    }
}

public class weight_converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the unit you want to convert from: ");
        String K = scan.next();
        System.out.print("enter the unit you want to convert to: ");
        String G = scan.next();
        System.out.print("enter the value");
        Double V = scan.nextDouble();
        if (K.equalsIgnoreCase("kg") && G.equalsIgnoreCase("lbs")){
            double B = weight_con.kg_lbs(V);
            System.out.println(B+" lbs");
        }
        if (G.equalsIgnoreCase("kg") && K.equalsIgnoreCase("kg")){
            double B = weight_con.lbs_kg(V);
            System.out.printf(B+" kg");
        }

    }

}
