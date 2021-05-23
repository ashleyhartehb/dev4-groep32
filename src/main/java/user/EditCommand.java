package user;
import java.util.Scanner;

public class EditCommand implements Command{
User user;

public EditCommand(User user){ this.user = user; }

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
//username
        System.out.println("Do you want to change your username ? Type y for 'yes' or n for 'no'");
        String usernameAnswer = scan.nextLine();  //read user input

        if(usernameAnswer == "y"){
            System.out.println("What's your new username?");
            String username = scan.nextLine();  //read user input
            user.setUsername(username);

        }else if(usernameAnswer == "n"){
            System.out.println("You didn't change anything");
        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }
//firstname
        System.out.println("Do you want to change your first name ? Type y for 'yes' or n for 'no'");
        String firstnameAnswer = scan.nextLine();

        if(firstnameAnswer == "y"){
            System.out.println("What's your new first name?");
            String firstname = scan.nextLine();  //read user input
            user.setFirstName(firstname);

        }else if(firstnameAnswer == "n"){
            System.out.println("You didn't change anything.");

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }
//lastname
        System.out.println("Do you want to change your last name ? Type y for 'yes' or n for 'no'");
        String lastnameAnswer = scan.nextLine();

        if(lastnameAnswer == "y"){
            System.out.println("What's your new last name?");
            String lastname = scan.nextLine();  //read user input
            user.setLastName(lastname);

        }else if(lastnameAnswer == "n"){
            System.out.println("You didn't change anything.");

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }
//age
        System.out.println("Do you want to change your age ? Type y for 'yes' or n for 'no'");
        String ageAnswer = scan.nextLine();

        if(ageAnswer == "y"){
            System.out.println("What's your correct age?");
            int age = scan.nextInt();  //read user input
            user.setAge(age);

        }else if(ageAnswer == "n"){
            System.out.println("You didn't change anything.");

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }
//email
        System.out.println("Do you want to change your email ? Type y for 'yes' or n for 'no'");
        String emailAnswer = scan.nextLine();

        if(emailAnswer == "y"){
            System.out.println("What's your correct age?");
            String email = scan.nextLine();  //read user input
            user.setEmail(email);

        }else if(ageAnswer == "n"){
            System.out.println("You didn't change anything.");

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }
//phone
        System.out.println("Do you want to change your phone ? Type y for 'yes' or n for 'no'");
        String phoneAnswer = scan.nextLine();

        if(phoneAnswer == "y"){
            System.out.println("What's your new phone number?");
            int phone = scan.nextInt();  //read user input
            user.setPhone(phone);

        }else if(phoneAnswer == "n"){
            System.out.println("You didn't change anything.");

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }
//interests
        System.out.println("Do you want to change your interests ? Type y for 'yes' or n for 'no'");
        String interestsAnswer = scan.nextLine();

        if(interestsAnswer == "y"){
            System.out.println("Which are your interests? Write STOP if you want to stop inputting interests");
            System.out.println(user.getSubjects());
            boolean looper = true;
            String[] interests = new String[0];
            while(looper){
                String input = scan.nextLine();  //read user input
                if(input != ""){
                push(interests, input);
                }else if(input == "STOP"){
                    break;
                }else{
                    System.out.println("You didn't write anything !");
                }
            }
            user.setInterests(interests);

        }else if(interestsAnswer == "n"){

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }

    }


    private static String[] push(String[] array, String item) {
        String[] newString = new String[array.length + 1];
        for (int i = 0; i < array.length; i++)
            newString[i] = array[i];
        newString[array.length] = item;
        return newString;
    }
}
