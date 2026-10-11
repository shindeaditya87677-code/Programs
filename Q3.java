//find the missing number
public class Q3 {
    public static int MissingNumber(int[] numbers, int n) {
        int Sum=n*(n+1)/2;
        int actualSum=0;
        for (int num : numbers) {
            actualSum+=num;
        }
        return Sum-actualSum;
    }
    public static void main(String[] args) {
        int[] numbers={1,2,4,6,3,7,8};
        int n=8;
        
        System.out.println("Missing Number:"+MissingNumber(numbers,n));
    }
}