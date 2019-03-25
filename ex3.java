import java.util.Scanner;
import java.lang.Math;

class ex3 {

    public static void main(String[] args) {
        GuesNum();
    }

    private static void GuesNum() {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int a;
        int z;
        int x = (int) (Math.random() * 10);

        System.out.println(x);
        System.out.println("Введите число: ");

        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            a = sc.nextInt();
            if (a < x) System.out.println("загаданное число больше");
            if (a > x) System.out.println("загаданное число меньше");
            if (a == x) {
                System.out.println("вы угадали");
                System.out.println("repeat? 1 - yes   0 - no");
                z = sc1.nextInt();
                if (z == 1) GuesNum();
                if (z == 0) System.out.println("--> GAME OVER <--");
                break;
            }
        }
    }

}

