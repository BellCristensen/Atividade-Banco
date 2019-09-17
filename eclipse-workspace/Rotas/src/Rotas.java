import javax.swing.JOptionPane;

public class Rotas {
	public static void main(String[] args) {
		

	double rota1, rota2, rota3, rota4;
	double distancia;
	
	rota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem da atual do carro em Casa Branca"));
	rota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem da atual do carro Vargem Grande do Sul"));
	rota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem da atual do carro São Sebastião da Grama"));
	rota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem da atual do carro São José do Rio Pardo"));
	
	
	distancia = rota1 + rota2 + rota3 + rota4;

	System.out.println("Você percorreu: " + distancia + " quilometros");
	}
}
