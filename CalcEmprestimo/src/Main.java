import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double juros, valorFinal, valor;
        int parcelas = 0;
        String mensagem = "\nO valor final do seu emprestimo é de: R$";

        System.out.println("\nSimular emprestimo!\n");


        while(true) {

            System.out.print("Quanto deseja pegar: ");
            valor = scan.nextDouble();
            System.out.print("Em quantas vezes: ");
            parcelas = scan.nextInt();

            if (parcelas == 0 | parcelas == 1) {
                System.out.println("\nValor inválido");
            } else if (parcelas < 3) {
                juros = 0.2 * valor;
                valorFinal = valor + juros;
                System.out.println(mensagem + valorFinal + ". Valor por parcela: R$" + (valorFinal / parcelas));
            } else if (parcelas < 7) {
                juros = 0.35 * valor;
                valorFinal = valor + juros;
                System.out.println(mensagem + valorFinal + ". Valor por parcela: R$" + (valorFinal / parcelas));
            } else {
                juros = 0.55 * valor;
                valorFinal = valor + juros;
                System.out.println(mensagem + valorFinal + ". Valor por parcela: R$" + (valorFinal / parcelas));
            }

            System.out.print("\nDeseja continuar? 1 - Sim / 0 - Não: ");
            int result = scan.nextInt();
            if(result == 0)break;
        }

    }
}
