package tp.ws.amoa.jaxrs_project.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.json.bind.annotation.JsonbPropertyOrder;

@XmlRootElement
@JsonbPropertyOrder({"id", "name", "price"})
public class Item {
    private long id;
    private String name;
    private double price;

    public Item() {}

    public Item(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
