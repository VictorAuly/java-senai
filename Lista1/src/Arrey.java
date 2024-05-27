import javax.swing.JOptionPane;
public class Arrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valores []= new int[2];
		double media = 0.0;
				
		JOptionPane.showMessageDialog(null, "Informe 2 (dois) numeros e  saiba a media deles",
				"Vetor> Arrey",JOptionPane.INFORMATION_MESSAGE);
		for (int i = 0; i<2; i++) {
			 valores [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+ (i+1)+ "° valor :"));
			 
			 media += valores [i];
			 }
		media = media/ valores.length;
		JOptionPane.showMessageDialog(null, "A media é: "+ media,
				"Vetor>Arrey", JOptionPane.INFORMATION_MESSAGE);
	}

}
