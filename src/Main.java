//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici
// (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
/*Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video*/
public class Main {
    public static void main(String[] args) {

        Persona n1 = new Persona(new Builder("Anna", "Simionato"));
        n1.setAge(23);
        n1.setAddress("Via Rizzi 10, Padova");

        Persona n2 = new Persona(new Builder("Alex", "Verdi"));
        n2.setAge(27);

        System.out.println(n1);
        System.out.println(n2);
    }
}

