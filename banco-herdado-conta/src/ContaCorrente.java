
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	 @Override
     public boolean saque(double valor) {
         double valorASacar = valor + 0.2;
         return super.saque(valorASacar);
     }

}
