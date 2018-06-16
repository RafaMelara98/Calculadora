/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Aritmetica.FactoryAritmetica;
import Conversor.FactoryOperator;

/**
 *
 * @author Rafael Melara
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "color":
                return  new FactoryAritmetica();
            case "shape":
                return new FactoryOperator();
        }
        
        return null;
    }
}
