/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalide.Process;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
import pascalide.CtrPanel.EditPane;

/**
 *
 * @author User
 */
public class Compiler {
    public static void compile(Path p) throws Exception{
    ProcessBuilder pb=new ProcessBuilder("cmd.exe","/C","fpc "+p.getFileName());
    pb.directory(new File(p.getParent().toString()));
   Process compile=pb.start();
   InputStream is=compile.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        EditPane.log.read(br, "Logger");

  



    }
    public static void compileAndRun(Path p) throws Exception{
    ProcessBuilder pb=new ProcessBuilder("cmd.exe","/C","fpc "+p.getFileName());
    pb.directory(new File(p.getParent().toString()));
    pb.start();
    Path f=p.getFileName();
    String[]fix=f.toString().split("\\.");
    fix[1]=".exe";
    StringBuilder sb=new StringBuilder();
    for(String str:fix)sb.append(str);
    ProcessBuilder pb2=new ProcessBuilder("cmd.exe",sb.toString());
    pb2.directory(p.getParent().toFile());
    Process run=pb2.start();
        InputStream is=run.getInputStream();
 try(Scanner sc=new Scanner(is)){
 while(sc.hasNext()){
 System.out.println(sc.nextLine());
 }
 }
    }
}
