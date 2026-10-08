class student{
    String name;
    int marks;
}
class student_factory{
    student create_student(){
    student s=new student();
    s.name="Aditya";
    s.marks=95;
    return s;
    }
    public class Main{
        public static void main(String[] args) {
            student_factory f1=new student_factory();
            student s1=f1.create_student();
            System.out.println("the name is:"+s1.name);
            System.out.println("the marks are:"+s1.marks);
        }
    }
}