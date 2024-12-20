package mapTasks.task1;

import java.util.HashMap;
import java.util.Map;

public class Phone {

    private Map<String, Integer> contacts;

    public Phone() {
        this.contacts = new HashMap<>();
    }

    public void setContacts(Map<String, Integer> contacts) {
        this.contacts = contacts;
    }

    public void addContact(String name, int number) {
        if (contacts.containsKey(name)) {
            System.out.println("\nContacts with this name already exists");
        } else {
            contacts.put(name, number);
            System.out.println("\nContact added " + name);
        }
    }

    public String getContact(String name) {
        if (contacts.containsKey(name)) {
            return "Name: " + name + ", Phone: " + contacts.get(name);
        } else {
            return "Contact not found: " + name;
        }
    }

    public void removeContact(String name, int number) {
        if (contacts.containsKey(name)) {
            contacts.remove(name, number);
            System.out.println("\nContact deleted: " + name);
        } else {
            System.out.println("\nContact not found: " + name);
        }
    }

    public void getAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            System.out.println("\nALl contacts: ");
            for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
            }
        }
    }
}
