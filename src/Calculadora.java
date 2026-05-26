import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main (String [] args) throws IOException {
        Interface interf = new Interface ();
        interf.executar ();
    }
}