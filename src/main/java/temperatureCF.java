import java.util.Scanner;

public class temperatureCF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Please enter number to choose:");
            System.out.println(" 1 if you want Celsius to Fahrenheit");
            System.out.println(" 2 if you want Fahrenheit to Celsius");
            System.out.println(" 0 to exit");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
                default:
                    System.out.println("Please enter different number!");
                    break;
            }
        } while (choice != 0);

    }
    public static double celsiusTo(double celsius) {
        return (9.0/5)*celsius + 32;

    }
    public static double fahrenheitTo(double fahrenheit) {
        return  (5.0/9)*(fahrenheit - 32);
    }
    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        System.out.println("Please enter Celsius");
        celsius = scanner.nextDouble();
        System.out.println("From "+celsius+" Celsius to "+ celsiusTo(celsius) + " Fahrenheit");

    }
    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;

        System.out.println("Please enter Fahrenheit");
        fahrenheit = scanner.nextDouble();
        System.out.println("From "+ fahrenheit+ " Fahrenheit to "+fahrenheitTo(fahrenheit)+ " Celsius");

    }
}
