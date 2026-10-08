class Student {
    private String name;
    private int marks;
   
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
public class setternew1{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Aditya");
        s1.setMarks(90);
        System.out.println("name is:"+s1.getName());
        System.out.println("marks is:"+s1.getMarks());
    }
}