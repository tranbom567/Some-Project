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
public class logAct extends AbstractAction {
public logAct(){
    putValue(NAME, "Logger");
}
    @Override
    public void actionPerformed(ActionEvent e) {
        EditPane.sp.setVisible(false);
        EditPane.sp2.setVisible(true);
      
    }
    
}
