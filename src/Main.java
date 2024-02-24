import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("__________________________________________________________________________________________");
        System.out.println("_________________________________________Задача 1_________________________________________");
        System.out.println("__________________________________________________________________________________________");

        int sum = 0;
        for (int i : arr){
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("__________________________________________________________________________________________");
        System.out.println("_________________________________________Задача 2_________________________________________");
        System.out.println("__________________________________________________________________________________________");
        //Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. <<<|>>> Максимальная сумма трат за день составила " + max + " рублей");
        }
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("__________________________________________________________________________________________");
        System.out.println("_________________________________________Задача 3_________________________________________");
        System.out.println("__________________________________________________________________________________________");

        int sum = 0;
        for (int i : arr){
            sum = sum + i;
        };

        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        int[] arr = generateRandomArray();
        System.out.println("__________________________________________________________________________________________");
        System.out.println("_________________________________________Задача 4_________________________________________");
        System.out.println("__________________________________________________________________________________________");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

}