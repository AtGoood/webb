package step.learning;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet( "/register" )
public class registerServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response ) throws ServletException, IOException {

        response.setCharacterEncoding( "UTF-8" ) ;
        // response.getWriter().print( "<h1>Сервлет работает</h1>" ) ;
        HttpSession session = request.getSession() ;
        String email = (String) session.getAttribute( "email" ) ;
        String password1 = (String) session.getAttribute( "password1" ) ;
        String password2 = (String) session.getAttribute( "password2" ) ;
        request.setAttribute( "email", email ) ;
        request.setAttribute( "password1", password1 ) ;
        request.setAttribute( "password1", password2 ) ;
        if( email != null ) {
            session.removeAttribute( "email" ) ;
        }
        request.getRequestDispatcher( "WEB-INF/register.jsp" )
                .forward( request, response ) ;
        /* Д.З. Реализовать прием данных из формы прошлого ДЗ, вывести полученные
        данные на странице. Использовать Сервлеты, перенаправления, сессии.
         */
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // При наличие параметов, передаваемых формой, они становятся доступными
        // через req.getParameter
        // ! до первого чтения из req необходимо указать кодировку
        req.setCharacterEncoding( "UTF-8" ) ;
        String email = req.getParameter( "email" ) ;
        String password1 = req.getParameter( "password1" ) ;
        String password2 = req.getParameter( "password2" ) ;
       // form-data
        // Тут могла бы быть валидация
        // req.setAttribute( "userInput", userInput ) ; - при редиректе бесполезно
        // req.getRequestDispatcher( "WEB-INF/servlets.jsp" ).forward( req, resp ) ;

        // сессия - хранит данные между запросами
        req.getSession().setAttribute( "email", email ) ;
        req.getSession().setAttribute( "password1", password1 ) ;
        req.getSession().setAttribute( "password2", password2 ) ;
        resp.sendRedirect( req.getRequestURI() ) ;
    }
}
