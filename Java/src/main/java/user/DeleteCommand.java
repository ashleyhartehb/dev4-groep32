package user;

import java.util.Scanner;

public class DeleteCommand implements Command{
    User user;
    public DeleteCommand(User user){ this.user = user; }

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to delete your age ? Type y for 'yes' or n for 'no'");
        String ageAnswer = scan.nextLine();

        if(ageAnswer == "y"){
            int age = Integer.parseInt(null);
            user.setAge(age);

        }else if(ageAnswer == "n"){
            System.out.println("You didn't change anything.");

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }

        System.out.println("Do you want to change your phone ? Type y for 'yes' or n for 'no'");
        String phoneAnswer = scan.nextLine();

        if(phoneAnswer == "y"){
            System.out.println("What's your new phone number?");
            int phone = Integer.parseInt(null);
            user.setPhone(phone);

        }else if(phoneAnswer == "n"){
            System.out.println("You didn't change anything.");

        }else{
            System.out.println("Wrong output, write y if you want to change this element or n if you don't want to.");
        }

        System.out.println("Do you want to change your interests ? Type y for 'yes' or n for 'no'");
        String interestsAnswer = scan.nextLine();

        if(interestsAnswer == "y"){
            System.out.println("Which interests do you want to delete? Write STOP if you want to stop inputting interests");
            System.out.println(user.getInterests());
            boolean looper = true;
            String[] interests = new String[0];
            while(looper){
                String input = scan.nextLine();  //read user input
                if(input != ""){
                    pop(interests, input);
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

    private static String[] pop(String[] array, String item) {
        String[] newString = new String[array.length - 1];
        for (int i = 0; i < array.length; i++)
            newString[i] = array[i];
        newString[array.length] = item;
        return newString;
    }
}
