import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {


        System.out.println("Brand");
        System.out.println("........");
        System.out.println("1, Nike");
        System.out.println("1, Adidas");
        System.out.println("1, Puma");
        System.out.println("1, I want to exit");
        Scanner scanner =new Scanner(System.in);
        int choice =scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("I want Nike......");
            case 2 -> System.out.println("I wat Adidas......");
            case 3 -> System.out.println("I want Nike.......");
            case 4 -> System.out.println("I want to exit.......");
            default -> System.out.println("Choice is mismatched.....");
        }

    }
}
