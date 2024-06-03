package tp.ws.amoa.jaxrs_project.resource;

import tp.ws.amoa.jaxrs_project.service.OrderManagementService;
import tp.ws.amoa.jaxrs_project.model.Order;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/orders")
public class OrderResource {

    OrderManagementService orderManagementService = new OrderManagementService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrders() {
        return orderManagementService.getOrders();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order submitOrder(Order order) {
        return orderManagementService.submitOrder(order);
    }

    @PUT
    @Path("/{orderId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order updateOrder(@PathParam("orderId") long id, Order order) {
        order.setId(id);
        return orderManagementService.updateOrder(order);
    }

    @GET
    @Path("/{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrderDetails(@PathParam("orderId") long id) {
        return orderManagementService.getOrderDetails(id);
    }
}
