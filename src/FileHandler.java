import java.io.*;

public class FileHandler {
    private BufferedReader reader;
    private BufferedWriter writer;
    private Logic contactLogic = new Logic();

    public FileHandler(Logic contactLogic){
        this.contactLogic  = contactLogic;
    }

    public void read(){
        try {
            reader = new BufferedReader(new FileReader("D:\\InteliJ Projects\\ContactApp\\src\\Contacts.txt"));
            String line;
            while((line = reader.readLine())!=null){
                    // read next line
                String name = line;
                String number=  reader.readLine();

                Contact contact = new Contact(name, number);
                contactLogic.add(contact);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void write() throws IOException {
        BufferedWriter  bw = new BufferedWriter(new FileWriter("D:\\InteliJ Projects\\ContactApp\\src\\Contacts.txt"));
        contactLogic.writeItem(bw);
    }
}
