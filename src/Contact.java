public class Contact {
    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber){
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName(){
        return this.contactName;
    }

    public String getContactNumber(){
        return this.contactNumber;
    }

    public String toString(){
        return "Name: "+this.contactName+"\n"+"Phone number: "+this.contactNumber+"\n"+"-------";
    }

    public void setContactName(String updateContactName){
        this.contactName = updateContactName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
