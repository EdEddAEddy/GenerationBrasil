package exercicio1Poo;

public class ExClientesTeste {

	public static void main(String[] args) {

	ExPessoasFisicas pf1 = new ExPessoasFisicas("Arnold", 18, 'm', false, 1.42f, "48736625480");
	ExPessoasFisicas pf2 = new ExPessoasFisicas("Willis", 18, 'm', true, 1.72f, "82765478267");
	ExPessoasJuridicas pj1 = new ExPessoasJuridicas("Omar", 52, 'm', true, 1.75f, "43324543222", "23421343232421");
	ExPessoasJuridicas pj2 = new ExPessoasJuridicas("Julius", 48, 'm', false, 1.85f, "83726523678", "37627188736542");
	
	
	pf1.visualizar();
	System.out.println("******************************");
	pf2.visualizar();
	System.out.println("******************************");
	pj1.visualizar();
	System.out.println("******************************");
	pj2.visualizar();
	}

}
