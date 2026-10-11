//second largest distinct element
public class Q1{
    public static void main(String[]args){
        int []numbers={12,35,1,10,34,35};
        int largest=0;
        int secondLargest=0;
        for (int i:numbers){
            if (i>largest) {
                secondLargest=largest;
                largest=i;
            }
            else if (i>secondLargest && i !=largest) {
                secondLargest = i;
            }
        }
        if (secondLargest==Integer.MIN_VALUE) {
            System.out.println("second largest distinct:");
        } else {
            System.out.println(secondLargest);
        }
    }

}