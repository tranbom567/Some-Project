/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import pascalide.menus.CTR.AllAct;
import pascalide.menus.CTR.EditAct;
import pascalide.menus.CTR.logAct;

/**
 *
 * @author User
 */
public class Control extends JMenu {
    private JRadioButtonMenuItem log=new JRadioButtonMenuItem(new logAct());
     private JRadioButtonMenuItem edit=new JRadioButtonMenuItem(new EditAct());
       private JRadioButtonMenuItem all=new JRadioButtonMenuItem(new AllAct());
     private ButtonGroup bg=new ButtonGroup();
    public Control(){
        super("Control");
    bg.add(log);
    bg.add(edit);
    bg.add(all);
    all.setSelected(true);
        add(log);
        add(edit);
        add(all);
    }
}
