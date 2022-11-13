import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char tempStorage;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            tempStorage = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = tempStorage;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}
