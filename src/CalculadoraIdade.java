import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        //1 --> pegar o ano atual
        //2 --> pegar o ano de nascimento
        //3 --> subtrair ano atual de ano de nascimento

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o Ano atual :");
        int anoAtual =leitorTeclado.nextInt();

        System.out.println("Digite o Ano que Nasceu : ");
        int anoNascimento = leitorTeclado.nextInt() ;

        int resultado = anoAtual - anoNascimento;                ;



        System.out.println("A idade é :"+ resultado);
    leitorTeclado.close();
}
}
