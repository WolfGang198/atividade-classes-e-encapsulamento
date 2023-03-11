
package contas;

public class Contas {

    public static void main(String[] args) {
        // Instanciando dois objetos da classe Cliente
        Cliente cliente1 = new Cliente("Joao Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00");

        // Instanciando dois objetos da classe Produto
        Produto produto1 = new Produto("Celular", 1999.99);
        Produto produto2 = new Produto("Notebook", 3999.99);

        // Instanciando dois objetos da classe Conta
        Conta conta1 = new Conta(1, "01/01/2023", "05/01/2023", produto1, cliente1);
        Conta conta2 = new Conta(2, "01/02/2023", "05/02/2023", produto2, cliente2);

        // Visualizando as contas
        conta1.visualizarConta();
        System.out.println();
        conta2.visualizarConta();
    }
    
}
