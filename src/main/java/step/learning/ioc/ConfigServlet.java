package step.learning.ioc;

import com.google.inject.servlet.ServletModule;
import step.learning.*;
import step.learning.filters.*;


public class ConfigServlet extends ServletModule {
    @Override
    protected void configureServlets() {

        // Программная замена web.xml - конфигурация фильтров ...
        filter( "/*" ).through( CharsetFilter.class ) ;
     //   filter( "/*" ).through( DataFilter.class ) ;
        filter( "/*" ).through( AuthFilter.class ) ;
        //filter( "/*" ).through( DemoFilter.class) ;

        // ...  и сервлетов
        serve( "/filters" ).with( FiltersServlet.class ) ;
        serve( "/servlet" ).with( ViewServlet.class ) ;
        serve( "/register/" ).with(step.learning.servlets.RegUserServlet.class) ;
        serve( "/image/*" ).with( DownloadServlet.class ) ;
        serve( "/profile" ).with( Profileservlet.class ) ;
     //   serve( "/" ).with( HomeServlet.class ) ;
    }
}