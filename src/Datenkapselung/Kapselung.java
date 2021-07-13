package Datenkapselung;




public class Kapselung {

        private int geburtsJahr;

        public int getJahr(){
            return geburtsJahr;
            }

        public void setJahr(int einJahr) {

            if (einJahr >= 1900 && einJahr <= 2016) {

                this.geburtsJahr = einJahr;

            } else {
                System.out.println("Bitte gültige Jahreszahl eingeben");
            }
        }



    }



