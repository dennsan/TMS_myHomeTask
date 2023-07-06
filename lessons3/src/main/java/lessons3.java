import java.util.Scanner;

public class lessons3 {
    public static void main(String[] args) {
        //1. used switch
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number month!");
        int month = sc.nextInt();

        switch (month) {
            //first variant
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Incorrect number");

            //second variant
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Incorrect number");
        }
        //2. used if -else- if
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month > 12) {
            System.out.println("Incorrect number");
        } else {
            System.out.println("Autumn");
        }
        //3. Even or Odd
        System.out.println("Input num:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        //4. Temperature
        System.out.println("Введите температуру:");
        int t = sc.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20) {
            System.out.println("Hормально");
        } else {
            System.out.println("Холодно");
        }

        // циклы
        //1.

        for (int i = 1; i < 100; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }

        //2.

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        //3.

        int j = sc.nextInt();
        int r = 0;
        int i = 1;
        do {
            r += i;
            i++;
        } while (i <= j);
        System.out.println(r);

        // extra
        //1. variant
        for (int i = 1; i < 10; i++){
            System.out.print(i + "  ");
            for (int j = 1; j < 10; j++){
                System.out.print(i * j + " ");
            }
            System.out.println("\n");
        }
        //2. variant
        for (int i = 1; i < 10; i++) {
            System.out.println("Таблица на " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
        //3. variant with google
        for (int i = 1; i < 10; i++) {
            System.out.printf("%3d", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println(" ");
        }*/
    }
}
