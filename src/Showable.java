public class Showable extends Printable{
    //void show(){ System.out.println("This is a test from show"); }
    //public Showable(){ super(); }
    String str = "No Value";
    @Override
    public void show(){ System.out.println(" Default Showable output is: " + str); }
    void show( String str){ System.out.println(" Output is " + str); }
}
