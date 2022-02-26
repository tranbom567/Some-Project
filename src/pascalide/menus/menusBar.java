/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.menus;

import javax.swing.JMenuBar;
import pascalide.PascalIDE;

/**
 *
 * @author User
 */
public class menusBar extends JMenuBar {
    public menusBar(){
        add(new File());
        add(new Control());
    }
}
