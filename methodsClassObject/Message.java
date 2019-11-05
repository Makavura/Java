public class Message {
    
    String name, email, phone;

    public Message (String theName, String theEmail, String thePhone) {
        name  = theName;
        email = theEmail;
        phone = thePhone;
    }

    void displayEmail() {
        System.out.println("Email: " + email);
    }

    void displayPhone() {
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        Message John = new Message("John", "johndoe@xxx.com", "+254...");
        John.displayEmail();
        System.out.println(john.name);

        Message Priscilla = new Message("Priscilla", "pri@xxx.com", "+255...");
        Priscilla.displayPhone(); 
    }

}