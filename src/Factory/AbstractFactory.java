/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Aritmetica.Operacion;
import Conversor.Operator;



/**
 *
 * @author Rafael Melara
 */
public interface AbstractFactory {
  Operacion getOperacion(String type);
  Operator getOperator(String type);
    
}
