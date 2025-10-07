import java.util.Scanner;

public class Case {

    static void case1() {
        System.out.println("\nCase 1\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void case2() {
        System.out.println("\nCase 2\n");
        for (int i = 1; i <= 3; i++) {
            int num = i;
            for (int j = 0; j < 7; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }

    static void case3() {
        System.out.println("\nCase 3\n");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    static void case4() {
        System.out.println("\nCase 4\n");
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j <= 8; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void case5() {
        System.out.println("\nCase 5\n");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    static void case6() {
        System.out.println("\nCase 6\n");
        int x = 0, y = 0, z = 1;
        System.out.print(x + " " + y + " " + z + " ");
        for (int i = 3; i < 10; i++) {
            int next = x + y + z;
            System.out.print(next + " ");
            x = y;
            y = z;
            z = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== PILIH CASE ===");
            System.out.println("1. Case 1");
            System.out.println("2. Case 2");
            System.out.println("3. Case 3");
            System.out.println("4. Case 4");
            System.out.println("5. Case 5 (Fibonacci)");
            System.out.println("6. Case 6 (Custom Series)");
            System.out.println("0. Keluar");
            System.out.print("Pilih nomor case: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1 -> case1();
                case 2 -> case2();
                case 3 -> case3();
                case 4 -> case4();
                case 5 -> case5();
                case 6 -> case6();
                case 0 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
