package org.varangproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.MediaType;
import org.varangproject.model.Entity;
import org.varangproject.model.Person;




@Configuration
@Import(RepositoryRestMvcConfiguration.class)
public class RestRepositoryConfig extends RepositoryRestMvcConfiguration {

    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
       // super.configureRepositoryRestConfiguration(config);
        config.setBasePath("/ebys/datarest");
        config.exposeIdsFor(Entity.class,Person.class );
        config.setLimitParamName("rows");
        config.setDefaultPageSize(10);
        
        //config.setDefaultMediaType(MediaType.APPLICATION_JSON);
        //config.setReturnBodyForPutAndPost(true);
        
       
    }
}