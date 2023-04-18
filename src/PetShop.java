import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dog = Integer.parseInt(input.nextLine());
        int cat = Integer.parseInt(input.nextLine());
        double costd = dog * 2.50;
        double costc = cat * 4;
        double total = costd + costc;
        System.out.printf("Total %f USD", total);
    }
}
