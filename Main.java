import java.util.Scanner;

// kg/m^2
public class Main {
    public static double weight;
    public static double height;
    public static double BMI;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("\n\tBody_Mass_Index");

        System.out.print("\nPleas enter your WEIGHT (KG):\t");
        weight= scanner.nextDouble();

        System.out.print("\nPleas enter your HEIGHT (CM):\t");
        height= scanner.nextDouble();

        BMI=(weight/(height/100));
        System.out.println("\n\tBody Mass Index=\t"+BMI);

        System.out.println("\n\tPROGRAM IS OVER");
    }
}