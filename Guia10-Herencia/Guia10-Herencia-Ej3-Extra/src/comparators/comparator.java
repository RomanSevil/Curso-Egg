/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class comparator {
    public static Comparator<Hotel>comparaPrecios=new Comparator<Hotel>(){
        @Override
                public int compare(Hotel h1,Hotel h2){
                    return Double.compare(h2.getPrecioHabitacion(),h1.getPrecioHabitacion());
                }
    };
}
