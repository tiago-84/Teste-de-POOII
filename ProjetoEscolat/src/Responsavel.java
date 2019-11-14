
public class Responsavel extends ControleAluno {
	private   String nome;
	  private String email;
	  private String telefone;
	
	  public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
		if(nome.length() > 30) {
			System.out.println("O nome do responsavel deve conter até 30 caracteres.");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}

