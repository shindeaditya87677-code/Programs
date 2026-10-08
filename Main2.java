class Student {
    String name;
    int age;
}
public class Main2 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=s1;
        s1.name="Aditya";
        s1.age=20;
        System.out.println("name is:"+s1.name);
        System.out.println("Age is:"+s2.age);
        System.out.println("Name is:"+s2.name);
        System.out.println("Age is:"+s2.age);
        System.out.println(s1);
        System.out.println(s2);
    }
}