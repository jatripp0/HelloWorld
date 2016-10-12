/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jatripp0
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader f;
        String line = "";
        ArrayList<String> lines = new ArrayList<>();
        try{
            f = new FileReader(args[0]);
            BufferedReader reader = new BufferedReader(f);
            
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
            
            for(String s : lines){
                System.out.printf("  -->%s%n", s);
            }
        } catch(FileNotFoundException e){
            System.err.println("File not found.");
        } catch(IOException e){
            System.err.println("There was a problem reading the file.");
        } 
    }
    
}
