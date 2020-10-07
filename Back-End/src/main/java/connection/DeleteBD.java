package connection;

import java.sql.*;

public class DeleteBD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/parisluxury?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pwd = "root";
        System.out.println(url);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(url, user, pwd);
        System.out.println("Conectado!");
        String readsql = "DELETE  FROM clientes WHERE id=?;";
        PreparedStatement readStm = conexao.prepareStatement(readsql);
        ResultSet resultSet = readStm.executeQuery();
        while (resultSet.next()) {
            System.out.println("cliente deletado cadastrado.");
        }
        conexao.close();
        System.out.println("Encerrado!");
    }
}