package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.* ;



public class ConexionJDBC {

	private static ConexionJDBC instancia;
	private static Connection conn;
	
	public void cerrarConexion() {
		
			try {
				conn.close();
			} catch (SQLException e) {

			}
			
			conn = null;
			instancia = null;
	}

  	private ConexionJDBC() {	
  	}

	public static ConexionJDBC getInstance() {
		  if (getInstancia() == null) {			  				
			  setInstancia(new ConexionJDBC());
			  conn = null;
		  }
		  return getInstancia();
	}
	
	private static void setInstancia(ConexionJDBC estaInstancia) {
			instancia = estaInstancia;
	}

	private static ConexionJDBC getInstancia() {
			return instancia;
	}
	
	public Connection dameConexion(Properties prop) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
			if (conn != null)
				return conn;	
			
			String puerto = "50000";
			String alias = "BLUDB";
			String url1 = "awh-yp-small03.services.dal.bluemix.net";
			String m_driver = "com.ibm.db2.jcc.DB2Driver";
			String m_url = "jdbc:db2://" + url1 + ":" + puerto + "/" + alias;
			String m_usuario = "dash108289";
			String m_password = "0RgOrrWMXL92"; 
			
			
			
			Class.forName(m_driver);
			conn =DriverManager.getConnection(m_url,m_usuario,m_password);
			conn.setTransactionIsolation(1); //sin lock
			conn.setAutoCommit(true);

			return conn;	
	}
	
}
