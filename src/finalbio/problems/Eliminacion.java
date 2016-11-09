/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbio.problems;

import finalbio.reader.DNAReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JuanFelipe
 */
public class Eliminacion extends GenericProblem {

    @Override
    public DNAReader getReader(FileReader fr) {
        DNAReader reader = new DNAReader();
        reader.init(fr);
        return reader;
    }

    @Override
    public List<String> Solve(DNAReader origin, DNAReader origin2) {
        String linea1 = origin.leerLinea();
        String linea2 = origin2.leerLinea();
        StringBuilder builder1 = new StringBuilder(linea1);
        StringBuilder builder2 = new StringBuilder(linea2);
        String sup = "";
        List<String> lista=new LinkedList<>();
        lista.add(linea1);
        int ap1 = 0;
        int ap2 = 0;
        boolean elim = false;

        while (!(builder1.toString().equalsIgnoreCase(builder2.toString()))) {
            try {
                if (linea1.charAt(ap1) != linea2.charAt(ap2)) {
                    linea1 = builder1.toString();
                    linea2 = builder2.toString();
                    sup = sup + linea1.charAt(ap1);
                    builder1.deleteCharAt(ap1);
                    elim = true;
                    if (builder1.toString().length() < builder2.toString().length()) {
                        int voy = builder2.length() - 1;

                        builder2.deleteCharAt(voy);
                    }
                }
                if (!elim) {
                    ap2++;
                    ap1++;
                }
            } catch (IndexOutOfBoundsException e) {
                int size= builder1.length()-1;
                sup=builder1.substring(ap1-1, size);
                break;
            }

        }
        
        lista.add(sup);
        lista.add(String.valueOf(ap2));
        return lista;
    }

    @Override
    public List<String> Solve(DNAReader origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
