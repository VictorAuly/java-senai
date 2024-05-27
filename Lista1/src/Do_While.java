import javax.swing.JOptionPane;
public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double resposta = 0.0;
		
		JOptionPane.showMessageDialog(null,"Acerte o Calculo!",
				"Faça enquanto> Do While", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			resposta = Double.parseDouble(JOptionPane.showInputDialog("Quanto é 5/2?"));
		} while(resposta!= 2.5);
		
		JOptionPane.showMessageDialog(null,"Você acertou!",
				"Faça enquanto> Do While", JOptionPane.INFORMATION_MESSAGE);
	}

}
