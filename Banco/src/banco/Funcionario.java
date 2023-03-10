
package banco;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    private double aumento;
    private boolean contratado;
    
    void admitido(){
        setContratado(true);
    }
    
    void demitido(){
        setContratado(false);
    }
    
    void bonifica(double aumento){
        setSalario(getSalario() + aumento);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the aumento
     */
    public double getAumento() {
        return aumento;
    }

    /**
     * @param aumento the aumento to set
     */
    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    /**
     * @return the contratado
     */
    public boolean isContratado() {
        return contratado;
    }

    /**
     * @param contratado the contratado to set
     */
    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
    
    
}
