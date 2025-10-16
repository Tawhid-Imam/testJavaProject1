 //package testJavaProject1;

public class Printable{
    String value;
    public Printable(){ this.value = "Default Value."; }
    public Printable(String str){ this.value = str; }
    public String getValue(){ return value;}
    public void setValue( String str){ this.value = str; }
    public void show(){ System.out.println(" Printable Value: " + value ); }
}
