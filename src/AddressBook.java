import java.util.List;

public class AddressBook {

    private List<BuddyInfo> buddies;

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
            System.out.println(buddy.getName() + " added to the AddressBook.");
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddy != null && buddies.contains(buddy)) {
            buddies.remove(buddy);
            System.out.println(buddy.getName() + " removed from the AddressBook.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
