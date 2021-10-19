package steam36;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Leonardo", "Bezerra");
		System.out.println(cliente1.getNomeCompleto());
		
		Cliente cliente2 = new Cliente("12345567878");
		
		cliente1.setCpf("45236613833");
		cliente1.setIdade(22);
		
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getIdade());
	}
}

