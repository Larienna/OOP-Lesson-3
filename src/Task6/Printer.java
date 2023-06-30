package Task6;

public class Printer {
    void print (String value){
        System.out.println(value); // Basic color
    }
}
class ColorPrinter extends Printer{
    @Override
    void print(String value){
        System.out.println(changeColor(value));
    }
    private String changeColor (String value){
        return "\u001B[35m" + value + "\u001B[0m"; // Using UNI-code, we are change text color
    }
}
