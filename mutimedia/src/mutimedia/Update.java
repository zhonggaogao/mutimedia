package mutimedia;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;

import java.util.List;

 

 

public class Update {

	

  public List<Menu> getMenuList(){

	  String sql =" select imageUrls from video_list ";

	  DBUtil util=new DBUtil();

	  Connection conn=util.openConnection();

	  

	  try {

		  //获得预定义语句

		Statement pstmt=conn.createStatement();

		//查询SQL语句

		ResultSet rs=pstmt.executeQuery(sql);

		 List<Menu> list = new ArrayList<Menu>();

		 

		 while(rs.next()){

			

	         String imageUrls = rs.getString(1);

	        

		     

		     Menu m=new Menu();

		     
		     m.setImageUrls(imageUrls);

		     

             

             list.add(m);

		 }

		 

		 return list;

		

	} catch (SQLException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

	}finally{

		util.closeConn(conn);

	}

	return null;

  }

}