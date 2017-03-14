import duombazes_nuskaitymas.Duombazes_nuskaitymas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Duombazes_nuskaitymas objektas = new Duombazes_nuskaitymas();
        objektas.Pasisveikinimas();
        while (true) {
            System.out.println();
            objektas.pasirinkimas();
            objektas.Vykdymas();
        }
    }
}
