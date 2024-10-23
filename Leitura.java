import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, txtCodigo;
        int codigo;

        System.out.println("Digite seu codigo: ");
        txtCodigo = teclado.nextLine();
        codigo = Integer.parseInt(txtCodigo);
        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Seu codigo  e nome:" + codigo + " - " + nome);
        teclado.close();

    }

}