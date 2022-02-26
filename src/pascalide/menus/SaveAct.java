/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus;

import java.awt.event.ActionEvent;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import pascalide.CtrPanel.EditPane;
import pascalide.FileOption.IOOpt;

/**
 *
 * @author User
 */
public class SaveAct extends AbstractAction {
    public static java.io.File file;
public SaveAct(){
    putValue(NAME, "Save");
}
    @Override
    public void actionPerformed(ActionEvent e) {
      FileDialog f=new FileDialog();
      int r=f.showSaveDialog(null);
      if(r==JFileChooser.APPROVE_OPTION){
          String fix=f.getSelectedFile().toString()+".pas";
      file=new java.io.File(fix);
          try {
              IOOpt.save(new DataOutputStream(new FileOutputStream(file)),EditPane.tArea.getText().getBytes(StandardCharsets.US_ASCII));
          } catch (Exception ex) {
              Logger.getLogger(SaveAct.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
    
}
