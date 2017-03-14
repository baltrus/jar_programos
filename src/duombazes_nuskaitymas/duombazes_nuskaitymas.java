package duombazes_nuskaitymas;

import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/13/2017.
 */
public class Duombazes_nuskaitymas {

    public void Pasisveikinimas() {
        System.out.println("Sveiki, dirbsite su duomenų bazėje esančiomis lentelėmis.");
    }

    public void pasirinkimas() {
        System.out.println("Pasirinkite vieną iš lenteles identifikuojančių skaičių:");
        System.out.println("1) Studentai, 2) Studentų adresai, 3) Studentų pažymiai");
    }

    public void Vykdymas() {
        Scanner sc = new Scanner(System.in);
        int programa = sc.nextInt();
        switch (programa) {
            case 1:
                Studentu_lentele();
                break;
            case 2:
                Studentu_lentele();
                break;
            case 3:
                Studentu_pazymiu_lentele();
                break;
        }
    }

    public void Studentu_lentele() {
        System.out.println("jus ivedete 1");
    }

    public void Studentu_adresu_lentele() {
        System.out.println("jus ivedete 2");
    }

    public void Studentu_pazymiu_lentele() {
        System.out.println("jus ivedete 3");
    }
}
