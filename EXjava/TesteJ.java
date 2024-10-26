package EXjava;
import java.util.Scanner;
public class TesteJ {
  public static void main(String[] args) {
    int opcoes = 0;
    Scanner teclado = new Scanner(System.in);
    while (opcoes != 3) { 
      System.out.println("Qual opcao você quer? ");
      System.out.println("[1] Calcular Imposto");
      System.out.println("[2] Depositar salario");
      System.out.println("[3] Sair");
      opcoes = teclado.nextInt();
      
      if (opcoes == 1) {
        System.out.println("Calculando imposto");
      } else if (opcoes == 2) {
        System.out.println("Depositar");
      } else if (opcoes == 3) {
        System.out.println("Saindo");
      } else {
        System.out.println("Opcao invalida");
      }
    }
  }
}
