/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus.CTR;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import pascalide.CtrPanel.EditPane;

/**
 *
 * @author User
 */
public class AllAct extends AbstractAction {
public AllAct(){
    putValue(NAME, "All Mode");
}
    @Override
    public void actionPerformed(ActionEvent e) {
        EditPane.sp.setVisible(true);
        EditPane.sp2.setVisible(true);
    }
    
}
