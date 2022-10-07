
public class Pictures {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int k = 4; k > 0; k--) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            if (i == 2) {
                for (int k = 0; k < i-1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int i = 1; i <= 7; i++) {
            int k = 0;
            for (int j = 1; j <= 7-i; ++j) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}