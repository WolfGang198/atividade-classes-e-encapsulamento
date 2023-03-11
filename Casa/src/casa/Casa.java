package casa;

public class Casa {

    public static void main(String[] args) {
        C casa = new C("amarela");
    casa.porta1.abre();
    casa.porta2.abre();
    casa.porta2.fecha();
    casa.porta3.fecha();
    System.out.println("A casa tem " + casa.quantasPortasEstaoAbertas() + " porta(s) aberta(s).");
    }
    
}
