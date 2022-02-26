/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;

/**
 *
 * @author User
 */
public class CompileOpt extends AbstractAction {
public CompileOpt(){
    putValue(NAME, "Compile");
}
    @Override
    public void actionPerformed(ActionEvent e) {
    try {
        pascalide.Process.Compiler.compile( LoadAct.file.toPath());
    } catch (Exception ex) {
        Logger.getLogger(CompileOpt.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }
    
}
