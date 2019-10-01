package poo3;

import javax.swing.JOptionPane;

public class temp2 implements ITemperatura{
    
    @Override
    public void result(float f, float c, float k){
        
        c=Float.parseFloat(JOptionPane.showInputDialog("ingrese grado Celsius: "));
        f=(float) ((c*1.8)+32);
        JOptionPane.showMessageDialog(null, "de Celsius a Fahrenheir: "+f);
    }
    
}
