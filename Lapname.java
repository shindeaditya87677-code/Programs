class shop{
    String component;
    double price;
}
public class lapname {
    public static void main(String[] args) {
        shop s1=new shop();
        s1.component="laptop";
        s1.price=50000;
        shop s2=s1;
        s2.price=45000;
        System.out.println("component is:"+s2.component);
        System.out.println("price is:"+s2.price);
        System.out.println(s1.price);
        System.out.println(s2.price);
    }
}