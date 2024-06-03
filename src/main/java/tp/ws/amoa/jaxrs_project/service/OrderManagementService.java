package tp.ws.amoa.jaxrs_project.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import tp.ws.amoa.jaxrs_project.repository.Repository;
import tp.ws.amoa.jaxrs_project.model.Order; 


public class OrderManagementService {

    private Map<Long, Order> orders = Repository.getOrders();
    private AtomicLong idCounter = new AtomicLong();
    public List<Order> getOrders() {
        return new ArrayList<>(orders.values());
    }

    public Order submitOrder(Order order) {
        long orderId = idCounter.incrementAndGet();
        order.setId(orderId);
        orders.put(orderId, order);
        return order;
    }

    public Order getOrderDetails(long orderId) {
        return orders.get(orderId);
    }

    public List<Order> getOrdersForCustomer(long customerId) {
        List<Order> customerOrders = new ArrayList<>();
        for (Order order : orders.values()) {
            if (order.getCustomerId() == customerId) {
                customerOrders.add(order);
            }
        }
        return customerOrders;
    }

    public Order updateOrder(Order order) {
        orders.put(order.getId(), order);
        return order;
    }

    public Order cancelOrder(long orderId) {
        return orders.remove(orderId);
    }
}
