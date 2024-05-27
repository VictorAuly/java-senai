import javax.swing.JOptionPane;
public class ScanPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		
		JOptionPane.showMessageDialog(null,"Nome informado: "+ nome,
				"Entrada e Saída> Scan and Print", JOptionPane.INFORMATION_MESSAGE);
	}

}
