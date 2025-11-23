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

if ( resultado<=18){
    System.out.println("Você é menor de idade (18 anos)! Você tem "+resultado+" anos");
}
else if (resultado >= 18 & resultado <= 60){
        System.out.println("Você é maior de idade (18 anos! Você tem "+resultado+" anos)");
}
else {
    System.out.println("Você é idoso! (+60 anos)! Você tem "+resultado+" anos");
}




        //System.out.println("A idade é :"+ resultado);

    leitorTeclado.close();
}
}
