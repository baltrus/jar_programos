package duombazes_nuskaitymas;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/13/2017.
 */
public class Duombazes_nuskaitymas {
    private Connection connection;

    public Duombazes_nuskaitymas() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    ""
            );
        } catch (Exception error) {
            System.out.print(error);
        }
    }

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
                Studentu_adresu_lentele();
                break;
            case 3:
                Studentu_pazymiu_lentele();
                break;
        }
    }

    public void Studentu_lentele() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `students`");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultSet.getString("name"));
                System.out.print(" ");
                System.out.print(resultSet.getString("surname"));
                System.out.print("");
                System.out.println();
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    public void Studentu_adresu_lentele() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `student_address`");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultSet.getString("street"));
                System.out.print(", ");
                System.out.print(resultSet.getString("city"));
                System.out.print("");
                System.out.println();
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    public void Studentu_pazymiu_lentele() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `student_marks`");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultSet.getString("title"));
                System.out.print(" ");
                System.out.print(resultSet.getInt("mark"));
                System.out.print("");
                System.out.println();
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }
}