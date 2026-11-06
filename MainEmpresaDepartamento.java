package aula_05_11;

public class MainEmpresaDepartamento {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("RH");
		Empresa empresa = new Empresa("Corporação Cápsula",departamento);
		
		System.out.println("Empresa: " + empresa.getNome()
				 		+ "\nDepartamento: " + departamento.getNome());
	}

}
