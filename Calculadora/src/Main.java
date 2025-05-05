import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Aritmetica calcs = new Aritmetica();

        int escolha = 0;

        while(true) {

            escolha = 0; // Reseta a "escolha" do user, caso haja uma exception o valor da variavel permanece o mesmo do loop anterior
            System.out.println("\nCalculadora!\n");
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n");

            System.out.print("Digite sua opção: ");
            try {
                escolha = scan.nextInt();
            } catch (InputMismatchException e){} // Caso entre aqui, o default no switch é executado

            switch (escolha) {

                case 1 -> {
                    calcs.somar();
                    break;
                }

                case 2 -> {
                    calcs.subtrair();
                    break;
                }

                case 3 -> {
                    calcs.mult();
                    break;
                }

                case 4 -> {
                    calcs.div();
                    break;
                }

                default -> {
                    System.out.println("\nParece que você digitou um valor inválido. Tente novamente!");
                    break;
                }
            }

            scan.nextLine(); // Limpa o buffer pra nao ter problemas em caso de exceçoes
            System.out.print("\n\nDeseja continuar? (1 - Sim / 2 - Nao) : ");
            int resposta =  scan.nextInt();

            if(resposta == 1)continue;
                else break; // Interrompe o "while"
        }
    }
}
