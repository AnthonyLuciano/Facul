package vscode_projects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLSearch {
  private Connection con;
  private String url = "jdbc:mysql://localhost:3306/conexãoteste";
  private String userName = "root";
  private String password = "souza!23";
  private String jdbcDriver = "org.gjt.mm.mysql.Driver";

  public MySQLSearch() {
    try {
      Class.forName(jdbcDriver);
      con = DriverManager.getConnection(url, userName, password);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void search(String query) {
    try {
      PreparedStatement pstmt = con.prepareStatement(query);
      ResultSet rs = pstmt.executeQuery();

      while (rs.next()) {
        // Aqui você pode processar os resultados da consulta
        System.out.println(rs.getString(1) + " " + rs.getString(2));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void closeConnection() {
    try {
      con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    MySQLSearch search = new MySQLSearch();
    search.search("SELECT * FROM db_livro");
    search.closeConnection();
  }
}