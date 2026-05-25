public class Divisão {
    public String calcular (double d1, double d2) {
        double dResultado = 0;
        String msg = "";
        if (d2 != 0) {
            dResultado = d1/d2;
            msg = "A divisão é:" +dResultado;
        }
        else {
            dResultado = 99999.99999;
            msg = "Erro de divisão por zero";
        }
        return msg;
    }
}
