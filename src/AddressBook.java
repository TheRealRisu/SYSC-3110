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

    public void printList(){
        System.out.println(buddies);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("444 uottawa", "456", "person");
        BuddyInfo buddy2 = new BuddyInfo("1234 c", "999", "new guy");

        addressBook.addBuddy(buddy);

        System.out.println("Address Book");
        addressBook.addBuddy(buddy2);
        addressBook.removeBuddy(buddy2);

        addressBook.removeBuddy(buddy);
    }
}
