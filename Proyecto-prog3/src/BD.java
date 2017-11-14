import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {

	public static Connection getConexion(){
	
		
		Connection conn = null; 
		try{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/bd_prueba";
		String usuario = "ina";
		String pass = "ina";
		
		conn = DriverManager.getConnection(url,usuario,pass);
		
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();System.out.println("Error al cargar driver");
			
		   }catch(SQLException e){
			 
			   e.printStackTrace();  System.out.println("Error base datos");
		   }
		return conn;
		   }
		
	
	
	
	
	
	
	
	
	public void conexion() throws SQLException{
		
		Connection conn = null; 
		try { 
			conn = DriverManager.getConnection("jdbc:sqlite:n.db");
		}finally{
			
		}
	}
	public void crearTabla(Connection e) throws SQLException{
		Statement sta = e.createStatement();
		String sql = "CREATE TABLE IF NOT EXIT usuario(nombre STRING,id INT,usuario STRING,pass STRING)";
		sta.executeUpdate(sql);
		sta.close();
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
