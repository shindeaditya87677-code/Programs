public class Q7 {
    public static void analyzeMarks(int[] marks) {
        if (marks==null || marks.length==0) {
            System.out.println("No marks:");
            return;
        }
        int total=0;
        int highest=marks[0];
        int passCount=0;
        for (int i=0; i<marks.length;i++) {
            int currentMark=marks[i];
            total=total+currentMark;
            if (currentMark>highest) {
                highest=currentMark;
            }
            if (currentMark>=40) {
                passCount=passCount+1;
            }
        }
        double average=(double) total/marks.length;
        System.out.println("Total marks:"+total);
        System.out.println("Average marks:"+average);
        System.out.println("Highest mark:"+highest);
        System.out.println("passing marks:"+passCount);
    }
    public static void main(String[] args) {
        int[] inputMarks={35,72,80,45,90,30};
        analyzeMarks(inputMarks);
    }
}