//longest consecutive run of equal elements
public class Q4{
    public static void main(String[] args) {
        int[] numbers={1,1,2,2,2,3,3,1,1,1,1};        
        int a=1;
        int b=1;
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i]==numbers[i-1]) {
                b++;
            } else {
                b=1; 
            }
            if (b>a) {
                a=b;
            }
        }       
        System.out.println(a);
    }
}