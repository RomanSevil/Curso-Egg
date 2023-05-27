/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author usuario
 */
public class Ej2Excepcion extends Exception {

    /**
     * Creates a new instance of <code>Ej2Excepcion</code> without detail
     * message.
     */
    public Ej2Excepcion() {
    }

    /**
     * Constructs an instance of <code>Ej2Excepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Ej2Excepcion(String msg) {
        super(msg);
    }
}
