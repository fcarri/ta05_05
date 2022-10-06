package project5;

import javax.swing.JOptionPane;

public class ta05_5 {
	public static void main(String args[]){

		String nombre = JOptionPane.showInputDialog("Introdueix nombre: ");		
		Double dNombre = Double.parseDouble(nombre);  
		
		//Nombre divisible per 2
		
		if (dNombre % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El nombre "+nombre+" és divisible per 2");
		}else {
			JOptionPane.showMessageDialog(null, "El nombre "+nombre+" no és divisible per 2");
		}
		
	}
}
