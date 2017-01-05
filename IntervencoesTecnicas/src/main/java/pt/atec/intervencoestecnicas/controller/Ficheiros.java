package pt.atec.intervencoestecnicas.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import pt.atec.intervencoestecnicas.model.Relatorio;

public class Ficheiros {
    
    public static void fileSave(Relatorio rel, int index) throws IOException{
        File f = new File("interv"+index+".txt");
        
        f.createNewFile();
        
        FileWriter fw = new FileWriter(f);
        
        String aGravar = rel.getAutor()+";"+rel.getData().toString()+";"+rel.getDescricao();
        
        fw.write(aGravar);
        fw.flush();
        fw.close();
    }
}
