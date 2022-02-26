/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.FileOption;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author User
 */
public class IOOpt {
    public static void save(DataOutputStream dos,byte...str) throws IOException{
   dos.write(str);
    }
    public static String load(DataInputStream dis) throws Exception{
  
   byte[]b=new byte[dis.available()];
   dis.read(b);
  
   return new String(b, StandardCharsets.US_ASCII);
    }
}
