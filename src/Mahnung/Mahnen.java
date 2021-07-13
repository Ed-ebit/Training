package Mahnung;

public class Mahnen {

    static int mahnStufe;
    double mahnGebuehr;

    public Mahnen(){

        mahnStufe = 1;
        mahnGebuehr = 5;
        ausgabe();

    }
    public Mahnen(Mahnen erste){
        this.mahnStufe = erste.mahnStufe + 1;
        this.mahnGebuehr = erste.mahnGebuehr + 5;
        ausgabe();
    }

    public void ausgabe(){

        System.out.println("aktuelle Mahnstufe ist: " + mahnStufe + " mit einem Betrag von €: " + mahnGebuehr);
    }


    public static void main(String[] args) {

        Mahnen ersteMahnung = new Mahnen();
        Mahnen zweiteMahnung = new Mahnen(ersteMahnung);
        Mahnen dritteMahnung = new Mahnen(zweiteMahnung);

    }
}
