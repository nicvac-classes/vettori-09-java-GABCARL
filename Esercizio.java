import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args) {
        // Creazione di uno scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente il numero di giri della gara
        System.out.print("Inserisci il numero di giri della gara: ");
        int N = scanner.nextInt();

        // Dichiarazione dei vettori per i tempi di Hamilton e Verstappen
        double[] tempiHamilton = new double[N];
        double[] tempiVerstappen = new double[N];

        // Chiediamo all'utente i tempi di Hamilton per ogni giro
        System.out.println("Inserisci i tempi di Hamilton per ogni giro (in secondi):");
        for (int i = 0; i < N; i++) {
            System.out.print("Giro " + (i + 1) + ": ");
            tempiHamilton[i] = scanner.nextDouble();
        }

        // Chiediamo all'utente i tempi di Verstappen per ogni giro
        System.out.println("Inserisci i tempi di Verstappen per ogni giro (in secondi):");
        for (int i = 0; i < N; i++) {
            System.out.print("Giro " + (i + 1) + ": ");
            tempiVerstappen[i] = scanner.nextDouble();
        }

        // Calcoliamo il tempo totale di gara per Hamilton e Verstappen
        double tempoTotaleHamilton = 0;
        double tempoTotaleVerstappen = 0;

        for (int i = 0; i < N; i++) {
            tempoTotaleHamilton += tempiHamilton[i];
            tempoTotaleVerstappen += tempiVerstappen[i];
        }

        // Determiniamo il vincitore della gara
        String vincitore = (tempoTotaleHamilton < tempoTotaleVerstappen) ? "Hamilton" : "Verstappen";

        // Troviamo il giro più veloce
        double giroPiuVeloceHamilton = Double.MAX_VALUE;
        double giroPiuVeloceVerstappen = Double.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (tempiHamilton[i] < giroPiuVeloceHamilton) {
                giroPiuVeloceHamilton = tempiHamilton[i];
            }
            if (tempiVerstappen[i] < giroPiuVeloceVerstappen) {
                giroPiuVeloceVerstappen = tempiVerstappen[i];
            }
        }

        // Determiniamo chi ha fatto il giro più veloce
        String giroVeloce = (giroPiuVeloceHamilton < giroPiuVeloceVerstappen) ? "Hamilton" : "Verstappen";

        // Visualizziamo il risul

//LEGGERE LE ISTRUZIONI NEL FILE README.md
