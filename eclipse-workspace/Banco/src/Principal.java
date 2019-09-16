
public class Principal {

		public static void main(String[] args) {
			
			ContaCorrente ContaIsabela = new ContaCorrente();
			ContaIsabela.saldo = 1000.0;
			
			System.out.println("Isabela, " + "seu saldo atual é: " + "R$" + ContaIsabela.saldo);	

			ContaIsabela.saque(200.0);
			System.out.println("Isabela, " + "você fez um saque de: " + "R$ " + ContaIsabela.saldo);
			
			ContaIsabela.depositar(10.0);
			System.out.println("Isabela, " + "você fez um depósito de: " + "R$" + ContaIsabela.saldo + " na sua conta.\n");
			
			/**---------------------------------------------------------------------------*/
			
			ContaCorrente ContaMaria = new ContaCorrente();
			ContaMaria.saldo = 300.0;
			
			System.out.println("Maria, " + "seu saldo atual é: " + "R$" + ContaMaria.saldo);	

			ContaMaria.saque(100.0);
			System.out.println("Maria, " + "você fez um saque de: " + "R$ " + ContaMaria.saldo);
			
			ContaMaria.depositar(20.0);
			System.out.println("Maria, " + "você fez um depósito de: " + "R$ " +  ContaMaria.saldo + " na sua conta.\n");
			
			if (ContaIsabela == ContaMaria) {
		        System.out.println("As contas são iguais.\n");
		    } else {
		        System.out.println("As contas são diferentes.\n");        
		    }	
		}
		

}
