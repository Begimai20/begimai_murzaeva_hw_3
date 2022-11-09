import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.5, -10.2, 8.5,-5.6, 9.3, -7.2, -6.1, 5.3, 2.1, 1.5, -8.3, 5.3, 2.9, 3.8, 4.7};
        double sum = 0;
        int col = 0;
        boolean proverka = false;
        for (double nums : numbers) {
            if (nums < 0) {
                proverka = true;
            } else if (nums > 0 && proverka) {
                sum += nums;
                col++;
                System.out.println(nums);
            }
        }
        System.out.println("Среднее арифметическое положительных чисел " + sum / col);




        
        int[] array = {10, 15, 3, 1, 2};
        System.out.println(Arrays.toString(array));{
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minId = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minId = j;
                    }
                }
                int temp = array[i];
                array[i] = min;
                array[minId] = temp;

                System.out.println(Arrays.toString(array));
            }
        }


    }
}