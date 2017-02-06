import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Raven on 11.08.2016.
 */
public class firstFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String x = req.getParameter("x");
        if (!(x == null)) {
            System.out.println(x);
            if (x.equals("1")) {
                System.out.println("Hello from filter1");
                PrintWriter writer = resp.getWriter();
                writer.println("Hello from filter1");
                writer.close();
            }
        }
        System.out.println("Hello from filter2");
        chain.doFilter(req,resp);
       /*PrintWriter writer = resp.getWriter();
        writer.println("Hello from filter2");
        writer.close();*/

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
