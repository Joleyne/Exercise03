import java.util.Scanner;

//Joleyne Hernandez 01/28/24
public class Main {
    public static Scanner input = new Scanner(System.in);
    static double rFahr(double fahr){
        return fahr;
    }
    static double conVert(double fahr){
        double conVert = ((fahr-32)*5/9);
        return conVert;
    }
    static double disPlay(double fahr){
        System.out.println(fahr);
        return fahr;
    }

    public static void main(String[] args) {
        System.out.println("Please enter the temperature in Fahrenheit");
        double fahr = input.nextDouble();

        while(fahr > -460){
            double converTemp = conVert(fahr);
            disPlay(Math.round(converTemp*100.0)/100.0);
            System.out.println("Please enter the temperature in Fahrenheit");
            fahr = input.nextDouble();
        }
    }
}