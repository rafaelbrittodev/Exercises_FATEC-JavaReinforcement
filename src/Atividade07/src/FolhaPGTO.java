public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularINSS();
        men1.calcularSalarioLiquido();

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularINSS();
        men2.calcularSalarioLiquido();

        // Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();

        hora2 = new Horista("Carlos", "Rua xyz", 100);
        hora2.calcularSalario();

        // Imprime Folha PGTO
        imprimir(men1);
        imprimir(men2);
        imprimir(hora1);
        imprimir(hora2);

    }

    public static void imprimir(Empregado empregado) {
        System.out.println("\nNome: " + empregado.getNome());
        System.out.println("Endereco: " + empregado.getEndereco());
        System.out.printf("Salario Bruto: %.2f\n", empregado.getSalario());
        System.out.printf("INSS: %.2f\n", empregado.calcularINSS());
        System.out.printf("IRPF: %.2f\n", empregado.calcularIRPF());
        System.out.printf("Salario Liquido: %.2f\n", empregado.calcularSalarioLiquido());
    }
}
