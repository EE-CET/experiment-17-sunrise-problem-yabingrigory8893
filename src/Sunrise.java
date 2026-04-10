import java.util.Scanner;

public class Sunrise {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextInt()) return;
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println(0);
                return;
            }
            int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    heights[i] = scanner.nextInt();
                }
            }

            int count = 1;
            int maxHeight = heights[0];

            for (int i = 1; i < n; i++) {
                if (heights[i] > maxHeight) {
                    count++;
                    maxHeight = heights[i];
                }
            }
            System.out.println(count);
        }
    }
}
