package HoraAtual;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HoraAtual")
public class HoraAtua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
					
     SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
     Date now = new Date();
     String strDate = sdfDate.format(now);
	        		    
	 PrintWriter out = response.getWriter();
	 out.println("<html>");
	 out.println("<body>");
	 out.println("<h1> Hora atual");
	 out.println(strDate);
	 out.println("</body>");
	 out.println("</html>");   

	 }	
}
