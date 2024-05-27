import javax.swing.JOptionPane;
public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcao;
		
		opcao = JOptionPane.showInputDialog("Você está fazendo sua atividade?");
		opcao = opcao.toUpperCase();
		
		switch (opcao) {
			
			case "SIM":
				JOptionPane.showMessageDialog(null,"Parabens! Ai sim é sucesso!!",
						"Escolha >Swtch Case", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "NÃO", "NAO":
				JOptionPane.showMessageDialog(null,"Que pena, ai é vacilo",
						"Escolha >Swtch Case", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			default:
				JOptionPane.showMessageDialog(null,"Oque você quis dizer?",
						"Escolha >Swtch Case", JOptionPane.INFORMATION_MESSAGE);
				
		}
	}

}
