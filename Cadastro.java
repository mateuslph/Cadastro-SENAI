import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    static Scanner entrada = new Scanner(System.in);
    static List<Object> cadastro = new ArrayList<Object>();
    static String seguir = "s";
    static int qntDeParticipantes = 0;
    static int idade;
    static String nome;
    static String evento;

    public static void main(String[] args) {

        while (seguir.equals("s")) {
            if (qntDeParticipantes < 100) {
                System.out.println("Informe a seu nome");
                nome = entrada.next();
                System.out.println("Informe o evento");
                evento = entrada.next();
                System.out.println("Informe a sua idade");
                idade = entrada.nextInt();
                qntDeParticipantes++;
            } else {
                System.out.println("Cadastro não é permitido pelo excesso de participantes!");
            }

            if (idade > 18) {
                cadastro.add(nome);
                cadastro.add(Integer.toString(idade));
            } else {
                System.out.println("Cadastro não é permitido pela idade!");
            }

            System.out.println("Digite s para adicionar mais.");
            seguir = (String)entrada.next();
        }
        entrada.close();

        System.out.println("Lista dos cadastrados a seguir:");
        for(int i = 0;i<cadastro.size();i++) {
            String exibe = (String) cadastro.get(i);
            System.out.println(exibe);
        }
    }
}
