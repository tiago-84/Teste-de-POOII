public class Aluno extends ControleAluno {
  private String nome;
  private Double nota1;
  private Double nota2;

  public String getNome() {
	return nome;
}
  public void setNome(String nome) {
	
	this.nome = nome;
	
	if(nome.length() > 30) {
		System.out.println("O nome do aluno deve conter até 30 caracteres.");
	}
}
 public Double getNota1() {
	return nota1;
}
 public void setNota1(Double nota1) {
	if(nota1 >= 0 && nota1 <= 10){
		this.nota1 = nota1;
	} else if(nota1 > 10) {
		System.out.println("Nota 1 é maior que (10) Digite uma nota com valor entre 0 e 10.");
		return;
	}  else if(nota1 < 0) {
		System.out.println("Nota 1 é menor que (0) Digite uma nota com valor positivo.");
		return;
	}
}
 public Double getNota2() {
	return nota2;
}
public void setNota2(Double nota2) {	
	if(nota2 >= 0 && nota2 <= 10){
		this.nota2 = nota2;
	} else if(nota2 > 10) {
		System.out.println("Nota 2 é maior que (10) Digite uma nota com valor entre 0 e 10.");
		return;
	}  else if(nota2 < 0) {
		System.out.println("Nota 2 é menor que (0)Digite uma nota com valor positivo.");
		return;
	}
}
  
}




