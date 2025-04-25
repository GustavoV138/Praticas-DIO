import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Aritmetica calcs = new Aritmetica();

        int escolha = 0;

        while(true) {

            System.out.println("\nCalculadora!\n");
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n");

            System.out.print("Digite sua opção: ");
            escolha = scan.nextInt();

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
                    System.out.println("Parece que você digitou algo errado. Tente novamente!");
                    break;
                }
            }

            System.out.print("\n\nDeseja continuar? (1 - Sim / 2 - Nao) : ");
            int resposta =  scan.nextInt();

            if(resposta == 1)continue;
                else break;
        }
    }
}
