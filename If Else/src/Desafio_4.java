import javax.swing.JOptionPane;
public class Desafio_4 {
	static int contador = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int minutagem;
		int violencia;
		int sexo;
		int nudez;
		int drogas;
		
		JOptionPane.showMessageDialog(null,"Este é um programa que faz a clasificação da faixa etaria dos filmes.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		nome = solicitarNome();
		minutagem =solicitarMinutagem();
		violencia =solicitarViolencia();
		sexo = solicitarSexo();
		nudez = solicitarNudez();
		drogas = solicitarDrogas();
		classificar(nome, minutagem, violencia, sexo, nudez, drogas);
	}
	public static String solicitarNome() {
		
		String nome;
			
		nome = JOptionPane.showInputDialog("Qual é o nome do filme que você vai dar entrada? ");
		
	return nome;
	}
	public static int solicitarMinutagem() {
	
		int minutagem;
		
		minutagem = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos minutos tem esse filme:"));
	
	return minutagem;
	}
	public static int solicitarViolencia() {
		
		int violencia;
		
		violencia = JOptionPane.showConfirmDialog(null, "O filme possui cenas de violência?");
		
		if(violencia ==0) {
			contador+=1;
		}
	
	return violencia;
	}
	public static int solicitarSexo() {
		
		int sexo;
		
		sexo = JOptionPane.showConfirmDialog(null, "O filme possui cenas de sexo?");
		if(sexo ==0) {
			contador+=1;
		}
	
	return sexo;
	}
	public static int solicitarNudez() {
		
		int nudez;
		
		nudez = JOptionPane.showConfirmDialog(null, "O filme possui cenas de nudez?");
		if(nudez ==0) {
			contador+=1;
		}
	
	return nudez;
	}
	public static int solicitarDrogas() {
		
		int drogas;
		
		drogas = JOptionPane.showConfirmDialog(null, "O filme possui cenas com drogas?");
		if(drogas ==0) {
			contador+=1;
		}
	
	return drogas;
	}
	public static int solicitarTemasSensiveis() {
		
		int TemasSensiveis;
		
		TemasSensiveis = JOptionPane.showConfirmDialog(null, "O filme aborda temas sensiveis?");
		if(TemasSensiveis ==0) {
			contador+=1;
		}
	
	return TemasSensiveis;
	}
	public static void classificar(String nome, int minutagem, int violencia, int sexo, int nudez, int drogas) {
		
		if(contador == 5) {
			JOptionPane.showMessageDialog(null,"O filme "+nome+" que possui "+minutagem+" minutos e é clasificado para publicos maiores de 18 ano.",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(contador == 4) {
			JOptionPane.showMessageDialog(null,"O filme "+nome+" que possui "+minutagem+" minutos e é clasificado para publicos maiores de 16 ano.",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(contador == 3) {
			JOptionPane.showMessageDialog(null,"O filme "+nome+" que possui "+minutagem+" minutos e é clasificado para publicos maiores de 14 ano.",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(contador == 2) {
			JOptionPane.showMessageDialog(null,"O filme "+nome+" que possui "+minutagem+" minutos e é clasificado para publicos maiores de 12 ano.",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(contador == 1) {
			JOptionPane.showMessageDialog(null,"O filme "+nome+" que possui "+minutagem+" minutos e é clasificado para publicos maiores de 10 ano.",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(contador == 0) {
			JOptionPane.showMessageDialog(null,"O filme "+nome+" que possui "+minutagem+" minutos e é clasificado para publicos de todas as idades.",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
