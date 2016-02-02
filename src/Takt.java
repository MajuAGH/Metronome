/**
 * Created by Michał on 23-Nov-15.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Takt {
    int takt;
    void SetTakt(){
        try{
        System.out.println("Podaj ilość taktów");
        Scanner sc = new Scanner(System.in);

        this.takt = sc.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Ilość taktów musi być liczbą całkowitą");
            this.SetTakt();
        }
    }
    void SetTaktGUI(int temp){
        this.takt = temp;
    }
    int GetTakt(){
        return this.takt;}
}
