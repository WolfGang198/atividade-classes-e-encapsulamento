
package porta;

public class P {
     private boolean aberta;
  private String cor;
  public double dimensaoX;
  public double dimensaoY;
  private double dimensaoZ;

  public P() {
    this.aberta = false;
    this.cor = "branca";
    this.dimensaoX = 0.8;
    this.dimensaoY = 2.0;
    this.dimensaoZ = 0.04;
  }

  public void abre() {
    this.aberta = true;
  }

  public void fecha() {
    this.aberta = false;
  }

  public void pinta(String cor) {
    this.cor = cor;
  }

  public boolean estaAberta() {
    return aberta;
  }
}
