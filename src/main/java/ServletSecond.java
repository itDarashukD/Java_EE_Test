import TestCart.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSecond")
public class ServletSecond extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Создание сессии клиента
        HttpSession session = request.getSession();


//        //авторизация пользователя
//        String user = (String) session.getAttribute("user");
//        if (user == null) {
//            //response для анонимного пользователя
//            //авторизация
//            //регистрация
//            //sessiont.getAttribute(current_user,unicum_Id)
//        } else {//responce для авторизированного пользователя}


        //добавляем в сессию новый атребут
        Cart cart = (Cart) session.getAttribute("cart");//coздание корзины

        //получим значения из URL
         String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));



        if(cart==null){cart = new Cart();
        cart.setName(name);
        cart.setQuantity(quantity);
    }
        session.setAttribute("cart",cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);




//
//        //атребут бует count -счетчик количества посещений страницы пользователем
//        Integer count = (Integer) httpSession.getAttribute("count");
//

            //ели пользователь первый раз зашел на стр,то присваиваем сессии значение 1
            //если больше раз ,то добавляем счетчик
//        if (count == null) {
//            httpSession.setAttribute("count", 1);
//            count = 1;
//        } else {
//            httpSession.setAttribute("count", ++count);
//        }
//        httpSession.getAttribute("count");


//        PrintWriter pw = response.getWriter();
//        //создание name для подстановки параметров прямо в URL в запросе
//
//
////        String name = request.getParameter("name");
////        String lastName = request.getParameter("lastName");
//
//        pw.println("<html>");

            //      pw.println("<h1>count of your vizit this page is : " + count + " </h1>");//выводим количество посещений стр.

            //         pw.println("<h1> Hello Second World from Java_EE !" +name +" "+lastName+ " </h1>");

            //       pw.println("</html>");

            //учимся перенаправлять запросы пользователя

            // с помощью Redirect
            //одновременно работает только один редирект,или ошибка 500

            // response.sendRedirect("https://www.google.com");//редиректим на сайт Гугл
            // response.sendRedirect("TestForwardRedirectJsp.jsp");//редиректим на наш же JSP файл


            // с помощью FORWARD
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("TestForwardRedirectJsp.jsp");
//        requestDispatcher.forward(request,response);


        }
    }
