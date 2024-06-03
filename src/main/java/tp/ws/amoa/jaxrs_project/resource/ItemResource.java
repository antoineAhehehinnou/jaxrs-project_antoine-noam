package tp.ws.amoa.jaxrs_project.resource;

import java.util.List;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import tp.ws.amoa.jaxrs_project.model.Item;
import tp.ws.amoa.jaxrs_project.service.ItemsManagementService;

@Path("/items")
public class ItemResource {

    private ItemsManagementService itemsManagementService = new ItemsManagementService();

    @POST
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces(MediaType.TEXT_PLAIN)
    public long addItem(Item item) {
        return itemsManagementService.addItem(item);
    }

    @GET
    @Path("/{itemId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Item getItemDetails(@PathParam("itemId") long id) {
        return itemsManagementService.getItem(id);
    }

    @PUT
    @Path("/{itemId}")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void updateItem(@PathParam("itemId") long id, Item item) {
        item.setId(id);
        itemsManagementService.updateItem(item);
    }

    @DELETE
    @Path("/{itemId}")
    public void deleteItem(@PathParam("itemId") long id) {
        itemsManagementService.deleteItem(id);
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Item> getAllItems() {
        return itemsManagementService.getAll();
    }
}
