/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.controls;

import lightsout.models.Player;
import java.util.Random;
import java.util.Scanner;
import lightsout.frames.MainFrame;

/**
 *
 * @author Clint and Tim
 */
public class LightsOut {
    public static MainFrame mainFrame = null;
    
    public static void main(String[] args) {
        try{              
                          /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    LightsOut.mainFrame = new MainFrame(false);
                    LightsOut.mainFrame.setVisible(true);
                }
            });
        }
        
    }
}

