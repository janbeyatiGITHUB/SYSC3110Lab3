import java.util.List;
import java.util.ArrayList;

public class AddressBook {

    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>(); // initialize the list
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
            System.out.println(buddy.getName() + ", added to the AddressBook.");
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddy != null && buddies.contains(buddy)) {
            buddies.remove(buddy);
            System.out.println(buddy.getName() + ", removed from the AddressBook.");
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(buddy1);
    }
}
