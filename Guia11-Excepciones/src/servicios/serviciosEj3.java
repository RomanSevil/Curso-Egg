/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.DivisionNumero;

/**
 *
 * @author usuario
 */
public class serviciosEj3 {

    public void division(int num, int num2) throws ArithmeticException {

        DivisionNumero d1=new DivisionNumero();
            
            
            //throw new Exception("La letra no puede ser convertida en numero");
        if(num2==0){
            throw new ArithmeticException("No se puede dividir por cero");
        }else{
            d1.setDividendo(num);
            d1.setDivisor(num2);
            System.out.println("Resultado division " + d1.getDividendo()/d1.getDivisor());
        }
    }
}
