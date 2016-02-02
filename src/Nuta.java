/**
 * Created by Michał on 23-Nov-15.
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Nuta {
    boolean nuta;
    void SetNuta(){
        try {
            System.out.println("Zaznaczać pierwszą nutę w takcie? (true/false)");
            Scanner sc = new Scanner(System.in);
            this.nuta = sc.nextBoolean();
        }
        catch(InputMismatchException e) {
            System.out.println("Wpisz true albo false");
            this.SetNuta();
        }
    }
    void SetNutaGUI(boolean setuj){
        this.nuta = setuj;
    }
    boolean GetNuta(){
        return this.nuta;
    }

}
