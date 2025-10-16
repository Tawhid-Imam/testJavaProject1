public class Printable{
    String value;
    public Printable(String str){ this.value = str; }
    public String getValue(){ return value;}
    public void setValue( String str){ this.value = str; }
    public void show(){ System.out.println(" Printable Value: " + value ); }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Printable obj1 = new Printable("This is Nibeer.");
        obj1.show();
    }
}
