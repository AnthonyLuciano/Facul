package A3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Pesquisarteste1 {
    
public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/loja";
    String username = "root";
    String password = "souza!23";

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o modelo do carro: ");
        String modelo = input.nextLine();

        String sql = "SELECT * FROM carros WHERE modelo = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, modelo);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Modelo: " + rs.getString("modelo"));
                    System.out.println("Cor: " + rs.getString("cor"));
                    System.out.println("Ano de fabricação: " + rs.getInt("ano"));
                    System.out.println("Valor: " + rs.getDouble("valor"));
                    System.out.println("Código de marca: " + rs.getInt("codMarca"));
                } else {
                    System.out.println("Nenhum carro encontrado com o modelo " + modelo);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar carro: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}