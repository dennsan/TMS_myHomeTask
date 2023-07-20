import java.util.Arrays;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> origin/lesssons4

public class Lessons4 {
    public static void main(String[] args) {
        //0. Search number in arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
<<<<<<< HEAD
        int res = 0;
        int[] arr = {12, 232, 433, 4, 54, 454, 32, 45, 67, 2, 6, 9,};
        for (int i : arr) {
            if (i == num) {
                res++;
            }
        }
        if (res > 0) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
=======
        int[] arr = {12, 232, 433, 4, 54, 454, 32, 45, 67, 2, 6, 9,};
        Arrays.sort(arr);
        int j = Arrays.binarySearch(arr, num);
        if (j >= 0) {
            System.out.println("Number found");
        } else {
            System.out.println("Not found");
>>>>>>> origin/lesssons4
        }

        //1. delete number in arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
<<<<<<< HEAD
        int count = 0;
        int index = 0;
        int[] arr1 = {2, 3, 45, 36, 26, 76, 98, 665, 23, 77, 344, 86, 3};
        for (int i : arr1) {
            if (i == num) {
                count++;
            }
        }

        int[] arr2 = new int[arr1.length - count];

        for (int i : arr1) {
            if (i != num) {
                arr2[index] = i;
                index++;
            }
        }

        if (count == 0) {
            System.out.println("Number not found");
        } else {
            System.out.println(Arrays.toString(arr2));
        }


=======
        int j = 0;
        int k = 0;
        int[] arr1 = {2, 3, 45, 36, 26, 76, 98, 665, 23, 77, 344, 86, 3};
        Arrays.sort(arr1);
        int index = Arrays.binarySearch(arr1, num);
        while (index >= 0) {
            for (int i = 0; i < arr1.length; i++) {
                if (index != i) {
                    j = arr1[i];
                    arr1[i] = j;
                } else {
                    k++;
                    arr1[i] = 0;
                }
            }
            Arrays.sort(arr1);
            index = Arrays.binarySearch(arr1, num);
        }
        if (k > 0) {
            int[] arr2 = new int[arr1.length - k];
            System.arraycopy(arr1, k, arr2, 0, arr2.length);
            System.out.println(Arrays.toString(arr2));
        } else {
            System.out.println("No number");
        }
>>>>>>> origin/lesssons4
        //2. Max, min, average
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array:");
        int size = sc.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
<<<<<<< HEAD
        System.out.println(Arrays.toString(arr));
        double element = arr[0];
        double max = 0;
        double min = 0;
        for (double el1 : arr) {
            if (el1 > element) {
                max = el1;
            }
        }
        System.out.println(max);

        for (double el1 : arr) {
            if (el1 < element) {
                min = el1;
            } else {
                min = element;
            }
        }
        System.out.println(min);

        double sum = 0;
        for (double el : arr) {
            sum += el;
        }
        System.out.println(sum / size);

        //3.Создайте 2 массива из 5 чисел.

=======
        Arrays.sort(arr);
        double j = 0;
        double average = 0;
        double max = arr[size - 1];
        double min = arr[0];
        for (int i = 0; i < size; i++) {
            j = arr[i];
            j += j;
            average = j / size;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);

        //3.
>>>>>>> origin/lesssons4
        double[] arr1 = {2, 4, 6, 34, 5};
        double[] arr2 = {4, 5, 3, 55, 2};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        double avrArr1 = 0;
        double avrArr2 = 0;
        double j = 0;
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        avrArr1 = sum / arr1.length;
        System.out.println(avrArr1);
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        avrArr2 = sum / arr2.length;
        System.out.println(avrArr2);
        if (avrArr1 > avrArr2) {
            System.out.println(" First array more");
        } else if (avrArr1 < avrArr2) {
            System.out.println("Second array more");
        } else {
            System.out.println("Arrays equal");
        }
<<<<<<< HEAD

=======
>>>>>>> origin/lesssons4
    }
}

