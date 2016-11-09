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
public abstract class GenericProblem {
    
    public abstract DNAReader getReader(FileReader fr);
    public abstract List<String> Solve(DNAReader origin);
    public abstract List<String> Solve(DNAReader origin, DNAReader origin2);
    
}
