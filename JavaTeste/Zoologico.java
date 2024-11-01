import java.util.Scanner;

public class Zoologico {
  /*
   * Cria uma programa que armazena a quantidade de pernas que tem um animal
   * e também armazena o nome do animal.
   * imprima essas informaçoes
   */
  public static void main(String[] args) {
    System.out.println(" ");
    System.out.print("Quantos animais você vai registar? ");
    Scanner quantidad = new Scanner(System.in);
    int quantidade = quantidad.nextInt();
    int macho = 0;
    int femea = 0;

    String[] nomeDosAnimais = new String[quantidade];
    int[] patasDosAnimais = new int[quantidade];
    String[] generoAnimais = new String[quantidade];

    for (int i =0;i < quantidade; i++) {
      
      System.out.println("Escreva o Nome Do Animal: ");
      Scanner nome = new Scanner(System.in); 
      nomeDosAnimais[i] = nome.nextLine();

      System.out.println("Qual é o genero [M/F] ");
      Scanner generoScam = new Scanner(System.in);
      generoAnimais[i] = generoScam.nextLine();
      if (generoAnimais[i].equalsIgnoreCase("M")) {
        macho += 1;
      } else {
        femea += 1;
      }
      System.out.print("Quantas Patas ele(a) Tem? ");
      Scanner quantidadeDePatas = new Scanner(System.in);
      patasDosAnimais[i] = quantidadeDePatas.nextInt();
    
    System.out.println("Nome dos Animais: "+ nomeDosAnimais[i]);
    System.out.println("A quantidade De Patas que Ele(a) tem: "+ patasDosAnimais[i]);
    System.out.println("Quantidade de macho: "+ macho);
    System.out.println("Quantidade De Femeas: "+ femea);
    }
  }
}
