package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaVyc = new Conta();
		contaDaVyc.saldo = 100;
		contaDaVyc.deposita(1000);
		
		System.out.println("Seu saldo é de: R$ " + contaDaVyc.saldo);
		
		boolean conseguiuRetirar = contaDaVyc.saca(100);
		
		System.out.println("Seu saldo é de: R$ " + contaDaVyc.saldo);
		
		System.out.println(conseguiuRetirar);
		
		Conta contaDoRodrigo = new Conta();
		contaDoRodrigo.deposita(1000);
		
		boolean sucessoTransferencia = contaDoRodrigo.transfere(3000, contaDaVyc);
		
		if(sucessoTransferencia) {
			System.out.println("Transferido com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println("O seu saldo é de R$ " + contaDoRodrigo.saldo);
		System.out.println("O seu saldo é de R$ " + contaDaVyc.saldo);
		
		contaDaVyc.titular = "Vyctoria Karina";
		System.out.println(contaDaVyc.titular);
		
	}
}
