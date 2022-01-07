package pe.com.reto;

public class TestReto {

	public static void main(String[] args) {
		String objvalor = "42";
		
		String []  valor = objvalor.split("");
		String  valor1= null;
		String letraConvertidad = null;
		for (int i = 0; i < valor.length; i++) {
			
			
			
			 valor1 = valor[i];
			 
			 if(valor1.equals("0")) {
				 letraConvertidad="0";
			 }
			 
			 if(valor1.equals("1")) {
				 letraConvertidad="uno";
			 }
			 if(valor1.equals("2")) {
				 letraConvertidad="dos";
			 }
			 if(valor1.equals("3")) {
				 letraConvertidad="tres";
			 }
			 if(valor1.equals("4")) {
				 letraConvertidad="cuatro";
			 }

			 if(valor1.equals("5")) {
				 letraConvertidad="cinco";
			 }
			 
			 if(valor1.equals("6")) {
				 letraConvertidad="seis";
			 }
			 
			 if(valor1.equals("7")) {
				 letraConvertidad="siete";
			 }

			 if(valor1.equals("8")) {
				 letraConvertidad="ocho";
			 }

			 if(valor1.equals("9")) {
				 letraConvertidad="nueve";
			 }
			 
		}
		
		System.out.println(letraConvertidad);
		
	
		
	}

}
