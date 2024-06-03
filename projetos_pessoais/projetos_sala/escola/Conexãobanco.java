package escola;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexãobanco {
    public static void main(String[] args) {
        //configurar infoemações de conexão
        String url = "jdbc:mysql://localhost:3306/escola";
        String user = "root";
        String pass = "admin";

        //criar conexão com o BD
        try (Connection connection = DriverManager.getConnection(url, user, pass)){
            System.out.println("funciono caralho!");
        } catch (SQLException Erro) {
            Erro.printStackTrace();
        }
    }
}
