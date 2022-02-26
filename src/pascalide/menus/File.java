/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author User
 */
public class File extends JMenu {
    private static JMenuItem Save=new JMenuItem(new SaveAct());
    private static JMenuItem Load=new JMenuItem(new LoadAct());
    private static JMenuItem Compile=new JMenuItem(new CompileOpt());
    private static JMenuItem CompileAndRun=new JMenuItem(new CompileAndRunAct());
    public File(){
    super("File");
    Save.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
     Load.setAccelerator(KeyStroke.getKeyStroke("ctrl L"));
      Compile.setAccelerator(KeyStroke.getKeyStroke("alt F9"));
       CompileAndRun.setAccelerator(KeyStroke.getKeyStroke("ctrl F9"));
       CompileAndRun.setEnabled(false);
        add(Save);
        add(Load);
        add(Compile);
        add(CompileAndRun);
    }
}
