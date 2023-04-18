import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String depan = input.nextLine();
        String belakang = input.nextLine();
        int tahun = Integer.parseInt(input.nextLine());
        String kota = input.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", depan, belakang, tahun, kota);
    }
}
