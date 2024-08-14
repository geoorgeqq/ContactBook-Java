import java.util.ArrayList;
import java.util.List;

public class Logic {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public Logic() {
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void remove(String contact){
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getContactName().toLowerCase().contains(contact.toLowerCase())){
                contacts.remove(i);
            }
        }

    }

    public void print() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    public void updateName(String contact, String updatedName){
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getContactName().toLowerCase().contains(contact)){
                contacts.get(i).setContactName(updatedName);
            }
        }
    }

    public void updateNumber(String contact, String updateNumber){
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getContactName().toLowerCase().contains(contact)){
                contacts.get(i).setContactNumber(updateNumber);
            }
        }
    }
}
