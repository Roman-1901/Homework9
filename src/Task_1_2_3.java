import java.util.Arrays;

public class Task_1_2_3 {
    public static void main(String[] args) {
        int[] month = generateRandomArray();
        double sum = 0;
        int min = month[0];
        int max = month[0];
        double avgSum = 0;
        for (int oneDay : month) {
            sum += oneDay;
            if (max < oneDay) {
                max = oneDay;
            } else if (min > oneDay) {
                min = oneDay;
            }
        }
        avgSum = sum / month.length;
        System.out.println(Arrays.toString(month));
        System.out.println("Сумма трат за месяц составила: " + (int) sum + " рублей.");
        System.out.println("Минимальаня сумма трат за день составила " + min + " руб. Максимальная сумма трат за день составила " + max + " руб.");
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", avgSum) + " руб.");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
