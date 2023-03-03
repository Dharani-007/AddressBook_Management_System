
import java.util.Scanner;
public class AddNewContact {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;
    private final String phone;
    private final String email;

    Entry(String firstName, String lastName, String address, String city, String state,
          String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    Entry() {
        this("", "", "", "", "", "", "", "");
    }

    public String toString() {
        return "First Name:" + firstName + "\nLast Name:" + lastName + "\nAddress:" + address +
                "\nState:" + state + "\nCity:" + city + "\nZIP:" + zip + "\nPhone:" + phone + "\nEmail:" + email;

    }

    public AddNewContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        this.firstName = sc.next();
        System.out.println("Enter last Name");
        this.lastName = sc.next();
        System.out.println("Enter Address");
        this.address = sc.next();
        System.out.println("Enter Your City Name");
        this.city = sc.next();
        System.out.println("Enter Your State");
        this.state = sc.next();
        System.out.println("Enter Zip");
        this.zip = sc.next();
        System.out.println("Enter Phone Number");
        this.phone = sc.next();
        System.out.println("Enter Email");
        this.email = sc.next();
    }

    public String toString() {
        return "First Name:" + firstName + "\nLast Name:" + lastName + "\nAddress:" + address +
                "\nState:" + state + "\nCity:" + city + "\nZIP:" + zip + "\nPhone:" + phone + "\nEmail:" + email;

    }

}
    public int getLength(){
        return content.length;
    }
    //Adds an entry to the book
    public void addEntry(String firstName, String lastName, String address, String city,
                         String state, String zip, String phone, String email){
        content[entries] = new Entry(firstName, lastName, address, city, state, zip, phone, email);
        entries++;
    }

    //Edits the values of an entry according to the name
    public void editEntry(String firstName, String lastName, String address, String city,
                          String state, String zip, String phone, String email, String name){
        for (int i = 0;i<content.length;i++) {
            if (Objects.equals(content[i].firstName, name))
                content[i] = new Entry(firstName, lastName, address, city, state, zip, phone, email);
            else
                System.out.println("Person Not found at Entry");
        }
    }
}
    /**private int entries = 0;
    Entry[] content;
    public void initEntries(int e){
        content = new Entry[e];
        for (int i = 0;i<content.length;i++){      //Initializes an array of entries, then loops through to initialize each individual entry
            content[i] = new Entry();
        }
    }**/
public class
    public static void main(String[] args) {
        AddNewContact obj1 = new AddNewContact();
        System.out.println(obj1.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New Contact");
        int noOfEntry = sc.nextInt();

        String list[] = new String[noOfEntry];

        for (int i=0; i<noOfEntry; i++) {
            System.out.println("Enter Value For contact No."+(i+1));
            AddNewContact obj = new AddNewContact();
            String contactDetails = obj.toString();
            list[i]=contactDetails;
        }
        for (int i=0; i<noOfEntry; i++){
            System.out.println(list[i]);
        }
    }
}
