/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbio.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author labing
 */
public class DNAReader extends RawDNAReader{

    @Override
    public List<String> leerCadenas() {
        List<String> lineas = new LinkedList();
        try{
            while(this.dataOrigin.ready()){
                lineas.add(this.dataOrigin.readLine());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return lineas;
    }

    @Override
    public String leerLinea() {
        String linea = "";
        try{
        linea = this.dataOrigin.readLine();
        
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return linea;
    }

    @Override
    public char leerChar(){
        char ret = 0;
        try{
            ret = (char)this.dataOrigin.read();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ret;
        
    }

    @Override
    public void init(FileReader fr) {
        this.dataOrigin = new BufferedReader(fr);
    }

    @Override
    public boolean canRead(){
        boolean ret = false;
        try{
        ret = this.dataOrigin.ready();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }

    @Override
    public void close() {
        try{
            this.dataOrigin.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        this.dataOrigin = null;
    }
    
}
