package unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fatJaneiro; //= 15_000;
		double fatFevereiro; // = 23_000;
		double fatMarco; //= 17_000;
		
		fatJaneiro = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do m�s de janeiro: "));
		fatFevereiro = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do m�s de fevereiro: "));
		fatMarco = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do m�s de mar�o: "));
		double fatTrimestral = fatJaneiro + fatFevereiro + fatMarco;
		JOptionPane.showMessageDialog(null, "valor trimestral : "+fatTrimestral);
	}

}
