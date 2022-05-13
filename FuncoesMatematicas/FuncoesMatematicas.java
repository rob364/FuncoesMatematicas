
public class FuncoesMatematicas {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);//Essa linha de codigo é A recebe raiz quedrada de x(O mesmo que 3)
		B = Math.sqrt(y);//B recebe raiz quedrada de y
		C = Math.sqrt(25.0);//C recebe raiz quedrade de 25.0
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);//A recebe potenciação de x e y
		B = Math.pow(x, 2.0);//B recebe x elevado ao quadrado.
		C = Math.pow(5.0, 2.0);//C recebe 5.0 elevado ao queadrado
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + "elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);//A recebe o valor absoluto de y ou seja retirar o valor negativo caso tenha
		B = Math.abs(z);//B recebe o valor absoluto de z ou seja z não valera -5 e sim 5
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
		
		

	}

}
