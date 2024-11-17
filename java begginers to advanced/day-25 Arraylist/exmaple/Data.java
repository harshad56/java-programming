
import java.util.ArrayList;

class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;

        }

        myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {

        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {

        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {

        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". "
                    + this.myContacts.get(i).getName() + " -> "
                    + this.myContacts.get(i).getPhoneNumber());
        }
    }
}

public class Data {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("879574567346");

        // Create some contacts
        Contact contact1 = new Contact("John Doe", "123456789");
        Contact contact2 = new Contact("Jane Smith", "987654321");

        // Add contacts
        System.out.println(mobilePhone.addNewContact(contact1));
        System.out.println(mobilePhone.addNewContact(contact2));

        // Print contacts
        mobilePhone.printContacts();

        // Update a contact
        Contact updatedContact = new Contact("John Doe", "111222333");
        System.out.println(mobilePhone.updateContact(contact1, updatedContact));

        // Print contacts again
        mobilePhone.printContacts();

        // Remove a contact
        System.out.println(mobilePhone.removeContact(updatedContact));

        // Print contacts again
        mobilePhone.printContacts();
    }
}
