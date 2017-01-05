package pt.atec.intervencoestecnicas.view;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import pt.atec.intervencoestecnicas.controller.Ficheiros;
import pt.atec.intervencoestecnicas.model.Relatorio;

public class Menu {
    
    public Menu() throws IOException{
        Relatorio r = novoRelatorio();
        
        Ficheiros.fileSave(r, 1);
    }
    
    public Relatorio novoRelatorio(){
        Date dt = new Date();
        System.out.println("\n"+"A data do relatório é: "+dt.toString()+"\n");
        
        System.out.println("Introduza o autor do relatório"+"\n");
        String auth = new Scanner(System.in).nextLine();
        
        System.out.println("Descreva a sua intervenção"+"\n");
        String desc = new Scanner(System.in).nextLine();
        
        Relatorio rel = new Relatorio(auth, desc, dt);
        return rel;
    }
}
