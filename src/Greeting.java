import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String nama = name.nextLine();
        System.out.println("Hello, selamat datang " + nama + "!");
    }
}