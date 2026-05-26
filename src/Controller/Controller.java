class Controle {
    public String calcular (char op, double d1, double d2) {
        String msg = "";
        switch (op) {
            case '+':
                Soma soma = new Soma();
                soma.ajustarValores(d1,d2);
                msg = soma.calcular();
                break;

            case '-':
                Subtracao sub = new Subtracao();
                sub.ajustarValores(d1,d2);
                msg = sub.calcular();
                break;

            case '*':
                Multiplicacao mul = new Multiplicacao();
                mul.ajustarValores(d1,d2);
                msg = mul.calcular();
                break;

            case '/':
                Divisao div = new Divisao();
                div.ajustarValores(d1,d2);
                msg = div.calcular();
                break;

            default:
                msg = "Operação não Implementada...";
                break;
        }
        return msg;
    }
}
