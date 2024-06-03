package tp.ws.amoa.jaxrs_project.model;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    }
//    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/filiere/{f}")
    public String getWithPathParams(@PathParam("f") String f) {
        return "GET HTTP Method with path-param value =" + f ;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getwithQueryParams(@QueryParam("filiere") String f) {
    	return "GET HTTP Method with query-param value =\"" + f;
    }
    
        
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String postIt() {
    	return "POST HTTP Method";
    }
}
