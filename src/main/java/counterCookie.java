import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Raven on 15.08.2016.
 */
public class counterCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie count = null;
        int kol = 0;
        String kolS="";
        Cookie[] cookies =  request.getCookies();
        for (Cookie cookie : cookies) {
            if("count".equals(cookie.getName())){
                String s = cookie.getValue();
                if(s!=null){
                    kol =Integer.parseInt(s);

                }
                else kol=1;

                kolS= ""+(++kol);

                count = new Cookie("count",kolS);
            }
        }
        if (count == null){
            kol = 1;
            kolS="1";
            count = new Cookie("count",kolS);
        }
        response.addCookie(count);
        PrintWriter out = response.getWriter();
        out.write("Posetil str = "+kolS+" raz!!!");
        out.close();
    }
}
