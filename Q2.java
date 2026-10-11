//move all zeroes to end
import java.util.Arrays;
public class Q2 {
    public static int[] moveZeros(int[] numbers) {
        int[] result = new int[numbers.length]; 
        int index = 0;
        for (int num : numbers) {
            if (num != 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12, 0, 5};
        int[] output = moveZeros(numbers);
        System.out.println(Arrays.toString(output));
    }
}