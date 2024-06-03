package tp.ws.amoa.jaxrs_project.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.json.bind.annotation.JsonbPropertyOrder;
import java.util.Date;
import java.util.List;



@XmlRootElement
@JsonbPropertyOrder({"id", "customer", "orderDate", "items"})
public class Order {
    
	
	private long id;
    private Customer customer;
    private Date orderDate;
    private List<Item> items;

    public Order() {}

    public Order(long id, Customer customer, Date orderDate, List<Item> items) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

	public long getCustomerId() {
		return customer.getId();
	}
}

