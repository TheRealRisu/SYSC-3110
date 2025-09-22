public class BuddyInfo {

    private String address;
    private String phone;
    private String name;

    public BuddyInfo(String address, String phone, String name) {
        this.address = address;
        this.phone = phone;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("123 carleton", "456", "sabari");
        System.out.println("Hello " + buddyInfo.getName());
        //System.out.println("Hello World!");
    }
}
