import java.util.Scanner;

public class LoopComWhileNumeroPar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor :");
        int contador = scanner.nextInt();
        int valor = 2;


        // se o valor for incrementado  ++ significa que vai somar de 1 em 1

        while (valor <= contador) {
            if (valor % 2 == 0) { // o sinal de ' % ' que dizer que se valor for dividido por 2 o resultado '==' for igual a zero siginifica que o numero é par

                System.out.println(valor);
        }
            valor = valor + 1;
        }




    }
}
