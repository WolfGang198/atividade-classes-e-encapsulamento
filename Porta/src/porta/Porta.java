
package porta;

public class Porta {

    public static void main(String[] args) {
        P porta = new P();
    porta.abre();
    porta.fecha();
    porta.pinta("vermelha");
    porta.dimensaoX = 1.0;
    porta.dimensaoY = 2.2;
    System.out.println("A porta esta aberta? " + porta.estaAberta());
    }
    
}
