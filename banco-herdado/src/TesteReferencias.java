
public class TesteReferencias {

	public static void main(String[] args) {
		  funcionario g1 = new Gerente();
          g1.setNome("Marcos");
          g1.setSalario(5000.0);
          
          funcionario f = new funcionario();
          f.setSalario(2000.0);
          
          funcionario ev = new EditorVideo();
          f.setSalario(2500.0);

          ControleBonificacao controle = new ControleBonificacao();
          controle.registra(g1);
          controle.registra(f);
          controle.registra(ev);
          
          System.out.println(controle.getSoma());

	}

}
