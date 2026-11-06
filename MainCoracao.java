package aula_05_11;

public class MainCoracao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Fulano",120);
		
		System.out.println("Nome: " + pessoa.getNome()
				 + "\nBatimentos: " + pessoa.getCoracao());

	}

}
