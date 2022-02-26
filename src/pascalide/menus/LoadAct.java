/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus;

import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import pascalide.CtrPanel.EditPane;
import pascalide.FileOption.IOOpt;

/**
 *
 * @author User
 */
public class LoadAct extends AbstractAction {
    public static java.io.File file;
public LoadAct(){
    putValue(NAME, "Load");
}
    @Override
    public void actionPerformed(ActionEvent e) {
        FileDialog f=new FileDialog();
        int r=f.showOpenDialog(null);
        if(r==JFileChooser.APPROVE_OPTION){
            try {
                file=f.getSelectedFile();
               String load=IOOpt.load(new DataInputStream(new FileInputStream(f.getSelectedFile())));
                EditPane.tArea.setText(load);
            } catch (Exception ex) {
                Logger.getLogger(LoadAct.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
