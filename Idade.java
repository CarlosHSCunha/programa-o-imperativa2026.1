import java.util.Scanner;

public class Idade{
    public static Scannerinput = new Scanner(System.in);
    public static final int ANO_ATUAL = 2026
    //assim que cria um constante 

    public static void main(String[] args) {
        System.out.println("Digite a sua idade:");
        int idade = input.nextInt();
        if (idade >= 18) {
            System.out.println("Você já pode tirar carteira de motorista!");
        } else {
            System.out.println("Você ainda não pode tiar carteira de motorista!");
        }

        if ( idade < 16) {
            System.out.println("Você não pode votar!");
        } else if (idade > 18) {
            System.out.println("Você pode tirar o titulo de eleitor e votar!");
        } else if (idade < 70){
            System.out.println("Não é obrigatório votar!");
        } else {
            System.out.println("Você não tem obrigação de votar!");
        }
        // sempre que um se opor ao outro necessita de outro If 

        int anoNasc = ANO_ATUAL - idade;
        System.out.println("Você provavelmente nasceu em" + anoNasc);
    }
}