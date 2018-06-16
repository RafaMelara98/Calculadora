/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Aritmetica.FactoryAritmetica;
import Aritmetica.Operacion;
import Conversor.Operator;
import Factory.AbstractFactory;
import Factory.FactoryProducer;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {

    AbstractFactory calc, conv;
    public int WIDTH = 360, widthTF = 120, widthB = 80;
    public int HEIGHT = 360, heightTF = 30, heightB = 30;
    public JTextField textF1, textF2, textF3;
    public JButton button1, button2, button3, button4, button5;

    public Ventana() {

        calc = FactoryProducer.getFactory("aritmetica");
        conv = FactoryProducer.getFactory("conversor");

        Operacion suma = calc.getOperacion("Sumar");
        Operacion resta = calc.getOperacion("Restar");
        Operacion mult = calc.getOperacion("Multiplicar");
        Operacion div = calc.getOperacion("Dividir");
        Operator conver = calc.getOperator("binario");

        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(50, 40, widthTF, heightTF));

        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(100, 230, widthTF, heightTF));

        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(200, 40, widthTF, heightTF));

        button1 = new JButton("Sumar");
        button1.setBounds(new Rectangle(120, 115, widthB, heightB));

        button2 = new JButton("Restar");
        button2.setBounds(new Rectangle(120, 175, widthB, heightB));

        button3 = new JButton("Multiplicar");
        button3.setBounds(new Rectangle(250, 175, widthB, heightB));

        button4 = new JButton("Dividir");
        button4.setBounds(new Rectangle(250, 115, widthB, heightB));

        button5 = new JButton("Covertir");
        button5.setBounds(new Rectangle(15, 145, widthB, heightB));

        textF1.setEditable(true);
        textF2.setEditable(false);
        textF1.setEditable(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
              textF2.setText(String.valueOf(suma.Operacion(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));
            }

        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 textF2.setText(String.valueOf(resta.Operacion(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));
            }

        });

        button3.addActionListener(new ActionListener() {
            @Override
 
            public void actionPerformed(ActionEvent arg0) {
                  textF2.setText(String.valueOf(mult.Operacion(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));
            }

        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               textF2.setText(String.valueOf(div.Operacion(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()))));
            }

        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 textF2.setText(conver.Convertir(Integer.parseInt(textF1.getText())));
            }

        });

        add(textF1);
        add(textF3);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(textF2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

}
