import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Объявите три массива:
        //
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
        //new
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.
        System.out.println("_________________________________________________________________________________________");
        System.out.println("___________________________________Массивы.Часть1________________________________________");
        System.out.println("_________________________________________________________________________________________");
        System.out.println("_______________________________________Задача_1__________________________________________");
        System.out.println("_________________________________________________________________________________________");

        int[] arrayOne = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arrayOne));

        double[] arrayTwo = new double[]{1.57d, 7.654d, 9.986d};
        System.out.println(Arrays.toString(arrayTwo));

        boolean slotOne = arrayOne[0] < arrayTwo[0];
        boolean slotTwo = arrayOne[1] > arrayTwo[1];
        boolean slotThree = arrayOne[2] < arrayTwo[2];
        boolean slotFour = arrayOne[1] == arrayTwo[1];
        boolean slotFive = arrayOne[2] <= arrayTwo[2];
        boolean[] arrayThree = new boolean[]{slotOne, slotTwo, slotThree, slotFour, slotFive};
        System.out.println(Arrays.toString(arrayThree));
        //опробовал Arrays.toString - красивое...
        //вынес условия для массива bool в переменные, вместо того, чтобы руками прописывать true/false - просто потому что
        //было интересно 


        //Задача 2
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        System.out.println("_________________________________________________________________________________________");
        System.out.println("_______________________________________Задача_2__________________________________________");
        System.out.println("_________________________________________________________________________________________");

//        System.out.println(Arrays.toString(arrayThree));
//        System.out.println(Arrays.toString(arrayTwo));
//        System.out.println(Arrays.toString(arrayOne));
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]);
            if (i < arrayOne.length - 1) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i]);
            if (i < arrayTwo.length - 1) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i]);
            if (i < arrayThree.length - 1) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();

        //Задача 3
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        //
        //Если в задаче 2 в консоль у вас вывелся результат:
        //
        //1, 2, 3
        //1.57, 7.654, 9.986
        //// Произвольные элементы третьего массива
        //
        //то в этой задаче результат должен быть таким:
        //
        //3, 2, 1
        //9.986, 7.654, 1.57
        //// Произвольные элементы третьего массива в обратном порядке

        System.out.println("_________________________________________________________________________________________");
        System.out.println("_______________________________________Задача_3__________________________________________");
        System.out.println("_________________________________________________________________________________________");

        for (int i = arrayOne.length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i]);
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.print(arrayTwo[i]);
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = arrayThree.length - 1; i >= 0; i--) {
            System.out.print(arrayThree[i]);
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(" ");
        }
        System.out.println();

        //Задача 4
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //
        //Распечатайте результат преобразования в консоль.
        System.out.println("_________________________________________________________________________________________");
        System.out.println("_______________________________________Задача_4__________________________________________");
        System.out.println("_________________________________________________________________________________________");

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i]++;
            }
            System.out.print(arrayOne[i]);
            if (i < arrayOne.length - 1) {
                System.out.print(",");
            }
            System.out.print(" ");



        }


    }
}