package tp.ws.amoa.jaxrs_project.model;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import tp.ws.amoa.jaxrs_project.resource.ItemResource;
import tp.ws.amoa.jaxrs_project.resource.OrderResource;
import tp.ws.amoa.jaxrs_project.resource.CustomerResource;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

@ApplicationPath("/api")
public class RestApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<>(Arrays.asList(
                ItemResource.class,
                OrderResource.class,
                CustomerResource.class
        ));
    }
}

