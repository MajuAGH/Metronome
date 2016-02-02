/**
 * Created by Michał on 14-Dec-15.
 */

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

public class Logic {

    private void playSound() {
        try {
            FileInputStream in = new FileInputStream(new File("C:\\Users\\pc1\\IdeaProjects\\Metronome\\Click1.wav"));
            AudioStream s = new AudioStream(in);
            AudioPlayer.player.start(s);
        } catch (Exception var) {
            JOptionPane.showMessageDialog((Component)null, var);
        }

    }
    private void playSound2() {
        try {
            FileInputStream in = new FileInputStream(new File("C:\\Users\\pc1\\IdeaProjects\\Metronome\\gunclick.wav"));
            AudioStream s1 = new AudioStream(in);
            AudioPlayer.player.start(s1);
        } catch (Exception var) {
            JOptionPane.showMessageDialog((Component)null, var);
        }

    }

    public void generate_for_gui(int tempo, int met1, int met2, boolean nuta, boolean play){
        double o = 4.0 / ((met2*tempo) / 60.0);
        int okres = (int)Math.round(o * 1000.0);


        if (nuta) {
           // while(play) {

                this.playSound2();
                try {
                    Thread.sleep((long) okres);
                } catch (InterruptedException var10) {
                    var10.printStackTrace();
                }
                for (int ctr = met1 - 1; ctr != 0; --ctr) {
                    this.playSound();
                    try {
                        Thread.sleep((long) okres);
                    } catch (InterruptedException var10) {
                        var10.printStackTrace();
                    }
                }
           // }


        }

        else{
           // while(play) {
                for (int ctr = met1; ctr != 0; --ctr) {
                    this.playSound();
                    try {
                        Thread.sleep((long) okres);
                    } catch (InterruptedException var10) {
                        var10.printStackTrace();
                    }
                }
            }
       // }

    }
    public void generate(int tempo, int met1, int met2, int takt, boolean nuta) {
        double o = 4.0 / ((met2*tempo) / 60.0);
        int okres = (int)Math.round(o * 1000.0);


        if (nuta) {
            for (int licznik = takt; licznik != 0; --licznik) {

                this.playSound2();
                try {
                    Thread.sleep((long) okres);
                } catch (InterruptedException var10) {
                    var10.printStackTrace();
                }
                for (int ctr = met1 - 1; ctr != 0; --ctr) {
                    this.playSound();
                    try {
                        Thread.sleep((long) okres);
                    } catch (InterruptedException var10) {
                        var10.printStackTrace();
                    }
                }
            }


        }

        else{
            for (int licznik = takt; licznik != 0; --licznik) {
                for (int ctr = met1; ctr != 0; --ctr) {
                    this.playSound();
                    try {
                        Thread.sleep((long) okres);
                    } catch (InterruptedException var10) {
                        var10.printStackTrace();
                    }
                }
            }
        }
    }
}

