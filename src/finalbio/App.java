/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbio;

import finalbio.problems.Eliminacion;
import java.io.FileReader;

/**
 *
 * @author labing
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        FileReader fr = new FileReader("src/data/algo1.txt");
        FileReader f2 = new FileReader("src/data/algo2.txt");
        Eliminacion el = new Eliminacion();
        System.out.println(el.Solve(el.getReader(fr),el.getReader(f2)));
        System.out.println("Te amo pipe");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
