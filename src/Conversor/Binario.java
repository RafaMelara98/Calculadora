/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author Rafael Melara
 */
public class Binario implements Operator{

    @Override
    public String Convertir(int bin) {
           String b = ""; 
        while (bin != 0) {
            int r = (int)(bin % 2); 
            b = r + b;
            bin /= 2; 
        }
        return b;
    }
    }
    

