import java .util.Scanner;
public class AddressBook {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zipcode;
    public String phoneNo;
    public String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipcode;
    }

    public void setZipCode(String zipcode) {
        this.zipcode = zipcode;
    }


    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    Scanner sc = new Scanner(System.in);
    public void setContactDetails() {
        System.out.print(" Enter First Name : ");
        setFirstName(sc.nextLine());
        System.out.print(" Enter Last Name : ");
        setLastName(sc.nextLine());
        System.out.print(" Enter Address : ");
        setAddress(sc.nextLine());
        System.out.print(" Enter city : ");
        setCity(sc.nextLine());
        System.out.print(" Enter State : ");
        setState(sc.nextLine());
        System.out.print(" Enter Zip Code : ");
        setZipCode(sc.nextLine());
        System.out.print(" Enter Phone Number : ");
        setPhoneNo(sc.nextLine());
        System.out.print(" Enter Email : ");
        setEmail(sc.nextLine());
    }
}
