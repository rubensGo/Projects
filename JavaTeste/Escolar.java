import java.util.Scanner;
import java.time.LocalDate;

public class Escolar {
  /*
   * Cria um programa que armazena os nomes dos (5 alunos) de uma turma
   * mas na segunda vem todo mundo (8 alunos)
   * e imprime esses nomes
   */

  /*---Atualização do sistema--- 
   * Cria um programa que cria um gmail para cada aluno e uma senha para cada aluno
   * Ex.: Nome: Pedro da Silva; Email: pedro-silva@gmail.com; Senha: pedro<aqui coloque o ano atual>
   * Deixe o dia da semana automatico sem presizar escrever o dia da semana
  */
  public static void main(String[] args) {
    System.out.println("");
    String day2 = LocalDate.now().getDayOfWeek().toString();
    int ano = LocalDate.now().getYear();

    if (day2.equalsIgnoreCase("Monday")) {
      String[][] nomeAlunosEhSobrenome = new String[2][9];

      for (int i = 0; i < 8; i++) {
        System.out.println("Nome do Aluno " + (i + 1));
        Scanner aluno = new Scanner(System.in);
        nomeAlunosEhSobrenome[0][i] = aluno.nextLine();

        System.out.println("Sobrenome do Aluno " + (i + 1));
        Scanner sobrenomeDoAluno = new Scanner(System.in);
        nomeAlunosEhSobrenome[1][i] = sobrenomeDoAluno.nextLine();

        String[][] gmailEhSenha = new String[2][9];
        gmailEhSenha[0][i] = nomeAlunosEhSobrenome[0][i] + "-" + nomeAlunosEhSobrenome[1][i] + "@gmail.com";
        gmailEhSenha[1][i] = nomeAlunosEhSobrenome[0][i] + ano;

        System.out.println("Seu gmail " + nomeAlunosEhSobrenome[0][i] + " eh este " + gmailEhSenha[0][i]);
        System.out.println("e sua senha eh " + gmailEhSenha[1][i]);
        if (i >= 8) {
          System.out.println("Todas as conta dos alunos foram criadas");
        }
      }
    } else {

      String[][] nomeAlunosEhSobrenome = new String[2][6];
      String[][] gmailEhSenha = new String[2][6];

      for (int i = 0; i < 5; i++) {
        System.out.println("Nome do Aluno " + (i + 1));
        Scanner aluno = new Scanner(System.in);
        nomeAlunosEhSobrenome[0][i] = aluno.nextLine();

        System.out.println("Sobrenome do Aluno " + (i + 1));
        Scanner sobrenomeDoAluno = new Scanner(System.in);
        nomeAlunosEhSobrenome[1][i] = sobrenomeDoAluno.nextLine();

        gmailEhSenha[0][i] = nomeAlunosEhSobrenome[0][i] + "-" + nomeAlunosEhSobrenome[1][i] + "@gmail.com";
        gmailEhSenha[1][i] = nomeAlunosEhSobrenome[0][i] + ano;

        System.out.println(nomeAlunosEhSobrenome[0][i] + " Seu gmail e este " + gmailEhSenha[0][i]);
        System.out.println(" e sua senha e " + gmailEhSenha[1][i]);
        if (i == 5) {
          System.out.println("Todas as conta dos alunos foram criadas");
        }
      }
    }
  }
}
