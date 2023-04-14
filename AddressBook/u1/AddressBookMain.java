package AddressBook.u1;

import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    Contact person1 = new Contact();

    public void addPersonalDetail() {

        System.out.println("Enter first name");
        String firstname = scanner.nextLine();
        person1.setFirstName(firstname);

        System.out.println("Enter Last name");
        String LastName = scanner.nextLine();
        person1.setLastName(LastName);

        System.out.println("Enter address");
        String address = scanner.nextLine();
        person1.setAddress(address);

        System.out.println("Enter city");
        String city = scanner.nextLine();
        person1.setCity(city);

        System.out.println("state");
        String State = scanner.nextLine();
        person1.setState(State);

        System.out.println("Enter Zip number");
        int zip = scanner.nextInt();
        person1.setZip(zip);

        System.out.println("Mobile Number");
        long MobileNumber = scanner.nextLong();
        person1.setMobileNo(MobileNumber);

        System.out.println("email");
        String Email = scanner.nextLine();
        person1.setEmail(Email);


        System.out.println(person1);
        System.out.println();
    }

    public void editPersonDetail() {
        System.out.println("Edit the Contact");
        String s;
        do {
            System.out.println("Choose option");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("First Name");
                    String firstName = scanner.nextLine();
                    person1.setFirstName(firstName);
                    break;
                case 2:
                    System.out.println("Last Name");
                    String lastName = scanner.nextLine();
                    person1.setLastName(lastName);
                    break;
                case 3:
                    System.out.println("address");
                    String address = scanner.nextLine();
                    person1.setAddress(address);
                    break;
                case 4:
                    System.out.println("city");
                    String city = scanner.nextLine();
                    person1.setCity(city);
                    break;
                case 5:
                    System.out.println("state");
                    String state = scanner.nextLine();
                    person1.setState(state);
                    break;
                case 6:
                    System.out.println("zip");
                    int zip = scanner.nextInt();
                    person1.setZip(zip);
                    break;
                case 7:
                    System.out.println("MobileNo");
                    long mobileNo = scanner.nextLong();
                    person1.setMobileNo(mobileNo);
                    break;
                case 8:
                    System.out.println("Mail");
                    String Email = scanner.nextLine();
                    person1.setEmail(Email);
                    break;
                default:
                    System.out.println("default");
                    break;
            }
            System.out.println("edit the contact");
            System.out.println(person1);
            System.out.println("Enter");
            s = scanner.next();
            System.out.println();
        } while (s.equals("enter"));
    }

    public void deletePersonDetail() {
        System.out.println("delete the Contact");
        String S;
        do {
            System.out.println("Choose any option");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Firstname");
                    String firstName = scanner.nextLine();
                    person1.setFirstName(firstName);
                case 2:
                    System.out.println("LastName");
                    String lastName = scanner.nextLine();
                    person1.setLastName(lastName);
                case 3:
                    System.out.println("address");
                    String address = scanner.nextLine();
                    person1.setAddress(address);
                case 4:
                    System.out.println("city");
                    String city = scanner.nextLine();
                    person1.setCity(city);
                case 5:
                    System.out.println("state");
                    String state = scanner.nextLine();
                    person1.setState(state);
                case 6:
                    System.out.println("address");
                    int zip = scanner.nextInt();
                    person1.setZip(zip);
                case 7:
                    System.out.println("address");
                    long mobileNo = scanner.nextLong();
                    person1.setMobileNo(mobileNo);
                case 8:
                    System.out.println("Email");
                    String email = scanner.nextLine();
                    person1.setEmail(email);
                case 9:
                    System.out.println("default");
                    break;
            }
            System.out.println("delete");
            System.out.println("enter");
            System.out.println(person1);
            S = scanner.nextLine();
            System.out.println();
        } while (S.equals("enter"));
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
        AddressBookMain obj = new AddressBookMain();
        obj.addPersonalDetail();
        obj.editPersonDetail();
        obj.deletePersonDetail();
    }

}

