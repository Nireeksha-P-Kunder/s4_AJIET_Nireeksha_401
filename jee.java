import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;   // ✅ must be here (global inside main)

        int prev = sc.nextInt();

        for (int i = 1; i < N; i++) {

            int current = sc.nextInt();

            if (current < prev) {
                count++;
            }

            prev = current;
        }

        System.out.println(count);

        sc.close();
    }
}
