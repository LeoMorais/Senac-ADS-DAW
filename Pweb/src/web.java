

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class web
 */
@WebServlet("/web")
public class web extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public web() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Declara variavel para receber numero do usuário
		int num = Integer.parseInt(request.getParameter("numero"));
		
		//Cria objeto
		Conv calculo = new Conv();
		
		String resultado = calculo.convbd(num);
		
		//Cria objeto writer
		PrintWriter writer = response.getWriter();
		
		//Imprime na tela o resultado
		writer.printf("O número informado em decimal=" + resultado);
		
		writer.close();
		
		
		
	}

}
