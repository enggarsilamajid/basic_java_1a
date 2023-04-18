import java.util.Scanner;

public class Inches {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        double inci = Double.parseDouble(inc.nextLine());
        double centi = inci * 2.54;
        System.out.println(centi);
    }
}
