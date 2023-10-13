public class m006_Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    // contrutor #1
    public m006_Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    // construtor #2
    public m006_Relogio(int h) {
        if (h >= 0 && h < 24) {
            hora = h;
        } else {
            System.out.println("Valor de hora inválido.\n\n");
        }
        minuto = 0;
        segundo = 0;
    }

    // construtor #3
    public m006_Relogio(int h, int m) {
        if (h >= 0 && h < 24) {
            hora = h;
        } else {
            System.out.println("Valor de hora inválido.");
        }
        if (m >= 0 && m < 60) {
            minuto = m;
        } else {
            System.out.println("Valor de minuto inválido.\n\n");
        }
        segundo = 0;
    }

    // construtor #4
    public m006_Relogio(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hora = h;
        } else {
            System.out.println("Valor de hora inválido.");
        }
        if (m >= 0 && m < 60) {
            minuto = m;
        } else {
            System.out.println("Valor de minuto inválido.");
        }
        if (s >= 0 && s < 60) {
            segundo = s;
        } else {
            System.out.println("Valor de segundo inválido.\n\n");
        }
    }

    // métodos de acesso
    public void setHora(int x) {
        if (x >= 0 && x < 24) {
            hora = x;
        } else {
            System.out.println("Valor de hora inválido.");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int x) {
        if (x >= 0 && x < 60) {
            minuto = x;
        } else {
            System.out.println("Valor de minuto inválido.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int x) {
        if (x >= 0 && x < 60) {
            segundo = x;
        } else {
            System.out.println("Valor de segundo inválido.");
        }
    }

    public int getSegundo() {
        return segundo;
    }
}