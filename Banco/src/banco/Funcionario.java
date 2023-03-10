package banco;

public class Funcionario{
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String rg;
    private boolean ativo;

    public void bonifica(double aumento) {
        salario += aumento;
    }

    public void demite() {
        ativo = false;
    }

    public void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de entrada no banco: " + dataEntradaBanco);
        System.out.println("RG: " + rg);
        System.out.println("Ativo na empresa? " + ativo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

