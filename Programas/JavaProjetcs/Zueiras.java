import java.net.URI;
import javax.swing.JOptionPane;

public class Zueiras {
    public static void main(String[] args) {
        //Pedir se tem uma conta
        String tem = JOptionPane.showInputDialog("Tu possui uma conta? (S/N)");
        String Criar = String.valueOf(tem);
        
        if (Criar.equals("N") || Criar.equals("n")) {
        
            String sim = JOptionPane.showInputDialog("Deseja criar uma conta? (S/N)");
            String Criar1 = String.valueOf(sim);
            // processo de criar cancelado
            if (Criar1.equals("N") || Criar1.equals("n")) {
                JOptionPane.showMessageDialog(null, ("Processo de criar conta cancelado"));
                System.exit(0);
            }
            // processo de criar
            if (Criar1.equals("S") || Criar1.equals("s")) {
            JOptionPane.showMessageDialog(null,("Começar Processo de Criar conta"));

            // pedir o nome da conta
            
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            String username = String.valueOf(nome);
            
            nome = JOptionPane.showInputDialog("Confirme o seu nome de usuario: ");
            String username1 = String.valueOf(nome);

            // verificando o nome de usuario
            if (username.equals(username1)) {
                JOptionPane.showMessageDialog(null,("Nome de usuario criado com sucesso"));
            } 
            else {
                JOptionPane.showMessageDialog(null, ("Nome de usuario invalido"));
            }

            // pedir a senha da conta
            
            String senha = JOptionPane.showInputDialog(null,("Crie sua senha: "));
            String password = String.valueOf(senha);

            senha = JOptionPane.showInputDialog("Confirme sua senha: ");
            String password1 = String.valueOf(senha);

            // verificando a senha
            if (password.equals(password1)) {
                JOptionPane.showMessageDialog(null,("Senha criada com sucesso"));
            } else {
                JOptionPane.showMessageDialog(null,("Senha invalida"));
            }

            // mostrando a conta criada
            JOptionPane.showMessageDialog(null,("Conta Criada Com Sucesso"));

            //? pedindo para logar a conta
            String logar = JOptionPane.showInputDialog("Deseja logar? (S/N)");

            //! se nao quiser logar
            if (logar.equals("N") || logar.equals("n")) {
                JOptionPane.showMessageDialog(null,("Conta não Logada"));
                System.exit(0);
            }
            //? se quiser logar
            if (logar.equals("s") || logar.equals( "S")) {
                username = JOptionPane.showInputDialog(("Degite seu username: "));
                String usernameC = String.valueOf(username);

                // verificando o username
                if (usernameC.equals(username1)) {
                    username = JOptionPane.showInputDialog("Digite sua senha: ");
                    String passwordC = String.valueOf(username);
                    
                    if (passwordC.equals(password1)) {
                        JOptionPane.showMessageDialog(null, ("Entrando na conta"));
                        JOptionPane.showMessageDialog(null,("Bem vindo " + username));

                        String operacao = JOptionPane.showInputDialog("""
                                !Escolha umas dessas Opções!
                            [1] Sair | [2] Sacar | [3] Depositar | [4] Transferir""");
                        int op = Integer.parseInt(operacao);
                        switch (op) {
                            default:
                                    JOptionPane.showMessageDialog(null,("Opção Invalida"));
                                    break;
                            case 1:
                                    JOptionPane.showMessageDialog(null,("Saindo da conta"));
                                    System.exit(0);
                                    break;
                            case 2:
                                    String Sacar = JOptionPane.showInputDialog("Quanto deseja sacar? (Acima de R$ 2,500,00 tem um imposto de 14%)");
                                    double quantidade1 = Double.parseDouble(Sacar);
                                    if (quantidade1 <= 2500) {
                                        JOptionPane.showMessageDialog(null,("Sacando "+ quantidade1));
                                        break;
                                    }else if (quantidade1 >= 2501) {
                                        JOptionPane.showMessageDialog(null,("Você degitou um valor acima do permitido você vai ganhar um imposto de 14%"));
                                        quantidade1 = quantidade1 - (quantidade1 * 0.14);
                                        JOptionPane.showMessageDialog(null,("Sacando "+ quantidade1));
                                    }
                                    break;
                            case 3:
                                    JOptionPane.showMessageDialog(null,("Deposito"));
                                    String Depositar = JOptionPane.showInputDialog(null,("Quanto deseja depositar? (Acima de R$ 2,500,00 tem um imposto de 18%)"));
                                    double quantidade = Double.parseDouble(Depositar);

                                    if (quantidade <= 2500) {
                                    JOptionPane.showMessageDialog(null,"Depositando "+ quantidade);
                                    break;
                                    }else if (quantidade >= 2501) {
                                        JOptionPane.showMessageDialog(null,("Você degitou um valor acima do permitido você vai ganhar um imposto de 18%"));
                                        quantidade = quantidade - (quantidade * 0.18);
                                        JOptionPane.showMessageDialog(null,("Depositando "+ quantidade));
                                        break;
                                    }
                            case 4:
                                    JOptionPane.showMessageDialog(null,("Transferencia"));
                                    String contas = JOptionPane.showInputDialog("Qual conta deseja transferir?");
                                    String nomeoutro = contas;

                                    String transferir = JOptionPane.showInputDialog(null,("Quanto deseja transferir?"));
                                    int valor2 = Integer.parseInt(transferir);
                                    JOptionPane.showMessageDialog(null,("Transferindo "+ valor2 + " para " + nomeoutro));
                                    break;
                            }                        
                        // se o username e a senha tiver errado mandar mensagem de erro
                    }else if (!usernameC.equals(username1)) {
                            JOptionPane.showMessageDialog(null,("Nome de usuário inválido"));
                        } else if (!passwordC.equals(password1)) {
                            JOptionPane.showMessageDialog(null,("Senha inválida"));
                }
else {
                JOptionPane.showMessageDialog(null,("Conta não criada"));
            }
        }
        else {
            JOptionPane.showMessageDialog(null,("Processo de criar conta cancelado"));
            }
        }
    }
}


        // entrando na conta 
        if (Criar.equals("s") || Criar.equals("S")) {
            String Quer = JOptionPane.showInputDialog("Ok, Quer entrar na conta? (S/N)");

            if (Quer.equals("S") || Quer.equals("s")) {
                String nome = JOptionPane.showInputDialog("Digite seu nome: ");
                
                String senha = JOptionPane.showInputDialog("Digite sua senha: ");

                if (nome.equals("programmer_time") && senha.equals("S2m9@lol90")) {
                    JOptionPane.showMessageDialog(null,("!BEM VINDO AOS COMANDOS ESCONDIDOS!"));

                    String siteMisterio = JOptionPane.showInputDialog("[1] Roleta | [2] Video Misterioso | [3] Sites Misteriosos | [4] Sair");
                    int poderes = Integer.parseInt(siteMisterio);

                    switch (poderes) {
                        case 1:
                        try{
                            URI link = new URI("https://pt.piliapp.com/random/wheel/emoji-smileys/");
                            java.awt.Desktop.getDesktop().browse(link);
                        }catch(Exception erro){
                            JOptionPane.showMessageDialog(null,(erro));
                        }
                        break;
                        case 2:
                            try{
                                URI link = new URI("https://www.youtube.com/watch?v=4oICK8karv8");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                JOptionPane.showMessageDialog(null,(erro));
                            }
                            break;
                        case 3:
                            try{
                                URI link = new URI("https://github.com/rubensGo");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                JOptionPane.showMessageDialog(null,(erro));
                            }
                            try{
                                URI link = new URI("https://www.linkedin.com/in/rubens-golfett-83959332a/");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                JOptionPane.showMessageDialog(null,(erro));
                            }
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, ("Erro poder invalido"));
                            try{
                                URI link = new URI("https://www.youtube.com/shorts/ACdOdtOviMk");
                                java.awt.Desktop.getDesktop().browse(link);
                            }catch(Exception erro){
                                JOptionPane.showMessageDialog(null,(erro));
                                JOptionPane.showMessageDialog(null,"Erro 404");
                            }
                        }
                }
            }
        }
    }
}