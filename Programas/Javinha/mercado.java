

import java.util.Scanner;

public class mercado {

    public static void main(String[] args) {
        
        String[] carrinho = new String[7];
        int prateleiraInt = 1;

        double[] precos = {12.50, 13.00, 11.50, 10.80, 10.00, 9.00}; // Correspondente aos produtos
        String[] produtoDisp = {"Coca-Cola", "Fanta", "Sprite", "Guarana", "Pepsi", "Cerveja"};

        double[] precos2 = {9.99, 10.99, 6.88, 10, 20.99, 25.99};	
        String[] produtosDisp2 = {"Macarrao", "Chocolate", "Agua", "Massa", "Arroz", "Feijao"};

        String[] produtosDisp3 = {"Molho-de-Tomate", "Vinagre", "Azeite", "Leite", "Ovo", "Farrofa"};
        double[] precos3 = {10.00, 9.00, 10.00, 11.00, 17.00, 21.00}; 

        while (true) {
            System.out.println("""
                1. adicionar produto no carrinho
                2. remover produto do carrinho
                3. trocar de prateleira
                4. voltar para a prateleira
                5. ver todos os produtos do carrinho
                6. finalizar compras
                7. sair
            """);
            System.out.print("Escolha uma opcao: ");
            Scanner opçoes = new Scanner(System.in);
            int opcao = opçoes.nextInt();

            
            switch (opcao) {
                case 1: //! opção de adicionar produto
                    
                    if (prateleiraInt == 1) {
                        System.out.println("Produtos da prateleira 1#: ");
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
                                System.out.println(" ");
                            }
                        }else {
                            System.out.println("Produto indisponivel");
                        }
                    }else if (prateleiraInt == 2) {
                        System.out.println("Produtos da prateleira 2#: ");
                        System.out.println("""
                        1.Macarrao
                        2.Chocolate
                        3.Agua
                        4.Massa
                        5.Arroz
                        6.Feijao""");
                        System.out.print("Digite o nome do produto: ");
                        Scanner produtos = new Scanner(System.in);
                        String produto = produtos.nextLine();
                    
                        if (produto.equalsIgnoreCase(produtosDisp2[0]) || produto.equalsIgnoreCase(produtosDisp2[1]) || produto.equalsIgnoreCase(produtosDisp2[2]) || produto.equalsIgnoreCase(produtosDisp2[3]) || produto.equalsIgnoreCase(produtosDisp2[4]) || produto.equalsIgnoreCase(produtosDisp2[5])) {
                            
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
                    }else {
                        System.out.println("Produtos da prateleira 3#: ");
                        System.out.println("""
                        1.Molho-de-Tomate
                        2.Vinagre
                        3.Azeite
                        4.Leite
                        5.Ovo
                        6.Farrofa""");
                        System.out.print("Digite o nome do produto: ");
                        Scanner produtos = new Scanner(System.in);
                        String produto = produtos.nextLine();
                    
                        if (produto.equalsIgnoreCase(produtosDisp3[0]) || produto.equalsIgnoreCase(produtosDisp3[1]) || produto.equalsIgnoreCase(produtosDisp3[2]) || produto.equalsIgnoreCase(produtosDisp3[3]) || produto.equalsIgnoreCase(produtosDisp3[4]) || produto.equalsIgnoreCase(produtosDisp3[5])) {
                            
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
                    System.out.println("Qual prateleira tu quer ir? (1, 2 ou 3)");
                    Scanner prateleira = new Scanner(System.in);
                    prateleiraInt = prateleira.nextInt();
                    break;

                case 4: //! opção de voltar para a prateleira
                if (prateleiraInt == 1) {
                    System.out.println("Qual prateleira tu quer voltar? (2 ou 3)");
                    Scanner voltaPrateleira = new Scanner(System.in);
                    prateleiraInt = voltaPrateleira.nextInt();
                    if (prateleiraInt == 1) {
                        prateleiraInt = 2;
                    }

                }else if (prateleiraInt == 2) {
                    System.out.println("Qual prateleira tu quer voltar? (1 ou 3)");
                    Scanner voltaPrateleira = new Scanner(System.in);
                    prateleiraInt = voltaPrateleira.nextInt();
                    if (prateleiraInt == 2) {
                        prateleiraInt = 3;
                    }

                }else {
                    System.out.println("Qual prateleira tu quer voltar? (1 ou 2)");

                    Scanner voltaPrateleira = new Scanner(System.in);
                    prateleiraInt = voltaPrateleira.nextInt();
                    if (prateleiraInt == 3) {
                        prateleiraInt = 2;
                    }
                }
                    break;

                case 5: //! opção de ver todos os produtos do carrinho
                    System.out.println("Produtos no carrinho: ");
                    for (int i = 0; i < carrinho.length; i++) {
                        if (carrinho[i] != null) {
                            System.out.println((i) + ". " + carrinho[i]);
                        }
                    }
                    break;

                case 7://! opçao de sair
                    System.exit(0);
                    break;

                case 6: //! opção de finalizar compras
                double total = 0;
                System.out.println("Finalizando compras...");

                // Exibe os produtos no carrinho e calcula o total
                for (int i = 0; i < carrinho.length; i++) {
                    if (carrinho[i] != null) {
                        String produtoNoCarrinho = carrinho[i];
                        // Encontrar o preço do produto
                        for (int j = 0; j < produtoDisp.length; j++) {
                            if (produtoNoCarrinho.equalsIgnoreCase(produtoDisp[j])) {
                                total += precos[j];
                                System.out.println(produtoNoCarrinho + " - R$ " + precos[j]);
                                break;
                            }
                        }

                        for (int j = 0; j < produtosDisp2.length; j++) {
                            if (produtoNoCarrinho.equalsIgnoreCase(produtosDisp2[j])) {
                                total += precos2[j];
                                System.out.println(produtoNoCarrinho + " - R$ " + precos2[j]);
                                break;
                            }
                        }

                        for (int j = 0; j < produtosDisp3.length; j++) {
                            if (produtoNoCarrinho.equalsIgnoreCase(produtosDisp3[j])) {
                                total += precos3[j];
                                System.out.println(produtoNoCarrinho + " - R$ " + precos3[j]);
                                break;
                            }
                        }
                    }
                    
                }
            }
        }
        }
    }