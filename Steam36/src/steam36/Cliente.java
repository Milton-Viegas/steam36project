package Steam36;

public class Cliente {
	
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;  //limitar quant. numeros == 11 se nao INVALIDO!!!
	private int idade;
	
	public Cliente (String primeiro, String ultimo)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
	}
	
	public Cliente(String cpf)
	{
		this.cpf = cpf;
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome + " " + ultimoNome;
		return nomeCompleto;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
}
