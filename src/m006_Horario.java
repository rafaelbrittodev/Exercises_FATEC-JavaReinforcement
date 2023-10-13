public class m006_Horario {
    public static void main(String[] args) {
        // Declarar o objeto Relogio uma vez
        m006_Relogio r;

        // instancia objeto da classe Relogio
        // utilizando construtor vazio
        r = new m006_Relogio();
        System.out.println("Utilizando construtor vazio");
        System.out.printf("horario: %02d:%02d:%02d", r.getHora(), r.getMinuto(), r.getSegundo());
        System.out.println("\n\n");

        // instancia objeto da classe Relogio
        // utilizando construtor que requer hora, minuto e segundo
        r = new m006_Relogio(115, 70, 98);
        System.out.println("Utilizando construtor que requer hora, minuto e segundo");
        System.out.printf("horario: %02d:%02d:%02d", r.getHora(), r.getMinuto(), r.getSegundo());
        System.out.println("\n\n");

        // instancia objeto da classe Relogio
        // utilizando construtor que requer apenas a hora
        r = new m006_Relogio(20);
        System.out.println("Utilizando construtor que requer apenas a hora");
        System.out.printf("horario: %02d:%02d:%02d", r.getHora(), r.getMinuto(), r.getSegundo());
        System.out.println("\n\n");

        // instancia objeto da classe Relogio
        // utilizando construtor que requer hora e minuto
        r = new m006_Relogio(10, 30);
        System.out.println("Utilizando construtor que requer hora e minuto");
        System.out.printf("horario: %02d:%02d:%02d", r.getHora(), r.getMinuto(), r.getSegundo());
        System.out.println("\n\n");

        // instancia objeto da classe Relogio
        // utilizando construtor vazio
        r = new m006_Relogio();
        System.out.println("Utilizando construtor vazio, mas atribuindo valores através dos metodos de acesso");
        // mas, atribuindo valores através dos metodos de acesso
        r.setHora(13);
        r.setMinuto(40);
        r.setSegundo(10);
        System.out.println("horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
        System.out.println("\n\n");
    }
}