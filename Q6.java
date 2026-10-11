public class Q6 {
    public static void main(String[] args) {
        int[] a={1, 4, 7, 10};
        int[] b={2, 3, 8, 11, 15};
        int[] result=new int[a.length + b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length) {
            if (a[i]<=b[j]) {
                result[k]=a[i];
                i++;
            } else {
                result[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length) {
            result[k]=a[i];
            i++;
            k++;
        }
        while (j<b.length) {
            result[k]=b[j];
            j++;
            k++;
        }
        for (int num:result) {
            System.out.print(num+" ");
        }
    }
}