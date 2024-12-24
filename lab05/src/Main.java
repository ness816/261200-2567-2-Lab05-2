public class Main {

    public static void main(String[] args) {
        User john = new User("john", 1954, 2, 18);
        john.displayInfo();
        System.out.println();
        User Sylvester = new User("Sylvester", 1946, 12, 24);
        Sylvester.displayInfo();
        System.out.println();
        Admin nicolas = new Admin("nicolas", 1964, 12, 24);
        nicolas.displayInfo();
        System.out.println();
        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);
        Sylvester.displayHappyBirthday();

    }
}