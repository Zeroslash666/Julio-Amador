/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_t1_juliocesar_amadoroviedo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zero
 */
public class JulioAmadorRegistroControler {
    
    private static JulioAmadorRegistros registroActual;
    private static List<JulioAmadorRegistros> listaRegistros= new ArrayList<>();
    
    public static void agregarRegistroLista (JulioAmadorRegistros registros){
        listaRegistros.add(registros);    
    }
    
    public static void EliminarRegistroLista (JulioAmadorRegistros registros){
        listaRegistros.remove(registros);
    }
    
    
    public static Object [][] getListaRegistrosComoArreglo(){
        Object arreglo [][] = new Object[listaRegistros.size()][3];
        
        int indice=0;
        for (JulioAmadorRegistros registrosamp : listaRegistros){
        arreglo [indice][0]= registrosamp.getOperacion();
        arreglo [indice][1]= registrosamp.getResultado();
        arreglo [indice][2]= registrosamp.getSigno();
        indice++;
        
        }
        return arreglo;
    }
    
     
    
    public static void configurarRegistroActual (JulioAmadorRegistros registros){
        registroActual=registros;
    }
    
    public static JulioAmadorRegistros getRegistroActual(){
    
        return registroActual;    
    }
    
}
