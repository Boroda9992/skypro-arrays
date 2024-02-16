import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] weights = {
            90, 91, 91, 92, 91, 89, 88, 86, 0, 0, 0, 0
        } ;
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
//        for (int i = 0; i < weights.length; i++) {
//            System.out.println(weights[i]);
        System.out.println(Arrays.toString(weights));


    }
}