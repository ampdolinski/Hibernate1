package sda.hibernate.zadanie1;

import sda.hibernate.entity.Uzytkownik;

public class Main {
    public static void main(String[] args) {

        Uzytkownik uzytkownik = new Uzytkownik("Artur", "Baranowski");

        DAO_uzytkownik daoUzytkownik = new DAO_uzytkownik();
//        daoUzytkownik.insert(uzytkownik);
//        System.out.println(daoUzytkownik.select(40L).toString());
//        daoUzytkownik.update(uzytkownik);
//        daoUzytkownik.delete(41L);

        Uzytkownik uzytkownik1 = new Uzytkownik("Dmitri", "Inatewko");
        Uzytkownik uzytkownik2 = new Uzytkownik("Komandor", "Diatłow");
        Uzytkownik uzytkownik3 = new Uzytkownik("Borys", "Szczerbina");
        Uzytkownik uzytkownik4 = new Uzytkownik("Anastazja", "Samozwaniec");
        Uzytkownik uzytkownik5 = new Uzytkownik("Ryszarda", "Fiodorowicz");


//        daoUzytkownik.insert(uzytkownik1);
//        daoUzytkownik.insert(uzytkownik2);
//        daoUzytkownik.insert(uzytkownik3);
//        daoUzytkownik.insert(uzytkownik4);
//        daoUzytkownik.insert(uzytkownik5);

        daoUzytkownik.update(uzytkownik1);
        daoUzytkownik.update(uzytkownik2);
        daoUzytkownik.update(uzytkownik3);
        daoUzytkownik.update(uzytkownik4);
        daoUzytkownik.update(uzytkownik5);
//
//        daoUzytkownik.delete(uzytkownik1.getId());
//        daoUzytkownik.delete(uzytkownik5.getId());

    }
}
