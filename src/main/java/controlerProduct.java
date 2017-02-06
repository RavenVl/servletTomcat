import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Raven on 15.08.2016.
 */
public class controlerProduct extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            /*PrintWriter out = resp.getWriter();
            out.write("Product");
            out.close();*/

            dbProduct db = new dbProduct();
            db.setProducts();
            String tempId =(String) req.getAttribute("id");

                int id = Integer.parseInt(tempId);
                Product product = db.getId(id);

                HttpSession sesion = req.getSession();
                sesion.setAttribute("product",product);

                RequestDispatcher rd = req.getRequestDispatcher("product.jsp");
                rd.forward(req,resp);





        }


}
