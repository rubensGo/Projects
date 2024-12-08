
import javax.swing.JOptionPane;

public class Tasks {

    public static void main(String[] args) {
        System.out.println(" ");

        String opcoes = JOptionPane.showInputDialog("Choose the quantity of options: ");
        int quantidadeDeOpcoes = Integer.parseInt(opcoes);
        System.out.println(" ");
        String[] nameTasks = new String[quantidadeDeOpcoes];
        while (true) {
            String painelPrimario = JOptionPane.showInputDialog("""
                    1. Add to Tasks
                    2. Remove tasks
                    3. List tasks
                    4. Exit""");
            int escolha = Integer.parseInt(painelPrimario);
            
            switch (escolha) {
                case 1:
                    if (quantidadeDeOpcoes > 0) {
                        for (int i = 0; i < quantidadeDeOpcoes; i++) {
                            if (nameTasks[i] == null) {
                                String nameTask = JOptionPane.showInputDialog("Add to " + (i + 1) + "st tasks");
                                JOptionPane.showMessageDialog(null, "Task added " + (i + 1) + ": " + nameTask);
                                nameTasks[i] = nameTask;
                            }else {
                                JOptionPane.showMessageDialog(null,("Oops you tried to add things that were not created"));
                                break;
                            }
                            String continueS = JOptionPane.showInputDialog("Do you want to continue? (No/Yes)");
                            if (continueS.equalsIgnoreCase("no")) {
                                break;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, ("No tasks to add"));
                        break;
                    }
                    break;
                case 2:
                    String remover = JOptionPane.showInputDialog("How many tasks do you want to remove?");
                    int quantidadeDeRemocoes = Integer.parseInt(remover);

                    int removidas = 0; // Contador de tarefas removidas
                    for (int i = 0; i < quantidadeDeOpcoes; i++) {
                        if (removidas >= quantidadeDeRemocoes)
                            break; // Sai do loop se já removeu o suficiente
                        if (nameTasks[i] != null) {
                            if (quantidadeDeRemocoes > quantidadeDeOpcoes) {
                                JOptionPane.showMessageDialog(null,("Oops you tried to remove things that were not created"));
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null,("Task removed " + (i + 1) + ": " + nameTasks[i]));
                                nameTasks[i] = null; // Remove a tarefa
                                removidas++;
                            }
                        }
                    }
                    break;
                case 3:
                    boolean hasTasks = false;
                    JOptionPane.showMessageDialog(null,("List tasks:"));
                    for (int i = 0; i < quantidadeDeOpcoes; i++) {
                        if (nameTasks[i] != null) {
                            JOptionPane.showMessageDialog(null, ("Task " + (i + 1) + ": " + nameTasks[i]));
                            hasTasks = true;
                        }
                    }
                    if (!hasTasks) {
                        JOptionPane.showMessageDialog(null,("[No tasks to list]"));
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, ("Exiting..."));
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,("Invalid option"));
                    break;

            }
        }
    }
}