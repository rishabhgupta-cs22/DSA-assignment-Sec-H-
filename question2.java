import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int weeklyCost = 6 * X + Y;
        System.out.println(weeklyCost);
        sc.close();
    }
}
