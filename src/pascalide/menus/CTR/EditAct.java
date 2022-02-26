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
public class EditAct extends AbstractAction {
public EditAct(){
    putValue(NAME, "Edit Mode");
}
    @Override
    public void actionPerformed(ActionEvent e) {
        EditPane.sp.setVisible(true);
        EditPane.sp2.setVisible(false);
    }
     
}
