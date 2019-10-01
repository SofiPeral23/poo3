package poo3;

import javax.swing.JOptionPane;

public class temp1 implements ITemperatura{
    
    @Override
    public void result(float f, float c, float k){
      
        f=Float.parseFloat(JOptionPane.showInputDialog("ingrese grado Fahrenheir: "));
        c=(5*(f-32))/9;
        JOptionPane.showMessageDialog(null, "de Fahrenheir a Celsius: "+c);

    }
    }
