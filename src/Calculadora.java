import java.io.IOException;

public class Calculadora {
    public static void main(String[] args) throws IOException {
        EntradaSaida.coutln("Calculadora com 2 classes estáticas.");

        char ch = ' ';
        String msg = "";

        while (true) {
            EntradaSaida.cout("Para sair digite S ou s: ");

            ch = EntradaSaida.cinch();
            if (ch == 'S' || ch == 's') break;

            EntradaSaida.cout("Digite o Primeiro Número: ");
            double d1 = EntradaSaida.cind();

            EntradaSaida.cout("Digite o Segundo Número: ");
            double d2 = EntradaSaida.cind();

            EntradaSaida.cout("Escolha a operação + - * / -> ");
            char op = EntradaSaida.cinch();

            double dResultado = 0;
            switch (op) {
                case '+':
                    dResultado = d1 + d2;
                    msg = "A soma é:";
                    break;
                case '-':
                    dResultado = d1 - d2;
                    msg = "A subtração é:";
                    break;
                case '*':
                    dResultado = d1 * d2;
                    msg = "A multiplicação é:";
                    break;
                case '/':
                    if (d2 != 0) {
                        dResultado = d1 / d2;
                        msg = "A divisão é:";
                    } else {
                        dResultado = 99999.99999;
                        msg = "Erro de divisão por zero";
                    }
                    break;
                default:
                    msg = "Operação não implementada...";
                    break;
            }
            EntradaSaida.coutln(msg + " " + dResultado);
        }
        EntradaSaida.coutln("Encerrado.");
    }
}