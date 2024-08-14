import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logic contactLogic = new Logic();
        contactLogic.add(new Contact("George","0721222222"));
        contactLogic.add(new Contact("Mihai","0722111111"));
        System.out.println();
        System.out.println("ContactApp \n-------");
        contactLogic.print();

        while (true){
            System.out.println("Available commands:");
            System.out.println("1 - Add contact");
            System.out.println("2 - Select contact");
            System.out.println("3 - Quit");
            String command = scanner.nextLine();
            if(command.equals("3")){
                break;
            }
            if(command.equals("1")){
                System.out.println("Adding a new contact: ");
                System.out.println("Name");
                String name = scanner.nextLine();
                System.out.println("Phone number:");
                String number = scanner.nextLine();
                System.out.println();
                contactLogic.add(new Contact(name,number));
                contactLogic.print();
            }else if(command.equals("2")){
                System.out.println("Contact to be selected: ");
                String contact = scanner.nextLine();
                System.out.println("Remove or edit?");
                String choice = scanner.nextLine();
                if(choice.equals("remove")){
                    contactLogic.remove(contact);
                    System.out.println("Updated contacts list: ");
                    contactLogic.print();
                }else if(choice.equals("edit")){
                    System.out.println("Edit name/phone number/both");
                    String editChoice = scanner.nextLine();
                    if(editChoice.equals("name")){
                        System.out.println("Update name:");
                        String updatedName = scanner.nextLine();
                        contactLogic.updateName(contact,updatedName);
                        contactLogic.print();
                    }else if (editChoice.equals("phone number")){
                        System.out.println("Update phone number: ");
                        String updatePhoneNumber = scanner.nextLine();
                        contactLogic.updateNumber(contact,updatePhoneNumber);
                        contactLogic.print();
                    }
                }
            }

        }


    }
}