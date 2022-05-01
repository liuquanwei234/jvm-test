public class test1 {
    public static void main(String[] args) {
        System.out.println(test1.class.getClassLoader());
        System.out.println(test1.class.getClassLoader().getParent());
        System.out.println(test1.class.getClassLoader().getParent().getParent());
    }
}
