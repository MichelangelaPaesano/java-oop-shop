import java.util.Random;

public class Prodotto {
    
        public int codice;

        public String nome;

        public String descrizione;

        public int prezzo; 

        public double iva; 

        public Prodotto () {
            // creato il costruttore che deve avere stesso nome della classe 
            Random random = new Random();
            codice = random.nextInt(1000);
            System.out.println(codice);
            
            prezzo = 25;

            nome = "rasoio";
        }

        //fuori dal costruttore scrivo il metodo per il prezzoBase perche' 
        //il costruttore è di per sè un metodo speciale e quindi non posso creare
        // un metodo dentro un altro metodo

        public int prezzoBase() {
            return prezzo;
        }
        
        public double prezzoIva() {
            double tax = prezzo * 1.22;
            return tax;
        }

        public String titolo () {
            String nomeProdotto = nome + codice;
            return nomeProdotto;
        }
    }



