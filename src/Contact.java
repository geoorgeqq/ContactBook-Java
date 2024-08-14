public class Contact {
    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }


    public void setContactName(String updateContactName) {
        this.contactName = updateContactName.substring(0, 1).toUpperCase() + updateContactName.substring(1);
    }

    public void setContactNumber(String updateContactNumber) {
        this.contactNumber = updateContactNumber;

    }

    public String toString() {
        return "Name: " + this.contactName + "\n" + "Phone number: " + this.contactNumber + "\n" + "-------";
    }
}
