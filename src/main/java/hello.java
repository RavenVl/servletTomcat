

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Raven on 08.08.2016.
 */

public class hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter writer =  resp.getWriter();
        writer.println("Hello from servlet TomCat");
        writer.close();
    }
}
