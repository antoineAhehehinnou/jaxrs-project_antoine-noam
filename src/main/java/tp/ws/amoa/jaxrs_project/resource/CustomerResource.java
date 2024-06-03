package tp.ws.amoa.jaxrs_project.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import tp.ws.amoa.jaxrs_project.model.Customer;
import tp.ws.amoa.jaxrs_project.service.CustomerManagementService;

@Path("/customers")
public class CustomerResource {
	
	@Inject
    private CustomerManagementService customerService = new CustomerManagementService();

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces(MediaType.TEXT_PLAIN)
    public long addCustomer(Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GET
    @Path("/{customerId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Customer getCustomerDetails(@PathParam("customerId") long id) {
        return customerService.getCustomerDetails(id);
    }

    @PUT
    @Path("/{customerId}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void updateCustomer(@PathParam("customerId") long id, Customer customer) {
        customer.setId(id);
        customerService.updateCustomer(customer);
    }

    @DELETE
    @Path("/{customerId}")
    public void deleteCustomer(@PathParam("customerId") long id) {
        customerService.deleteCustomer(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
