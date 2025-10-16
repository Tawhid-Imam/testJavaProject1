//import testJavaProject1.Printable;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Printable obj1 = new Printable("This is Nibeer.");
        obj1.show();

        Showable obj2 = new Showable();
        obj2.show(" This is From Show!!!");
    }
}
