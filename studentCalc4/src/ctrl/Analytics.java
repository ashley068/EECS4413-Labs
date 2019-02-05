package ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import listener.MaxPrincipal;

/**
 * Servlet implementation class Analytics
 */
@WebServlet("/admin")
public class Analytics extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String MAX_PRINCIPAL="maxPrincipal";
    MaxPrincipal mp;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Analytics() {
        super();
        // TODO Auto-generated constructor stub

    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
		getServletContext().setAttribute(MAX_PRINCIPAL, MaxPrincipal.maxP);
		request.getRequestDispatcher("/MaxPrincipal.jspx").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
