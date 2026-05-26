import java.io.IOException;

class Interface {
    public void executar () throws IOException {
        EntradaSaida.coutln("Calcular com MVC");

        char ch = ' ';

        while (true) {
            EntradaSaida.cout("Para sair digite S ou s: ");
            ch = EntradaSaida.cinch();
            if (ch == 'S' || ch == 's') break;

            EntradaSaida.cout("Digite o primeiro Número: ");
            double d1 = EntradaSaida.cind();

            EntradaSaida.cout("Digite o Segundo Número");
            double d2 = EntradaSaida.cind();

            EntradaSaida.cout("Escolha a Operação + - * / -> ");
            char op = EntradaSaida.cinch();
            Controle controle = new Controle();
            String sResultado = controle.calcular (op, d1, d2);

            EntradaSaida.coutln(sResultado);
        }
        EntradaSaida.coutln("Encerrado");
    }
}