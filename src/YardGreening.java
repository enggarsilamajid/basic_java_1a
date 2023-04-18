import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double luas = Double.parseDouble(input.nextLine());
    double harga = 7.61 * luas;
    double diskon = 0.18 * harga;
    double akhir = harga - diskon;
    System.out.println(akhir);
    System.out.println(diskon);
    }
}

//    System.out.println("Total harga : " + harga + "USD");
//    System.out.println("Total diskon : " + diskon + "USD");
//    System.out.println("Harga akhir : " + akhir + "USD");
