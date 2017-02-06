import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Raven on 15.08.2016.
 */
public class counterSesion extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      HttpSession session =  request.getSession();
      Integer kol  = (Integer)session.getAttribute("count");
      if (kol!=null){
          kol++;
      }
        else kol=1;

        session.setAttribute("count",kol);

        PrintWriter out =  response.getWriter();
        out.write("Popal na str  "+kol+" raz!!!");
        out.close();
    }
}
