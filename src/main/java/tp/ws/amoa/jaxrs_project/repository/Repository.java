package tp.ws.amoa.jaxrs_project.repository;

import java.util.HashMap;
import java.util.Map;

import tp.ws.amoa.jaxrs_project.model.Customer;
import tp.ws.amoa.jaxrs_project.model.Order;
import tp.ws.amoa.jaxrs_project.model.Item;

public class Repository {
    private static Map<Long, Order> orders = new HashMap<>();
    private static Map<Long, Customer> customers = new HashMap<>();
    private static Map<Long, Item> items = new HashMap<>();
    public static Map<Long, Order> getOrders() {
        return orders;
    }

    public static Map<Long, Customer> getCustomers() {
        return customers;
    }
    

    public static Map<Long, Item> getItems() {
        return items;
    }
}
