import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Michał on 23-Nov-15.
 */
public class Tempo {
    int tempo;
    void SetTempo(){
        try {
            System.out.println("Podaj tempo");
            Scanner sc = new Scanner(System.in);
            this.tempo = sc.nextInt();
        }
        catch(InputMismatchException e2) {
            System.out.println("Tempo musi być liczbą całkowitą");
            this.SetTempo();
        }
    }
    void SetTempoGUI(int temp){
        this.tempo = temp;
    }
    int GetTempo(){
        return this.tempo;
    }

}
