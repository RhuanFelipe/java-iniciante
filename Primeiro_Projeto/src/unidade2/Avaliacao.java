package unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota"));
		
		if((nota < 0) || (nota > 100)) {
			JOptionPane.showMessageDialog(null, "nota inválida por favor inserir nota entre 0 a 100");
			main(null); // recursividade
		}else {
			if(nota < 50)
				JOptionPane.showMessageDialog(null,"Conceito: insuficiente");
			else if(nota < 70)
				JOptionPane.showMessageDialog(null," Conceito: regular");
			else if(nota < 90)
				JOptionPane.showMessageDialog(null," Conceito: bom");		
			else
				JOptionPane.showMessageDialog(null," Conceito: excelente");		
		}
	}

}
