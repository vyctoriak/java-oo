
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente vyc = new Cliente();
		vyc.nome = "vyctoria karina";
		vyc.cpf = "101010101";
		vyc.profissao = "Programadora";
		
		Conta contaDaVyc = new Conta();
		contaDaVyc.deposita(100);
		
		// associa o cliente a conta dele	
		contaDaVyc.titular = vyc;
		System.out.println(contaDaVyc.titular.nome);
	}

}
