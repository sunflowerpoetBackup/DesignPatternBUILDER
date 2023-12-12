//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici
// (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video

public class Main {
    public static void main(String[] args) {

        Persona n1 = new Persona(new Builder("Margherita", "Rossi"));
        n1.setAge(29);
        n1.setAddress("Via Roma 10, Milano");

        Persona n2 = new Persona(new Builder("Carmen", "Verdi"));
        n2.setAge(98);

        System.out.println(n1);
        System.out.println(n2);
    }
}

