import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int jumlah = Integer.parseInt(input.nextLine());
        int jam = jumlah * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nama, jam, jumlah);
    }
}
