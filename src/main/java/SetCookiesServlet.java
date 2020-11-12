import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("coc1","123");
        Cookie cookie2 = new Cookie("coc2","456");

        cookie1.setMaxAge(24*3600);
        cookie2.setMaxAge(24*3600);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
