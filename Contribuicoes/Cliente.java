

public class Cliente {
	
	private String primeiroNome;
	private String nomedoMeio;
	private String ultimoNome;
	private String cpf;
	private int idade;
	
	public Cliente (String primeiro, String meio, String ultimo)
	{
		primeiroNome = primeiro;
		nomedoMeio = meio;
		ultimoNome = ultimo;
	}
	
	public Cliente(String cpf)
	{
		this.cpf = cpf;
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome + " " + nomedoMeio + " " + ultimoNome;
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