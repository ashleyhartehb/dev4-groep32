package user;

public class ShowCommand implements Command {
User user;

    @Override
    public void execute() {
        System.out.println("Username: " + user.getUsername());
        System.out.println("First name: " + user.getFirstName());
        System.out.println("Last name: " + user.getLastName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Interests: " + user.getInterests());

    }
}
