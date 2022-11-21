import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість клієнтів");
        int N = scanner.nextInt();  //N < 13, щоб не трапилось переповнення int
        System.out.println("Кількість можливих варіантів доставлення товару - " + factorial(N));
    }
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int c = n * factorial(n - 1);
            return c;
        }
    }
}
// За надмірно великої глибини рекурсії може настати переповнення стека викликів