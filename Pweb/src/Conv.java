
public class Conv {
	
	StringBuilder valor = new StringBuilder();
	
	public String convbd(int numero) {
		
		int resto;
		String tempResto;
		
		if (numero > 0) {
			convbd (numero/2);
			resto = numero % 2;
			tempResto = Integer.toString(resto);
			valor.append(tempResto);
		}
	return valor.toString();
	}
}
