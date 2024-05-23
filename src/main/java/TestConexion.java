import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/peliculas_bruno", "root", "jorsobru3");
		
		if (conn != null) {
			System.out.println("La conexion se establecio");
			}
		
		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("select * from peliculas");
		
		while (resultSet.next()) {
			Integer codigo = resultSet.getInt("codigo");
			
			System.out.printf("codigo = [%d]\n", codigo);
		}
		resultSet.close();
		stmt.close();
		conn.close();
	}
}