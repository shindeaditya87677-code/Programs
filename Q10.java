public class Q10 {
    public static int[] processNumbers(int[] numbers) {
        int total = 0;
        int count = 0;
        int largestSquared = Integer.MIN_VALUE; 
        for (int num : numbers) {
            if (num < 0) {
                continue;
            }
            if (num % 2 == 0) {
                int squared = num * num;
                total += squared;
                count++;
                if (squared > largestSquared) {
                    largestSquared = squared;
                }
            }
        }
        if (count == 0) {
            largestSquared = 0;
        }
        return new int[]{total, count, largestSquared};
    }
    public static void main(String[] args) {
        int[] inputNumbers = {-2, 1, 2, 3, 4, 6, -8};
        int[] result = processNumbers(inputNumbers);
        System.out.println("Total: " + result[0]);
        System.out.println("Count: " + result[1]);
        System.out.println("Largest squared value: " + result[2]);
    }
}