import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khoang so nguyen to can tim: ");
        int N = sc.nextInt();
        int number = 2;
        while (number < N) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.print(number + " ");
            number++;

        }
        System.out.println(number);
    }
}
