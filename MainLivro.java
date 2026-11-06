package aula_05_11;

public class MainLivro {

	public static void main(String[] args) {
		Livro livro = new Livro("A Metamorfose","Franz Kafka");
		
		System.out.println("Livro: " + livro.getTitulo()
						  +"\nAutor: " + livro.getAutor());

	}

}
