
package banco;

public class Banco {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("WolfGang");
        f1.setDepartamento("Ciber Segurança");
        f1.setSalario(1500f);
        f1.setDataEntrada("09/03/2020");
        f1.setRG("MG-13.416.747");
        f1.setAumento(100f);
        f1.setContratado(true);
        
        System.out.println("Salario atual: " + f1.getSalario());
        
        main m1 = new main();
        
    }
    
}
