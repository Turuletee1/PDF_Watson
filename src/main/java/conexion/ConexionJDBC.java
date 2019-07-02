package conexion;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


//import java.sql.* ;


/**
 * @author Diego
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de c�digo&gt;C�digo y comentarios
 */
public class ConexionJDBC {
	private static String m_password;
	private static String m_usuario;
	private static String m_protocolo;
	private static String m_driver;
 
	private static ConexionJDBC instancia;
	private static Connection conn;
	
	public void cerrarConexion() {
		
			try {
				conn.close();
			} catch (SQLException e) {
				//Log.getInstance().writeData("*ConexionJDBC* cerrarConexion:Error al cerral la conexion:" + e.getMessage() ,"ERROR");
			}
			
			conn = null;
			instancia = null;
	}
	//	Este es el constructor de la clase ConexionJDBC
  	private ConexionJDBC() {	
  	}
	
	//	Con este metodo accedemos a la instancia creada del singleton
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
	
			/*
			m_driver = prop.getProperty("puerto");
			alias = prop.getProperty("alias");
			url1 = prop.getProperty("url");
			m_driver = prop.getProperty("Driver");
			m_url = "jdbc:db2://" + url1 + ":" + puerto + "/" + alias;		
			m_usuario = prop.getProperty("Usuario");
			m_password = prop.getProperty("Password");
			*/
			
			
			
			Class.forName(m_driver);
			conn =DriverManager.getConnection(m_url,m_usuario,m_password);
			conn.setTransactionIsolation(1); //sin lock
			conn.setAutoCommit(true);
			
			/*
			Class.forName(m_driver).newInstance();
			conn =DriverManager.getConnection(m_protocolo,m_usuario,m_password);
			System.out.println("Fin dameConexion");
			*/
			return conn;	
	}
	
}
