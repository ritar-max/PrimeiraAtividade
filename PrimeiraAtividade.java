
import java.util.Scanner;

public class InformacoesPessoais {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome = "Rita";
        int idade = 17;
        String cidade = "Serra Caiada";
        String curso = "Informatica";

        System.out.println("MINHAS INFORMACOES");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Curso: " + curso);

        entrada.close();
    }
}
