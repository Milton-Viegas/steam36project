

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Leonardo", "Imperatori", "Bezerra");
		System.out.println(cliente1.getNomeCompleto());
		
		Cliente cliente2 = new Cliente("123455678789");
		
		cliente1.setCpf("45236613833");
		cliente1.setIdade(22);
		
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getIdade());
	}
}