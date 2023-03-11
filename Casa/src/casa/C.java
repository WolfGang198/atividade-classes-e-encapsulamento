
package casa;

public class C {
    private String cor;
  public Porta porta1;
  public Porta porta2;
  public Porta porta3;

  public C(String cor) {
    this.cor = cor;
    this.porta1 = new Porta();
    this.porta2 = new Porta();
    this.porta3 = new Porta();
  }

    //C(String amarela) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

  public void pinta(String cor) {
    this.cor = cor;
  }

  public int quantasPortasEstaoAbertas() {
    int contador = 0;
    if (porta1.estaAberta()) {
      contador++;
    }
    if (porta2.estaAberta()) {
      contador++;
    }
    if (porta3.estaAberta()) {
      contador++;
    }
    return contador;
  }
}
