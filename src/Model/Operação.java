class Operacao {
    protected double m_d1;
    protected double m_d2;

    public void ajustarValores(double dA, double dB) {
        m_d1 = dA;
        m_d2 = dB;
    }
}

class Soma extends Operacao {
    public String calcular(){
        double dResultado = m_d1 + m_d2;
        String msg = "A soma é: " + dResultado;
        return msg;
    }
}

class Subtracao extends Operacao {
    public String calcular(){
        double dResultado = m_d1 - m_d2;
        String msg = "A subtração é: " + dResultado;
        return msg;
    }
}

class Multiplicacao extends Operacao {
    public String calcular(){
        double dResultado = m_d1 * m_d2;
        String msg = "A multiplicação é: " + dResultado;
        return msg;
    }
}

class Divisao extends Operacao {
    public String calcular(){
        double dResultado = 0;
        String msg = "";
        if (m_d2 != 0){
            dResultado = m_d1 / m_d2;
            msg = "A divisão é: " + dResultado;
        }
        else {
            msg = "Erro: divisão por zero";
        }
        return msg;
    }
}