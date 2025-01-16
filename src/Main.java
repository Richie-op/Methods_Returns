public class Main {
    public static void main(String[] args) {
//InvestmentApp app = new  InvestmentApp();
       // System.out.println(app.updateAccounts(60000, 10000, 3000));
       // System.out.println(app.updateAccounts(49000, 15000, 5000));
        //System.out.println(app.updateAccounts(30000, 20000, 7000));//

        User user1 = new User("jason", "Jones", "Jones@gmail.com", "password234");
        User user2 = new User("Stacy", "spence", "Stacy@yahoo.com", "Secure567");

        System.out.println("User 1 First Name: " + user1.getEmail());
        System.out.println("User 1 Email: " + user1.getEmail());
        user1.setFirstName("Jason");
        user1.setEmail("Jones@gmail.com");
        System.out.println("Updated User 1 First Name: " + user1.getFirstName());
        System.out.println("Updated User ! Email: " + user1.getEmail());

        System.out.println("User 2 Last Name: " + user2.getLastName());
        System.out.println("User 2 Password: " + user2.getPassword());
        user2.setLastName("spence");
        user2.setPassword("Secure567");
        System.out.println("Updated User 2 Last Name: " + user2.getLastName());
        System.out.println("Updated User 2 Password: " + user2.getPassword());

    }

}