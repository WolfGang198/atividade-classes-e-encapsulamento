
package pessoa;

public class Pessoa {
    
    public static void main(String[] args) {
        P pessoa = new P("Joao", 20);
    pessoa.fazAniversario();
    pessoa.fazAniversario();
    System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
    }
    
}
