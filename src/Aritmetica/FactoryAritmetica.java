/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import Conversor.Operator;
import Factory.AbstractFactory;

/**
 *
 * @author Rafael Melara
 */
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public Operacion getOperacion(String type) {
          switch (type) {
            case "Sumar":
                return new Suma();
            case "Restar":
                return new Resta();
            case "Multiplicar":
                return new Multiplicacion();
            case "Dividir":
                return new Division();
        }
        return null;
    }

    @Override
    public Operator getOperator(String type) {
        return null;
    }
    
}
