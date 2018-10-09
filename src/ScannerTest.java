import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your lame name?");
        String name = input.nextLine();
        System.out.println("Hello," + name + ",nice to meet you!");
    }
}
