/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jo_notepad;

import javax.swing.JFrame;
import textedit.textedit;

/**
 *
 * @author user
 */
public class Jo_Notepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        textedit joob=new textedit();
        joob.setBounds(0,0,700,700);
        joob.setTitle("Notepad");
        joob.setResizable(false);
        joob.setVisible(true);
        joob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
