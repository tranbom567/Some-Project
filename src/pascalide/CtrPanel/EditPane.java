/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.CtrPanel;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class EditPane extends JPanel{
   public static final JTextArea tArea=new JTextArea(20, 100);
   public static JScrollPane sp=new JScrollPane(tArea);
public static final JTextArea log=new JTextArea(20, 100);
   public static JScrollPane sp2=new JScrollPane(log);
   public EditPane(){
       setLayout(new FlowLayout(FlowLayout.CENTER));
    
       
       add(sp);
    add(sp2);
   }
}
