/* / Classe utilitária / */
package util;

public class Conversor {
	
	public static double dollar;
	public static double quantidade;
	
	/* / F. mostra o valor pago convertendo dollar com a quantidade. / */
	public static double valorCompra() {
		return dollar*quantidade;
	}
	
	/* / F. coloca a porcentagem no valor da compra. / */
	public static double compraPorcentagem() {
		return 0.06*valorCompra()+valorCompra();
	}
	
	/* / F. toString. / */
	public String toString() {
		return "Amount to be paid in reais = "+String.format("%.2f",compraPorcentagem());
	}
	
	
}
