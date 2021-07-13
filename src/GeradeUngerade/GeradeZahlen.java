package GeradeUngerade;

public class GeradeZahlen {
    private static int zahl = 5;

    public static void main(String[] args) {
        if (zahl <= 1 && zahl >= 1000000) {

            zahlenCheck();

        }
        else {
            System.out.println(" bitte eine gültige Zahl eingeben ");
        }


        zahlenCheck();

    }

    public static void zahlenCheck(){

        if (zahl%2 == 0){
            System.out.println("\nZahl ist gerade");
        }
        else {
            System.out.println("\nZahl ist ungerade");
        }

    }
}
