package exercicio2Poo;

public class ExFuncionariosTeste {

	public static void main(String[] args) {

		
		ExGerente fg1 = new ExGerente("Greg", 18, 'm', "92873627877", 1.73f, false);
		ExGerente fg2 = new ExGerente("Tonia", 18, 'f', "32435433234", 1.65f, true);
		
		ExVendedor fv1 = new ExVendedor("Abigal", 87, 'f', "32423212333", 1.10f, 1);
		ExVendedor fv2 = new ExVendedor("Jamal", 23, 'm', "74635462759", 1.75f, 2);
		
		fg1.visualizar();
		fg2.visualizar();
		
		fv1.visualizar();
		fv2.visualizar();
	}

}
