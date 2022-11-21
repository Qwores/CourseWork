public class Admin extends User{

    String hallName;

    public Admin(String adminName, String adminPhoneNumber, String hallName){
        super(adminName, adminPhoneNumber);
        this.hallName = hallName;
    }

    @Override
    public String toString() {
        return "\n" + "Admin: " + this.userName + "\n" + "Phone number: " + this.phoneNumber
                + "\n" + "Hall name: " + this.hallName + "\n";
    }
}
