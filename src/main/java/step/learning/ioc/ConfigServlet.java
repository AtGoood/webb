package step.learning.ioc;

import com.google.inject.servlet.ServletModule;
import step.learning.FiltersServlet;
import step.learning.HomeServlet;
import step.learning.ViewServlet;
import step.learning.filters.*;
import step.learning.services.RegUserServlet;

public class ConfigServlet extends ServletModule {
    @Override
    protected void configureServlets() {
        //  конфигурация фильтров
        filter( "/*" ).through( CharsetFilter.class ) ;
        filter( "/*" ).through( AuthFilter.class ) ;


        // сервлетов
        serve( "/filters" ).with( FiltersServlet.class ) ;
        serve( "/servlet" ).with( ViewServlet.class ) ;
        serve( "/" ).with( step.learning.HomeServlet.class ) ;
        serve("/register/").with(RegUserServlet.class);

    }
}