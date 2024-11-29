

import java.util.Scanner;

public class mercado {

    public static void main(String[] args) {
        
        String[] carrinho = new String[7];
        int prateleiraInt = 1;
        while (true) {
            System.out.println("""
                1. adicionar produto no carrinho
                2. remover produto do carrinho
                3. trocar de prateleira
                4. voltar para a prateleira
                5. ver todos os produtos do carrinho
                6. finalizar compras
            """);
            System.out.print("Escolha uma opcao: ");
            Scanner opçoes = new Scanner(System.in);
            int opcao = opçoes.nextInt();

            
            switch (opcao) {
                case 1: //! opção de adicionar produto

                    if (prateleiraInt == 1) {
                        String[] produtoDisp = {"Coca-Cola", "Fanta", "Sprite", "Guarana", "Pepsi", "Cerveja"};
                        System.out.println("Produtos nessa prateleira: ");
                        System.out.println("""
                        1.Coca-Cola
                        2.Fanta
                        3.Sprite
                        4.Guarana
                        5.Pepsi
                        6.Cerveja""");

                        System.out.print("Digite o nome do produto: ");
                        Scanner produtos = new Scanner(System.in);
                        String produto = produtos.nextLine();
                    
                        if (produto.equalsIgnoreCase(produtoDisp[0]) || produto.equalsIgnoreCase(produtoDisp[1]) || produto.equalsIgnoreCase(produtoDisp[2]) || produto.equalsIgnoreCase(produtoDisp[3]) || produto.equalsIgnoreCase(produtoDisp[4]) || produto.equalsIgnoreCase(produtoDisp[5])) {

                            System.out.print("Degite a posicao do carrinho (1-6): ");
                            Scanner lugar = new Scanner(System.in);
                            int lugarInt = lugar.nextInt();
                            carrinho[lugarInt] = produto;

                            if (carrinho[lugarInt] == null) {
                                System.out.println("Produto adicionado ao carrinho");
                            }else{
                                System.out.println("Posicao ocupada");
                            }
                        }else {
                            System.out.println("Produto indisponivel");
                        }
                    }
                    break;
                case 2: //! opção de remover produto

                    System.out.print("Digite a posicao do carrinho para remover (1-6): ");
                    Scanner posiçao = new Scanner(System.in);
                    int posi = posiçao.nextInt();
                    if (posi > 0 && posi < 7) {
                        if (carrinho[posi] != null) {
                            carrinho[posi] = null;
                            System.out.println("Produto removido do carrinho");
                    }else{
                        System.out.println("Posicao vazia");
                    }
                }else {
                    System.out.println("Posicao invalida");
                }
                    break;
                case 3: //! opção de trocar de prateleira
                    
                    break;
                case 4: //! opção de voltar para a prateleira
                    
                    break;
                case 5: //! opção de ver todos os produtos do carrinho
                    
                    break;
                case 6: //! opção de finalizar compras
                    
                    break;
                default: //! verificando se a opção escolhida nao eh valida
                    System.out.println("!Opcao invalida!");
                    break;
            }
        }
    }
}