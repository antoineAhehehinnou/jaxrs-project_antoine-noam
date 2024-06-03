package tp.ws.amoa.jaxrs_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import tp.ws.amoa.jaxrs_project.model.Customer;
import tp.ws.amoa.jaxrs_project.repository.Repository;

public class CustomerManagementService {

    private Map<Long, Customer> customers = Repository.getCustomers();
    private AtomicLong idCounter = new AtomicLong();

    public long addCustomer(Customer customer) {
        long id = idCounter.incrementAndGet();
        customer.setId(id);
        customers.put(id, customer);
        return id;
    }

    public Customer getCustomerDetails(long id) {
        return customers.get(id);
    }

    public void updateCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public void deleteCustomer(long id) {
        customers.remove(id);
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers.values());
    }
}
