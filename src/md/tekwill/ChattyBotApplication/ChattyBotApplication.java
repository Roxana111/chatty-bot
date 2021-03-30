package md.tekwill.ChattyBotApplication;
import java.util.Scanner;
public class ChattyBotApplication {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("\uD83D\uDC4B Hello there friend! \uD83D\uDC4B");
        System.out.println("\uD83E\uDD16 I'm named the Chatty-Bot! ");
        System.out.println("\uD83D\uDE0D I was created during the Java Fundamentals Course of March-June 2021. Born during the COVID pandemic! Can you believe that? \uD83D\uDE32 ");
        System.out.println("\n\uD83E\uDD14 So friend, can you remind me your name? ");
        String name=in.nextLine();
        System.out.println("This is a wonderful name you have there,"+" "+name+"!");
        System.out.println("\nBelieve it or not, but I can guess your age!");
        System.out.println("\uD83E\uDD14 Add 7 to your age, and write it in: ");
        int ageplusseven=in.nextInt();
        System.out.println("Hey "+name+",your age is"+" "+(ageplusseven-7)+"!");
        System.out.println("\uD83D\uDE04 Nah, just kidding! That was too easy! Lets get to the real thing. \uD83D\uDE10 ");




    }
}
