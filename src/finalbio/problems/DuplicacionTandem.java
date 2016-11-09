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
public class DuplicacionTandem extends GenericProblem{

    @Override
    public DNAReader getReader(FileReader fr) {
         DNAReader reader = new DNAReader();
        reader.init(fr);
        return reader;
    }

    @Override
    public List<String> Solve(DNAReader origin) {
        
        
        return null;
    }

    @Override
    public List<String> Solve(DNAReader origin, DNAReader origin2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
