import java.util.Scanner;

public class Zoologico {

    public static void main(String[] args) {
        // Scanner deve ser criado uma vez no início
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos animais você vai registrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        // Definir arrays para armazenar informações dos animais
        String[][] nomeDosAnimaisEhGenero = new String[2][quantidade]; // [0] = nomes, [1] = gêneros
        int[][] patasEhOlhos = new int[2][quantidade]; // [0] = patas, [1] = olhos

        // Definir lista de animais permitidos
        String[] animaisPermitidos = { "gato", "girafa", "cavalo", "pato", "elefante", "cobra" };

        // Laço para registrar os animais
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n-------------------------------");
            System.out.println("| [Gato] | [Girafa] | [Cavalo] |");
            System.out.println("| [Pato] | [Elefante] | [Cobra] |");
            System.out.println("-------------------------------");

            // Perguntar o nome do animal
            System.out.print("Escreva o Nome do Animal: ");
            String nomeAnimal = scanner.nextLine().toLowerCase(); // Garantir que o nome seja em minúsculas

            // Verificar se o animal está na lista de animais permitidos
            boolean animalValido = false;
            for (String animal : animaisPermitidos) {
                if (nomeAnimal.equals(animal)) {
                    animalValido = true;
                    break;
                }
            }

            if (animalValido) {
                // Registrar o nome e o gênero
                nomeDosAnimaisEhGenero[0][i] = nomeAnimal;

                System.out.print("Qual é o gênero [M/F]: ");
                nomeDosAnimaisEhGenero[1][i] = scanner.nextLine();

                // Registrar a quantidade de patas e olhos
                System.out.print("Quantas patas ele(a) tem? ");
                patasEhOlhos[0][i] = scanner.nextInt();

                System.out.print("Quantos olhos ele(a) tem? ");
                patasEhOlhos[1][i] = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                // Exibir informações sobre o animal
                if (nomeDosAnimaisEhGenero[1][i].equalsIgnoreCase("M")) {
                    System.out.println("O animal " + nomeDosAnimaisEhGenero[0][i] + " é macho.");
                } else {
                    System.out.println("O animal " + nomeDosAnimaisEhGenero[0][i] + " é fêmea.");
                }
                System.out.println("Quantidade de patas: " + patasEhOlhos[0][i]);
                System.out.println("Quantidade de olhos: " + patasEhOlhos[1][i]);
            } else {
                System.out.println("Esse animal não é permitido no zoológico.");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
