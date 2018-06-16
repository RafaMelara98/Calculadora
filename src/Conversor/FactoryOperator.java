/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import Aritmetica.Operacion;
import Factory.AbstractFactory;

/**
 *
 * @author Rafael Melara
 */
public class FactoryOperator implements AbstractFactory {

    @Override
    public Operacion getOperacion(String type) {
        return null;
    }

    @Override
    public Operator getOperator(String type) {
        switch (type) {
            case "binario":
                return new Binario();
        }
        return null;
    }
    
}
