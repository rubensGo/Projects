import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Variáveis para armazenar as informações de conexão
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro";  // Altere para o nome do seu banco de dados
    private static final String USER = "root";  // Nome de usuário do banco de dados
    private static final String PASSWORD = "352515";  // Senha do banco de dados

    // Método para estabelecer a conexão com o banco de dados
    public static Connection getConnection() {
        try {
            // Carregar o driver JDBC para MySQL (não necessário nas versões mais recentes)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecendo a conexão
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

    // Método para fechar a conexão
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão: " + e.getMessage());
        }
    }
}
