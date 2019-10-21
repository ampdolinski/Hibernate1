package sda.hibernate.zadanie1;

import org.hibernate.*;

import sda.hibernate.HibernateUtil;
import sda.hibernate.entity.Uzytkownik;

public class DAO_uzytkownik {

    public void insert(Uzytkownik wejsciowyUzytkownik) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(wejsciowyUzytkownik);
        session.flush();
        session.close();
    }

    public Uzytkownik select(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Uzytkownik wyszukanyUzytkownik = session.find(Uzytkownik.class, id);
        session.flush();
        session.close();
        return wyszukanyUzytkownik;
    }

    public void update(Uzytkownik aktualizowanyUzytkownik) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        aktualizowanyUzytkownik.setNazwisko(aktualizowanyUzytkownik.getImie() + " " + aktualizowanyUzytkownik.getNazwisko());
        aktualizowanyUzytkownik = (Uzytkownik) session.merge(aktualizowanyUzytkownik);
        session.flush();
        session.close();

    }

    public void delete(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Uzytkownik usuwanyUzytkownik = new Uzytkownik();
        usuwanyUzytkownik.setId(id);
        session.delete(usuwanyUzytkownik);
        session.flush();
        session.close();

    }

}
