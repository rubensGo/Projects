import java.util.Scanner;
import java.time.LocalDate;
public class Escolar {
  /*Cria um programa que armazena os nomes dos (5 alunos) de uma turma
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
      String[] nomeAlunos = new String[9];
      String[] sobrenome = new String[9];

      for (int i = 0; i < 8; i++) {
        System.out.println("Nome do Aluno "+ (i+ 1));
        Scanner aluno = new Scanner(System.in);
        nomeAlunos[i] = aluno.nextLine();
        
        System.out.println("Sobrenome do Aluno "+ (i+ 1));
        Scanner sobrenomeDoAluno = new Scanner(System.in);
        sobrenome[i] = sobrenomeDoAluno.nextLine();

        String[] gmail = new String[9];
        String[] senha = new String[9];
        gmail[i] = nomeAlunos[i]+"-"+sobrenome[i] + "@gmail.com";
        senha[i] = nomeAlunos[i]+ ano;

        System.out.println("Seu gmail "+ nomeAlunos[i] + " e este " + gmail[i]);
        System.out.println("e sua senha eh " + senha[i]);
        if (i >=8) {
          System.out.println("Todas as conta dos alunos foram criadas");
        }
      }
    }else {
      String[] nomeAlunos = new String[6];
      
      String[] gmail = new String[6];
      String[] senha = new String[6];
      String[] sobrenome = new String[6];

          for (int i = 0; i < 5; i++) {
            System.out.println("Nome do Aluno "+ (i+ 1));
            Scanner aluno = new Scanner(System.in);
            nomeAlunos[i] = aluno.nextLine();

            System.out.println("Sobrenome do Aluno "+ (i+ 1));
            Scanner sobrenomeDoAluno = new Scanner(System.in);
            sobrenome[i] = sobrenomeDoAluno.nextLine();

            gmail[i] = nomeAlunos[i]+"-"+sobrenome[i] + "@gmail.com";
            senha[i] = nomeAlunos[i] + ano;
            
            System.out.println(nomeAlunos[i]+ " Seu gmail e este " + gmail[i]);
            System.out.println(" e sua senha e " + senha[i]);
            if (i == 5) {
              System.out.println("Todas as conta dos alunos foram criadas");
              }
      }
    }
  }
}

