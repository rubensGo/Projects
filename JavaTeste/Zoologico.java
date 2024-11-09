import java.util.Scanner;

public class Zoologico {
  /*
   * Cria uma programa que armazena a quantidade de pernas que tem um animal.
   * e também armazena o nome do animal.
   * imprima essas informaçoes.
   */
  /* --- Atualização do Sistema ---
   * mostre qual é maior quantidade de patas ou olhos.
   * e cria uma tabela que so aceitara os animais da tabela EX: (cão) se eu colocar gato, o programa nao pode aceitar. 
   * cada posiçao da tabela deve ter um animal diferente.
   */
  public static void main(String[] args) {
    System.out.println(" ");
    System.out.print("Quantos animais você vai registar? ");
    Scanner quantidad = new Scanner(System.in);
    int quantidade = quantidad.nextInt();

    String[][] nomeDosAnimaisEhGenero = new String[2][quantidade];
    int[][] patasEhOlhos = new int[2][quantidade];
    
    for (int i =0;i < quantidade; i++) {
      System.out.println("""
          -------------------------------
          |[Gato] | [girafa] | [Cavalo] |
          |[Pato] | [Elefante] | [Cobra]|
          -------------------------------""");

      System.out.println("Escreva o Nome Do Animal: ");
      Scanner nome = new Scanner(System.in); 
      nomeDosAnimaisEhGenero[0][i] = nome.nextLine();
      if (nomeDosAnimaisEhGenero[0][i].equalsIgnoreCase("gato") || nomeDosAnimaisEhGenero[0][i].equalsIgnoreCase("girafa")
      || nomeDosAnimaisEhGenero[0][i].equalsIgnoreCase("cavalo") || nomeDosAnimaisEhGenero[0][i].equalsIgnoreCase("pato")
      || nomeDosAnimaisEhGenero[0][i].equalsIgnoreCase("elefante") || nomeDosAnimaisEhGenero[0][i].equalsIgnoreCase("cobra")) {
      
      System.out.println("Qual é o genero [M/F] ");
      Scanner generoScam = new Scanner(System.in);
      nomeDosAnimaisEhGenero[1][i] = generoScam.nextLine();

      System.out.print("Quantas Patas ele(a) Tem? ");
      Scanner quantidadeDePatas = new Scanner(System.in);
      patasEhOlhos[0][i] = quantidadeDePatas.nextInt();

      System.out.println("Quantos Olhos ele(a) Tem? ");
      Scanner quantidadeDeOlhos = new Scanner(System.in);
      patasEhOlhos[1][i] = quantidadeDeOlhos.nextInt();
    
      if (nomeDosAnimaisEhGenero[1][i].equalsIgnoreCase("M")) {
        System.out.println("O animal "+nomeDosAnimaisEhGenero[0][i]+" é macho");
      } else {
        System.out.println("O animal "+nomeDosAnimaisEhGenero[0][i]+" é femea");
      }
      System.out.println("A quantidade De Patas que Ele(a) tem: "+ patasEhOlhos[0][i]);
      System.out.println("A quantidade De Olhos que Ele(a) tem: "+ patasEhOlhos[1][i]);
      System.out.println(" ");
      }
    }
    quantidad.close();
  }
}
