package mutimedia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	

	  public void closeConn(Connection conn){

		  try {

			conn.close();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	  }

	  public Connection openConnection(){

		  String driver=null;

		  String url=null;

		  String username=null;

		  String password=null;	  

		  try {		

			driver="com.mysql.jdbc.Driver";

			url="jdbc:mysql://47.107.207.163:3306/smartvideourl";

			username = "zhonggaogao";

		    password = "zhonggaogao@163";

		    

		    Class.forName(driver);

		    

		    return DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		  return null;

	  }

	}