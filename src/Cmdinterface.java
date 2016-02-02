/**
 * Created by Michał on 14-Dec-15.
 */



public class Cmdinterface {
    int tempo, met1, met2, takt;
    boolean nuta;
    void generate_interface(){
        Tempo te = new Tempo();
        te.SetTempo();
        tempo = te.GetTempo();
        Metrum metrum = new Metrum();
        metrum.SetMet1();
        met1 = metrum.GetMet();
        metrum.SetMet2();
        met2 = metrum.GetMet();
        Takt ta = new Takt();
        ta.SetTakt();
        takt = ta.GetTakt();
        Nuta n = new Nuta();
        n.SetNuta();
        nuta = n.GetNuta();

    }
    int cmdtempo(){
        return this.tempo;
    }
    int cmdmet1(){
        return this.met1;
    }
    int cmdmet2(){
        return this.met2;
    }
    int cmdtakt(){
        return this.takt;
    }
    boolean cmdnuta(){
        return this.nuta;
    }
}
