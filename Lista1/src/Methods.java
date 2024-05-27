import javax.swing.JOptionPane;
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "";
		
		JOptionPane.showMessageDialog(null,"Este é um exemplo de aplicação de metodo",
				"Metodo>Method",JOptionPane.INFORMATION_MESSAGE);
		
		nome = solicitaNome();
		informaNome(nome);
	}
	
	public static String solicitaNome() {
		String nome = "";
		
		nome = JOptionPane.showInputDialog("Informa seu Nome");
		
		return nome;
	}
	public static void informaNome(String nome) {
		JOptionPane.showMessageDialog(null,"Seu nome é "+nome+"?",
				"Metodo> Method", JOptionPane.INFORMATION_MESSAGE);
	}

}
