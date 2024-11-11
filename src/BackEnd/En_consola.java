/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.util.ArrayList;

/**
 *
 * @author Kevin Russo Emiliany
 */
public class En_consola {
    
    public ArrayList<Pregunta> bd = new ArrayList<>();
    public double vpp=0,r;
    
    public void agregar(Pregunta pregunta){
        
        bd.add(pregunta);
        
    }
    
    public double obtener_calificacion(int pb){
    
        if(bd.size()>0){
            vpp = 5.0/(bd.size());
        }
        r = pb*vpp;
        return r;
    }
}
