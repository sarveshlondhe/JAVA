import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    // Other user details like name, address, etc.

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters for user details
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Item {
    private String name;
    private double price;
    private String location;
    private boolean isAvailable;

    public Item(String name, double price, String location) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.isAvailable = true;
    }

    // Getters and setters for item details
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Shop {
    private String name;
    private String location;
    private List<Item> items;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void displayItems() {
        System.out.println("Items in " + name + ":");
        for (Item item : items) {
            System.out.println("- " + item.getName() + " | Price: $" + item.getPrice() + " | Location: " + item.getLocation() + " | Available: " + (item.isAvailable() ? "Yes" : "No"));
        }
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

public class ShopTradeRentSystem {
    private Map<String, User> users;
    private List<Shop> shops;

    public ShopTradeRentSystem() {
        this.users = new HashMap<>();
        this.shops = new ArrayList<>();
    }

    public void addUser(String username, String password) {
        users.put(username, new User(username, password));
    }

    public void addShop(String name, String location) {
        shops.add(new Shop(name, location));
    }

    public void listShops() {
        System.out.println("Shops:");
        for (Shop shop : shops) {
            System.out.println("- " + shop.getName() + " | Location: " + shop.getLocation());
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available items in all shops:");
        for (Shop shop : shops) {
            shop.displayItems();
        }
    }

    // Other functionalities like listing shops, adding items, etc.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopTradeRentSystem system = new ShopTradeRentSystem();

        // Adding users
        system.addUser("user1", "password1");
        system.addUser("user2", "password2");

        // Adding shops
        system.addShop("Shop 1", "Location 1");
        system.addShop("Shop 2", "Location 2");

        // Example of listing items in a shop
        Shop shop1 = system.shops.get(0);
        shop1.addItem(new Item("Item 1", 10.99, "Location 1"));
        shop1.addItem(new Item("Item 2", 20.49, "Location 1"));

        // Example of user interaction
        System.out.println("Welcome to Shop Trade and Rent System!");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (system.users.containsKey(username) && system.users.get(username).getPassword().equals(password)) {
            // User logged in successfully
            System.out.println("Login successful!");
            boolean loggedIn = true;
            while (loggedIn) {
                System.out.println("Choose an option:");
                System.out.println("1. List shops");
                System.out.println("2. Display available items");
                System.out.println("3. Sell item");
                System.out.println("4. Rent item");
                System.out.println("5. Logout");
                System.out.print("Option: ");
                int option = -1;
                try {
                    option = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                switch (option) {
                    case 1:
                        system.listShops();
                        break;
                    case 2:
                        system.displayAvailableItems();
                        break;
                    case 3:
                        // Add functionality to sell item
                        break;
                    case 4:
                        // Add functionality to rent item
                        break;
                    case 5:
                        loggedIn = false;
                        System.out.println("Logged out successfully.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}
