import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String itemId) {
        if (items.containsKey(itemId)) {
            items.remove(itemId);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void updateQuantity(String itemId, int quantity) {
        if (items.containsKey(itemId)) {
            items.get(itemId).setQuantity(quantity);
            System.out.println("Quantity updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void searchById(String itemId) {
        if (items.containsKey(itemId)) {
            System.out.println(items.get(itemId));
        } else {
            System.out.println("Item not found.");
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}