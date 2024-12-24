import java.time.LocalDate;
import java.time.Period;

public class Admin extends User {

    // Constructors
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day); // ใช้ constructor ของ User
    }

    public Admin() {
        super(); // ใช้ default constructor ของ User
    }

    // Display basic info
    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Birthday: " + this.dob);
        System.out.println("User type: admin.");
    }

    // Overloaded displayInfo with full details
    void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + this.name);
            System.out.println("Birthday: " + this.dob);
            System.out.println("User type: admin.");
            System.out.println("Today: " + LocalDate.now());
        } else {
            System.out.println("Name: " + this.name);
        }
    }
    public void displayHappyBirthday() {
        if (isBirthday()) {
            int age = calculateAge();
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        } /*else {
            System.out.println("Today is not your birthday, " + this.name + ".");
        }*/
    }

    // Method to calculate age
    private int calculateAge() {
        LocalDate today = LocalDate.now();
        return Period.between(this.dob, today).getYears();
    }
}