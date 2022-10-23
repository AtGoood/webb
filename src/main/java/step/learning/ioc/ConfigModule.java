package step.learning.ioc;

import com.google.inject.AbstractModule;
import step.learning.services.DataService;

import step.learning.services.MysqlDataServices;

public class ConfigModule extends AbstractModule {
    @Override
    protected void configure() {
        // Конфигурация служб-поставщиков
        bind(DataService.class).to(MysqlDataServices.class) ;
    }
}