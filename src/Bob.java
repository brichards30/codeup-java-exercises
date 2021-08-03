import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        //Answers 'Sure' if input ends in ?
        //Answers 'Whoa, chill out!' if input ends with !
        //Answers 'Fine. Be that way!' if response if empty
        //Answers 'Whatever' to anything else

        Scanner bobReactions = new Scanner(System.in);

        boolean answerQuestion = true;


        do {
            System.out.println("What do you want to say to Bob?");
            String userResponse = bobReactions.nextLine().trim();

            if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Do you want to say anything else? (y/n)");

            String userNewResponse = bobReactions.nextLine();

            if (!userNewResponse.equalsIgnoreCase("y")) {
                answerQuestion = false;
                System.out.println("Stop wasting Bob's time.");
            }
        } while (answerQuestion);
    }
}

