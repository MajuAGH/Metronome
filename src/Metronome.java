/**
 * Created by Michał on 23-Nov-15.
 */

public class Metronome {

    public static void main(String[] args) {
        Metronome t = new Metronome();
    }

    public Metronome(){

        Guiinterface gui = new Guiinterface();
        gui.generate_gui();
/*
        Cmdinterface cmd = new Cmdinterface();
        cmd.generate_interface();
        Logic log = new Logic();
        log.generate(cmd.cmdtempo(), cmd.cmdmet1(), cmd.cmdmet2(), cmd.cmdtakt(), cmd.cmdnuta());
*/
    }

}
