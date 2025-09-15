import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("123 carleton", "456", "person");

        addressBook.addBuddy(buddy);
        System.out.println("Added: " + buddy.getName());

        System.out.println("Address Book");


        addressBook.removeBuddy(buddy);
        System.out.println("Removed: " + buddy.getName());
    }
}
