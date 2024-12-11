package JavaProjetcs;
import javax.swing.JOptionPane;

public class market {

    public static void main(String[] args) {
        // Opções do carrinho de compras
        String[] carrinho = new String[7];
        int prateleiraInt = 1;

        double[] precos = {12.50, 13.00, 11.50, 10.80, 10.00, 9.00}; // Correspondente aos produtos
        String[] produtoDisp = {"Coca-Cola", "Fanta", "Sprite", "Guarana", "Pepsi", "Cerveja"};

        double[] precos2 = {9.99, 10.99, 6.88, 10, 20.99, 25.99};	
        String[] produtosDisp2 = {"Macarrao", "Chocolate", "Agua", "Massa", "Arroz", "Feijao"};

        String[] produtosDisp3 = {"Molho-de-Tomate", "Vinagre", "Azeite", "Leite", "Ovo", "Farrofa"};
        double[] precos3 = {10.00, 9.00, 10.00, 11.00, 17.00, 21.00}; 

        while (true) {
            String menu = JOptionPane.showInputDialog("""
                1. adicionar produto no carrinho
                2. remover produto do carrinho
                3. trocar de prateleira
                4. voltar para a prateleira
                5. ver todos os produtos do carrinho
                6. finalizar compras
            """);
            int opcao = Integer.parseInt(menu);

            
            switch (opcao) {
                case 1: //! opção de adicionar produto
                String[] produtos;
                if (prateleiraInt == 1) {
                    produtos = produtoDisp;
                } else if (prateleiraInt == 2) {
                    produtos = produtosDisp2;
                } else {
                    produtos = produtosDisp3;
                }

                // Cria a janela de seleção de produtos
                String produtoSelecionado = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha um produto da prateleira " + prateleiraInt + ":",
                    "Prateleira " + prateleiraInt,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    produtos,
                    produtos[0]
                );

                if (produtoSelecionado != null) {
                    String posicao = JOptionPane.showInputDialog("Digite a posição no carrinho (1-6):");
                    int posicaoInt = Integer.parseInt(posicao);

                    if (posicaoInt >= 0 && posicaoInt < carrinho.length && carrinho[posicaoInt] == null) {
                        carrinho[posicaoInt] = produtoSelecionado;
                        JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Posição inválida ou já ocupada!");
                    }
                }
                break;

                case 2: //! opção de remover produto
                    String posicao = JOptionPane.showInputDialog("Digite a posicao do carrinho para remover (1-6): ");
                    int posi = Integer.parseInt(posicao);
                    if (posi > 0 && posi < 7) {
                        if (carrinho[posi] != null) {
                            carrinho[posi] = null;
                            JOptionPane.showMessageDialog(null, ("Produto removido do carrinho"));

                    }else{
                        JOptionPane.showMessageDialog(null, "Posicao vazia");
                    }

                }else {
                    JOptionPane.showMessageDialog(null, ("Posicao invalida"));
                }
                    break;

                case 3: //! opção de trocar de prateleira
                    String prateleiraEscolha = JOptionPane.showInputDialog("Qual prateleira tu quer ir? (1, 2 ou 3)");
                    prateleiraInt = Integer.parseInt(prateleiraEscolha);
                    break;

                case 4: //! opção de voltar para a prateleira
                if (prateleiraInt == 1) {
                    String prateleiraVolta = JOptionPane.showInputDialog("Qual prateleira tu quer voltar? (2 ou 3)");
                    
                    prateleiraInt = Integer.parseInt(prateleiraVolta);;
                    if (prateleiraInt == 1) {
                        prateleiraInt = 2;
                    }

                }else if (prateleiraInt == 2) {
                    String prateleiraVolta = JOptionPane.showInputDialog("Qual prateleira tu quer voltar? (1 ou 3)");
                    
                    prateleiraInt = Integer.parseInt(prateleiraVolta);
                    if (prateleiraInt == 2) {
                        prateleiraInt = 3;
                    }

                }else {
                    String prateleiraVolta = JOptionPane.showInputDialog("Qual prateleira tu quer voltar? (1 ou 2)");

                    
                    prateleiraInt = Integer.parseInt(prateleiraVolta);
                    if (prateleiraInt == 3) {
                        prateleiraInt = 2;
                    }
                }
                    break;

                case 5: //! opção de ver todos os produtos do carrinho
                    JOptionPane.showMessageDialog(null, ("Produtos no carrinho: "));
                    for (int i = 0; i < carrinho.length; i++) {
                        if (carrinho[i] != null) {
                            JOptionPane.showMessageDialog(null, ((i) + ". " + carrinho[i]));
                        }
                    }
                    break;

                case 6: //! opção de finalizar compras
                    double total = 0;
                    StringBuilder resumo = new StringBuilder("Finalizando compras...\n\n");
                
                    // Exibe os produtos no carrinho e calcula o total
                    for (int i = 0; i < carrinho.length; i++) {
                        if (carrinho[i] != null) {
                            String produtoNoCarrinho = carrinho[i];
                            boolean produtoEncontrado = false;
                
                            // Encontrar o preço do produto na prateleira 1
                            for (int j = 0; j < produtoDisp.length; j++) {
                                if (produtoNoCarrinho.equalsIgnoreCase(produtoDisp[j])) {
                                    total += precos[j];
                                    resumo.append(produtoNoCarrinho).append(" - R$ ").append(precos[j]).append("\n");
                                    produtoEncontrado = true;
                                    break;
                                }
                            }
                
                            // Encontrar o preço do produto na prateleira 2
                            if (!produtoEncontrado) {
                                for (int j = 0; j < produtosDisp2.length; j++) {
                                    if (produtoNoCarrinho.equalsIgnoreCase(produtosDisp2[j])) {
                                        total += precos2[j];
                                        resumo.append(produtoNoCarrinho).append(" - R$ ").append(precos2[j]).append("\n");
                                        produtoEncontrado = true;
                                        break;
                                    }
                                }
                            }
                
                            // Encontrar o preço do produto na prateleira 3
                            if (!produtoEncontrado) {
                                for (int j = 0; j < produtosDisp3.length; j++) {
                                    if (produtoNoCarrinho.equalsIgnoreCase(produtosDisp3[j])) {
                                        total += precos3[j];
                                        resumo.append(produtoNoCarrinho).append(" - R$ ").append(precos3[j]).append("\n");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                
                    // Exibe o total
                    resumo.append("\nTotal: R$ ").append(String.format("%.2f", total));
                    JOptionPane.showMessageDialog(null, resumo.toString());
                    
                    // Sair do programa
                    System.exit(0);
                    break;
            }
        }
    }
}