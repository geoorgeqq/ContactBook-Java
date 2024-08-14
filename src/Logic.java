import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public Logic() {
    }

    public void add(Contact contact) {
        if (contact.getContactNumber().length() == 10) {
            contacts.add(contact);
            contact.setContactName(contact.getContactName());
        } else {
            System.out.println("Invalid phone number!");
        }
    }

    public int getSize() {
        return this.contacts.size();
    }

    public void writeItem(BufferedWriter bw) throws IOException {
        for (int i = 0; i < contacts.size(); i++) {
            bw.write(contacts.get(i).getContactName() + "\n");
            bw.write(contacts.get(i).getContactNumber() + "\n");
        }
        bw.close();
    }

    public void remove(String contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().toLowerCase().contains(contact.toLowerCase())) {
                contacts.remove(i);
            }
        }

    }

    public void print() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    public void updateName(String contact, String updatedName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().toLowerCase().contains(contact.toLowerCase())) {
                contacts.get(i).setContactName(updatedName);
            }
        }
    }

    public void updateNumber(String contact, String updateNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().toLowerCase().contains(contact.toLowerCase())) {
                if (updateNumber.length() == 10)
                    contacts.get(i).setContactNumber(updateNumber);
            }
        }
    }
}
