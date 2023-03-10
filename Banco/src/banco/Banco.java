package banco;


public class Banco {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        f1.setNome("João");
        f1.setDepartamento("Vendas");
        f1.setSalario(2000.0);
        f1.setDataEntradaBanco("01/01/2010");
        f1.setRg("123456789");
        f1.setAtivo(true);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Maria");
        funcionario2.setDepartamento("Contabilidade");
        funcionario2.setSalario(3000.0);
        funcionario2.setDataEntradaBanco("01/01/2015");
        funcionario2.setRg("987654321");
        funcionario2.setAtivo(true);

        System.out.println("Funcionário 1:");
        f1.mostra();
        System.out.println();

        System.out.println("Funcionário 2:");
        funcionario2.mostra();
        System.out.println();

        System.out.println("Aumentando o salário do funcionário 1 em 10%...");
    }

}

    
