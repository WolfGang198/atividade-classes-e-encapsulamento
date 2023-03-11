
package pessoa;

public class P {
      private String nome;
  private int idade;

  public P(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void fazAniversario() {
    this.idade++;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }
}
