import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Raven on 15.08.2016.
 */
public class filterProduct implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String id = req.getParameter("id");
        if (id!= null){
            req.setAttribute("id",id);
            chain.doFilter(req, resp);
        }
        else{
            HttpServletResponse resp1 = (HttpServletResponse) resp;
            resp1.sendRedirect("eror.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");


    }

}
