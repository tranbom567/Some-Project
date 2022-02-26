/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pascalide.CtrPanel.EditPane;
import pascalide.menus.menusBar;

/**
 *
 * @author User
 */
public class PascalIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     
       UIManager.setLookAndFeel(new FlatDarculaLaf());
        EventQueue.invokeLater(()->{
             Fr frame=new Fr(); 
        frame.setVisible(true);
        });
    }
    
}
class Fr extends JFrame{
     
    
    menusBar mb=new menusBar();
  
public Fr(){
   super("Pascal IDE");
  
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500, 300);
    add(new EditPane());
    

    setJMenuBar(mb);
}



}


