
import java.util.regex.Pattern;

public class Start {
    public static void main(String[] args) {
        String string1 ="I Like to code near the Lake with my friend Luke";
        String string2 = string1.replaceAll("L[^u]ke","BLA");

        System.out.println(string2);
    }
}
