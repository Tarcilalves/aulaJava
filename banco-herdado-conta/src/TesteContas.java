
public class TesteContas {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposito(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposito(200);
		
		 cc.transfere(10.0, cp);

         System.out.println("CC: " + cc.getSaldo());
         System.out.println("CP: " + cp.getSaldo());

	}
	
	

}
