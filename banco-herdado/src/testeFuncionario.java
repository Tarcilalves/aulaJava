
public class testeFuncionario {

	public static void main(String[] args) {
		
		funcionario nico = new funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

	}

}
