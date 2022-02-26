/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author User
 */
public class FileDialog extends JFileChooser {
    public FileDialog(){
        setCurrentDirectory(new java.io.File("C:\\Users\\User"));
        setFileFilter(new FileNameExtensionFilter("Pascal file", "pas"));
    }
}
