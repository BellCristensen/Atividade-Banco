
public class Principal {

		public static void main(String[] args) {
			
			ContaCorrente ContaIsabela = new ContaCorrente();
			ContaIsabela.saldo = 1000.0;
			
			System.out.println("Isabela, " + "seu saldo atual �: " + "R$" + ContaIsabela.saldo);	

			ContaIsabela.saque(200.0);
			System.out.println("Isabela, " + "voc� fez um saque de: " + "R$ " + ContaIsabela.saldo);
			
			ContaIsabela.depositar(10.0);
			System.out.println("Isabela, " + "voc� fez um dep�sito de: " + "R$" + ContaIsabela.saldo + " na sua conta.\n");
			
			/**---------------------------------------------------------------------------*/
			
			ContaCorrente ContaMaria = new ContaCorrente();
			ContaMaria.saldo = 300.0;
			
			System.out.println("Maria, " + "seu saldo atual �: " + "R$" + ContaMaria.saldo);	

			ContaMaria.saque(100.0);
			System.out.println("Maria, " + "voc� fez um saque de: " + "R$ " + ContaMaria.saldo);
			
			ContaMaria.depositar(20.0);
			System.out.println("Maria, " + "voc� fez um dep�sito de: " + "R$ " +  ContaMaria.saldo + " na sua conta.\n");
			
			if (ContaIsabela == ContaMaria) {
		        System.out.println("As contas s�o iguais.\n");
		    } else {
		        System.out.println("As contas s�o diferentes.\n");        
		    }	
		}
		

}
