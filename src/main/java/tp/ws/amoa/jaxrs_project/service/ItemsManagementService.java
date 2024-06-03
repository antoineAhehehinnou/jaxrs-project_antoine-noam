package tp.ws.amoa.jaxrs_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import tp.ws.amoa.jaxrs_project.model.Item;

public class ItemsManagementService {

    private static final Logger logger = Logger.getLogger(ItemsManagementService.class.getName());
    private static Map<Long, Item> items = new ConcurrentHashMap<>();
    private static AtomicLong idCounter = new AtomicLong();

    public long addItem(Item item) {
        long id = idCounter.incrementAndGet();
        item.setId(id);
        items.put(id, item);
        logger.info("Item added with ID: " + id);
        return id;
    }

    public Item getItem(long id) {
        logger.info("Fetching item with ID: " + id);
        return items.get(id);
    }

    public void updateItem(Item item) {
        items.put(item.getId(), item);
        logger.info("Item updated with ID: " + item.getId());
    }

    public void deleteItem(long id) {
        items.remove(id);
        logger.info("Item deleted with ID: " + id);
    }

    public List<Item> getAll() {
        logger.info("Fetching all items");
        return new ArrayList<>(items.values());
    }
}
