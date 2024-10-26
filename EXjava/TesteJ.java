package EXjava;
import java.util.Scanner;

public class TesteJ {
  public static void main(String[] args) {
    System.out.println(" ");
    System.out.println("Degite seu nome de usuario: ");
    Scanner nome = new Scanner(System.in);
    String username = nome.nextLine();
    System.out.println("Confirme a sua senha: ");
    Scanner senha = new Scanner(System.in);
    String password = senha.nextLine();
    if (username.equals("timeP") && password.equals("topP")) {
      System.out.println("BEM VINDO "+ username);
    }else {
      System.out.println("ACESSO NEGADO, TENTE NOVAMNTE!");
    }
  }
}
