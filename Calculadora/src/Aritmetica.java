import java.util.Scanner;

public class Aritmetica {

    Scanner scan = new Scanner(System.in);

    public void somar(){

        System.out.print("Pimeiro valor: ");
        double a = scan.nextDouble();
        System.out.print("Segundo valor: ");
        double b = scan.nextInt();

        System.out.print("\nO resultado da operação é: " + (a + b));
    }

    public void subtrair(){

        System.out.print("Pimeiro valor: ");
        double a = scan.nextDouble();
        System.out.print("Segundo valor: ");
        double b = scan.nextInt();

        System.out.print("\nO resultado da operação é: " + (a - b));
    }

    public void mult(){

        System.out.print("Pimeiro valor: ");
        double a = scan.nextDouble();
        System.out.print("Segundo valor: ");
        double b = scan.nextInt();

        System.out.print("\nO resultado da operação é: " + (a * b));
    }

    public void div(){

        System.out.print("Pimeiro valor: ");
        double a = scan.nextDouble();
        System.out.print("Segundo valor: ");
        double b = scan.nextInt();

        System.out.print("\nO resultado da operação é: " + (a / b));
    }
}
