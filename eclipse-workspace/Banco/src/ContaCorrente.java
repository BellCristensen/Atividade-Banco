
public class ContaCorrente {
	
	double total;
	double saque;
	double depositar;
	double saldo;
	double limite;
	int numero;
	String titular;
	

	boolean saque(double valor) {
	        if (this.saldo < valor) {
	            return false;
	        }
	        else {
	            this.saldo = this.saldo =- valor;
	            return true;
	        }
	    }

	void deposita(double valor) {
		this.saldo =+ valor;
    }
	
	void depositar(double valor) {
		this.saldo =+ valor;
		
	}

}

