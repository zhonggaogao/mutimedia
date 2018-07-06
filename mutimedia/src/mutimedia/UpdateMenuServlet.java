package mutimedia;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateMenuServlet extends HttpServlet {

	 private static final long serialVersionUID = 1L;

	 

	 public UpdateMenuServlet() {

		         super();	    

	}

	 public void destroy(){

		 super.destroy();

	 }

	 

	public void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

 

		response.setContentType("text/xml");

		PrintWriter out = response.getWriter();

		Update dao=new Update();

		List<Menu> list=dao.getMenuList();

		out.println("<?xml version='1.0' encoding='UTF-8'?>");

		out.println("<menulist>");

		for(int i=0;i<list.size();i++){

		    Menu m=list.get(i);

		    out.println("<menu>");		    

	


		      // Í¼Æ¬Â·¾¶

		     out.print("<imageUrls>");

		     out.print(m.getImageUrls());

		     out.println("</imageUrls>");

		    

		     out.println("</menu>");

 

			 

		}

		out.println("</menulist>");

	

		out.flush();

		out.close();

	}

 

	

	public void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

 

		doGet(request,response);

	}

	public void init() throws ServletException {

		    }

}
