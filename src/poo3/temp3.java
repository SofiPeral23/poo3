package poo3;

import javax.swing.JOptionPane;


public class temp3 implements ITemperatura {
            
    @Override
        public void result(float f, float c, float k){
            
        c=Float.parseFloat(JOptionPane.showInputDialog("ingrese grado Celsius: "));
        k=(float) (c+273.15);
        JOptionPane.showMessageDialog(null, "de Celsius a Kelvin: "+k);
        }
    }
    

