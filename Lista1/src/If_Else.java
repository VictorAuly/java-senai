import javax.swing.JOptionPane;
public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe seu numero:"));
		
		if (numero < 0) {
			JOptionPane.showMessageDialog(null,"O numero informado é menor que zero");
		}
		else if (numero == 0) {
			JOptionPane.showMessageDialog(null,"O numero informado é igual a zero",
					"Se, senão se e senão> if, else if e else",
					JOptionPane.INFORMATION_MESSAGE);
		
		}
		else{
			JOptionPane.showMessageDialog(null,"O numero informado é maior que zero",
					"Se, senão se e senão> if, else if e else",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
