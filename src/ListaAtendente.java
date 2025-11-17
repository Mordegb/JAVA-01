import java.util.ArrayList;
import java.util.Scanner;

public class ListaAtendente {

    private static atendente addpessoa(Scanner input){
        System.out.println("Digite o nome do atendente: ");
        String nome = input.nextLine();

        System.out.println("Digite a idade do atendente: ");
        int idade = Integer.parseInt(input.nextLine());

        System.out.println("Digite o salario do atendente: ");
        double salario = Double.parseDouble(input.nextLine());

        System.out.println("Digite o nivel de acesso do atendente: ");
        int nivelDeAcesso = Integer.parseInt(input.nextLine());

        atendente atd = new atendente(nome,idade,salario,nivelDeAcesso);
        return atd;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        atendente atd = addpessoa(input);
        ArrayList<atendente> lista = new ArrayList<>();
        lista.add(atd);


    }
}
