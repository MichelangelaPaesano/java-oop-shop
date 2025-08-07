

public class App {
    public static void main(String[] args) throws Exception {
        Prodotto p1 = new Prodotto();
        System.out.println("Il codice è: " + p1.codice);
    
        System.out.println("Il prezzo base è: " + p1.prezzoBase());

        System.out.println("Il prezzo con iva è: " + p1.prezzoIva());
    }

}

