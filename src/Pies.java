/**
 * Created by Ola on 2016-11-24.
 */
public class Pies {
    int wielkosc;
    String rasa;
    String imie;

    void szczekaj() {
        System.out.println("Chau!  Chauuu!");
    }
}

class PiesTester{
    public  static void main(String[] args){
        Pies p = new Pies();
        p.wielkosc=40;
        p.szczekaj();
    }
}