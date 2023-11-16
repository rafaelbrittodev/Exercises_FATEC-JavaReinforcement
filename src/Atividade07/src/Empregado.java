public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;

    // Construtor
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIRPF() {
        double aux;
        if (salario <= 2112) {
            aux = 0;
        } else if (salario >= 2112.01 && salario <= 2826.65) {
            aux = (0.075 * (salario - 2112));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            aux = (0.15 * (salario - 2826.65)) + 53.59;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            aux = (0.225 * (salario - 3751.05)) + 192.25;
        } else {
            aux = (0.275 * (salario - 4664.68)) + 397.81;
        }
        return aux;
    }

    public double calcularINSS() {
        double aux;
        if (salario <= 1320) {
            aux = 0.075 * salario;
        } else if (salario >= 1321 && salario <= 2571.29) {
            aux = (0.09 * (salario - 1320)) + 99;
        } else if (salario >= 2571.30 && salario <= 3856.94) {
            aux = (0.12 * (salario - 2571.29)) + 211.61;
        } else if (salario >= 3856.95 && salario <= 7507.49) {
            aux = (0.14 * (salario - 3856.94)) + 326.88;
        } else {
            aux = (0.14 * (7507.49 - 3856.94)) + 326.88;
        }
        return aux;
    }

    public double calcularSalarioLiquido() {
        double aux;
        aux = salario - calcularINSS() - calcularIRPF();
        return aux;
    }

}
