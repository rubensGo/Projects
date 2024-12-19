//import javax.swing.JOptionPane;
//update: rubens Golfetto

import java.util.Scanner;

public class TesteObj implements InterfaceTeste {

    private String nome;
    private int idade;
    private char sexo;
    /*
     * vou futuramente mecher com esses atributos:
     * idade, sexo e nome
     */

    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Scanner leitor = new Scanner(System.in);

    @Override
    public void abrir() {
        System.out.println("Abrindo o Livro");
        this.setAberto(true);
    }

    @Override
    public void avancarPag() {
        if (getAberto() && getPaginaAtual() < getTotPaginas()) {
            this.setPaginaAtual(paginaAtual += 1);
            ;
        } else {
            System.out.println("Ops o livro está fechado! abra o primeiro");
        }
        if (getPaginaAtual() > getTotPaginas()) {
            System.out.println("Ops você ta tentando folhear uma pagina que nao existe!");
        }
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o Livro");
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        if (getAberto() && getPaginaAtual() <= getTotPaginas() || getPaginaAtual() > getTotPaginas()) {
            System.out.print("Qual pagina deseja ir do Livro: ");
            this.paginaAtual = this.leitor.nextInt();
        }
        if (getPaginaAtual() > getTotPaginas()) {
            System.out.println("Ops você ta tentando folhear uma pagina que nao existe!");
            this.paginaAtual = this.totPaginas;
            System.out.println("Aviso: eu coloquei tu no limite da Pagina");
        }
    }

    @Override
    public void voltarPag() {
        if (getAberto() && getPaginaAtual() >= 1 && getPaginaAtual() <= getTotPaginas()) {
            setPaginaAtual(paginaAtual -= 1);
        } else {
            System.out.println("Ops o livro está fechado!");
        }
        if (getPaginaAtual() > getTotPaginas()) {
            System.out.println("Ops você ta tentando voltar uma pagina que nao existe!");
        }

    }

    public void fazerAniver() {
        setIdade(idade += 1);
    }

    public void detalhes() {
        System.out.println("autor: " + getAutor() + "\n" + "titulo: " + getTitulo() + "\n" + "totPaginas: "
                + getTotPaginas() + "\n"
                + "paginaAtual: " + getPaginaAtual() + "\n" + "aberto: " + getAberto() + "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

    public TesteObj(String ti, String au, int to) {
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = to;
        if (aberto) {
            this.paginaAtual += 1;
        } else {
            System.out.println("o livro está fechado!");
        }
    }
}
