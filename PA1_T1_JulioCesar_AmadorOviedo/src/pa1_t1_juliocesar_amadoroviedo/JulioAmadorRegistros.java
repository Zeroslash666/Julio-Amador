/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1_t1_juliocesar_amadoroviedo;

/**
 *
 * @author Zero
 */
public class JulioAmadorRegistros {
    
    String operacion, resultado, signo;

    public JulioAmadorRegistros(String operacion, String resultado, String signo) {
        this.operacion = operacion;
        this.resultado = resultado;
        this.signo = signo;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    @Override
    public String toString() {
        return "JulioAmadorRegistros{" + "operacion=" + operacion + ", resultado=" + resultado + ", signo=" + signo + '}';
    }

    
    
    
    
}
