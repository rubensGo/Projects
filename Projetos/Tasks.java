import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        System.out.println(" ");

        System.out.println("Choose the quantity of options: ");
        Scanner quant = new Scanner(System.in);
        int quantidadeDeOpcoes = quant.nextInt();

        String[] nameTasks = new String[quantidadeDeOpcoes];
        while (true) {
            System.out.println("""
                    1. Add to Tasks
                    2. Remove tasks
                    3. List tasks
                    4. Exit
                    """);
            System.out.println("Choose an option: ");
            Scanner sc = new Scanner(System.in);
            int escolha = sc.nextInt();

            
            switch (escolha) {
                case 1:
                    Scanner tasksAdd = new Scanner(System.in);
                    //String[] nameTasks = new String[quantidadeDeOpcoes];
                    
                    if (quantidadeDeOpcoes > 0) {
                        for (int i = 0; i < quantidadeDeOpcoes; i++) {
                            System.out.println("Add to "+(i+1) +"st tasks");
                            nameTasks[i] = tasksAdd.nextLine();
                            System.out.println(" ");
                        }
                    } else {
                        System.out.println("No tasks to add");
                        System.out.println(" ");
                        break;
                    }
                    break;
                case 2:
                    Scanner tasksRemove = new Scanner(System.in);
                    System.out.println("How many tasks do you want to remove?");
                    int quantidadeDeRemocoes = tasksRemove.nextInt();

                    int removidas = 0; // Contador de tarefas removidas
                    for (int i = 0; i < quantidadeDeOpcoes; i++) {
                        if (removidas >= quantidadeDeRemocoes) break; // Sai do loop se já removeu o suficiente
                        if (nameTasks[i] != null) {
                            if (quantidadeDeRemocoes > quantidadeDeOpcoes) {
                                System.out.println("Oops you tried to remove things that were not created");
                                break;
                            }else {
                            System.out.println("Task removed " + (i + 1) + ": " + nameTasks[i]);
                            System.out.println(" ");
                            nameTasks[i] = null; // Remove a tarefa
                            removidas++;
                            }
                    }
                }
                    break;
                case 3:
                    boolean hasTasks = false;
                    System.out.println("List tasks:");
                    for (int i = 0; i < quantidadeDeOpcoes; i++) {
                        if (nameTasks[i] != null) {
                        System.out.println("Task " + (i + 1) + ": " + nameTasks[i]);
                        hasTasks = true;
                        }
                    }
                    if (!hasTasks) {
                        System.out.println("[No tasks to list]");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    quant.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            
            }
        }
    }
}
