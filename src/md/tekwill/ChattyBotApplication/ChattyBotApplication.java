package md.tekwill.ChattyBotApplication;

import java.util.Scanner;

public class ChattyBotApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\uD83D\uDC4B Hello there friend! \uD83D\uDC4B");
        System.out.println("\uD83E\uDD16 I'm named the Chatty-Bot! ");
        System.out.println("\uD83D\uDE0D I was created during the Java Fundamentals Course of March-June 2021. Born during the COVID pandemic! Can you believe that? \uD83D\uDE32 ");
        System.out.println("\n\uD83D\uDE0E So friend, can you remind me your name? ");
        String name = in.nextLine();
        System.out.println("This is a wonderful name you have there," + " " + name + "!");
        System.out.println("\nBelieve it or not, but I can guess your age!");
        System.out.println("\uD83D\uDE0E Say me the reminders of dividing your age by 3,5 and 7: ");
        int remainder1 = in.nextInt();
        int remainder2 = in.nextInt();
        int remainder3 = in.nextInt();
        int userAge = (remainder1 * 70 + remainder2 * 21 + remainder3 * 15) % 105;
        System.out.println(name + "! Using magic I guess, your age is " + userAge + "!");
        System.out.println("\uD83D\uDE10 But I'm a simple bot, and I might be wrong. \uD83D\uDE04");
        System.out.println("\nTell me your real age, and let's see if my guess is right: ");
        int realAge = in.nextInt();
        for (; realAge > 120 || realAge < 0; realAge = in.nextInt()) {
            String oldOrYoung = realAge > 120 ? "old" : "young";

            System.out.println("Heeeeeeey, somebody must be joking here. You can't be that " + oldOrYoung + "! Please try again!");
            System.out.println("Tell me your real age, and let's see if my guess is right: ");
        }

        if (realAge == userAge) {
            System.out.println("\uD83D\uDE04Yaaay! In the end, I'm still capable of doing something!\uD83D\uDE0D");
        } else if (realAge > 0 && realAge < 120) {
            System.out.println("\uD83D\uDE1E Ohh! Sorry " + name + ",I'm still learning. I hope you still believe in magic!");
        }
        if (realAge < 7) {
            System.out.println("Wow " + name + "! You are very young, just " + realAge + " years old and you're already running an app by yourself. That's sweet! Try and learn some programming, maybe you'll be the Iron Man of our century?");
        } else if (realAge < 15) {
            System.out.println("Hey " + name + ", you're just " + realAge + " years old, what a good age to gain some basic knowledge in programming!");
        } else if (realAge < 55) {
            System.out.println("Oh my, " + name + ", your age is " + realAge + ". That's the most perfect time to learn programming!");
        } else if (realAge < 120) {
            System.out.println("Oh, " + name + ", your age is " + realAge + ". You have many years ahead! It's never too late to learn programming!");
        }
        System.out.println("\nYou know what else I can do? I can count to any number you want! Tell me when to stop: ");
        int numberstop = in.nextInt();
        for (int i = 0; i <= numberstop; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int answer = in.nextInt();
        for (; answer != 2; answer = in.nextInt()) {
            System.out.println("Please try again.");
        }
        System.out.println("Heeey " + name + " you're right! But it's time for me to go to sleep. Wake me up later when you're bored!");
    }
}
