/**
 * Created by Michał on 23-Nov-15.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metrum{
    int met;
    int met2;

    void SetMet1(){
        try {
            System.out.println("Podaj pierwszą wartość metrum");
            Scanner sc = new Scanner(System.in);
            this.met = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Pierwsza wartość metrum musi być liczbą całkowitą");
            this.SetMet1();
        }
    }
    void SetMet2(){
        try {
            System.out.println("Podaj drugą wartość metrum");
            Scanner sc = new Scanner(System.in);
            int temporary = sc.nextInt();
            if (temporary==2 || temporary==4 || temporary ==8 || temporary == 16)
            {
                this.met = temporary;
            }
            else
            {
                System.out.println("Druga wartość metrum musi wynosić 2,4,8 lub 16");
                this.SetMet2();
            }
        } catch(InputMismatchException e) {
            System.out.println("Druga wartość metrum musi wynosić 2,4,8 lub 16");
            this.SetMet2();
        }
    }
    void SetMet1GUI(int temp1){
        this.met=temp1;
    }
    void SetMet2GUI(int temp2){
        this.met2=temp2;
    }
    int GetMet(){
        return this.met;
    }
    int GetMet2() {return this.met2;}
}
