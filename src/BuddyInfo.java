public class BuddyInfo {

    private String name, address, phonenumber;

    public BuddyInfo(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return ("Name: " + this.name + ", Address: " + this.address + ", Phone Number: " + this.phonenumber);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "Carleton", "613");

        System.out.println("Hello " + buddy.getName());
    }
}
