/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbio.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author labing
 */
public abstract class RawDNAReader {
    
    protected BufferedReader dataOrigin;
    
    public abstract List<String> leerCadenas();
    public abstract String leerLinea();
    public abstract char leerChar();
    public abstract void init(FileReader fr);
    public abstract boolean canRead();
    public abstract void close();
    
}
