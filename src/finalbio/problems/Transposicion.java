/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbio.problems;

import finalbio.reader.DNAReader;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author JuanFelipe
 */
public class Transposicion extends GenericProblem{

    @Override
    public DNAReader getReader(FileReader fr) {
        DNAReader reader = new DNAReader();
        reader.init(fr);
        return reader;
    }

    @Override
    public List<String> Solve(DNAReader origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> Solve(DNAReader origin, DNAReader origin2) {
        String original = origin.leerLinea();
        String mutacion = origin.leerLinea();
        int posInicial = 0;
        int tamanio = 0;
        boolean flag = true;
        for(int i = 0; i < original.length();i++){
            if(original.charAt(i) != mutacion.charAt(i)){
                if(flag){
                    posInicial = i;
                    flag = false;
                }
                tamanio++;                
            }
        }
        System.out.println(posInicial + " " + tamanio);
        return null;
    }
    
}
