public class Admin extends User{

    String hallName;

    public Admin(String adminName, String adminPhoneNumber, String hallName){
        super(adminName, adminPhoneNumber);
        this.hallName = hallName;
    }

    @Override
    public String toString() {
        return this.userName + this.phoneNumber + this.hallName;
    }
}
