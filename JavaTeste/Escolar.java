import java.util.Scanner;

public class Escolar {
  /*Cria um programa que armazena os nomes dos (5 alunos) de uma turma
    * mas na segunda vem todo mundo (8 alunos)
   * e imprime esses nomes
   */
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Qual o dia da semana?");
    Scanner diaDaSemana = new Scanner(System.in);
    String day = diaDaSemana.nextLine();

    if (day.equalsIgnoreCase("segunda")) {
      String[] nomeAlunos = new String[9];
      Scanner aluno = new Scanner(System.in);

      
      for (int i = 0; i < 8; i++) {
        System.out.println("Nome do Aluno "+ (i+ 1));
        nomeAlunos[i] = aluno.nextLine();
      }
      System.out.println("Nome dos Alunos");
      for (int i = 0; i < 8; i++) {
        System.out.println(nomeAlunos[i]);
      }

    }else {
      String[] nomeAlunos = new String[6];
      Scanner aluno = new Scanner(System.in);

      for (int i = 0; i < 5; i++) {
        System.out.println("Nome do Aluno "+ (i+ 1));
        nomeAlunos[i] = aluno.nextLine();
      }
      System.out.println("Nome dos Alunos");
      System.out.println("Os nome dos alunos sao:");
      for (int i = 0; i < 5; i++) {
        System.out.println(nomeAlunos[i]);
      }
      aluno.close();
    diaDaSemana.close();
    }
  }
}

