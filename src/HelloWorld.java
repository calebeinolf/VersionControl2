import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args ){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
       String name = scan.nextLine();
        System.out.println("Your name is: " + name);



    }
}
