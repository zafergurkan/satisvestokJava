package tr.com.zafergurkan.test;

import tr.com.zafergurkan.fe.AnaPencereFE;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnaPencereFE();
            }
        });
    }
}
