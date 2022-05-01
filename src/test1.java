public class test1 {
    public static void main(String[] args) {
        System.out.println(test1.class.getClassLoader());
        System.out.println(test1.class.getClassLoader().getParent());
        System.out.println(test1.class.getClassLoader().getParent().getParent());
        System.out.println("你好");


        System.out.println("master test");
        System.out.println("hot-fix");

        System.out.println("push test");
    }
}
