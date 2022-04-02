package arreglosoArray;

public class ArrayUnidimensional_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declracion
		int intArray[];
		int []intArray2;
		long longArray[];
		
		//Declracion array string
		String[] arr;
		
		//Asignacion memoria para 5 posicines
		arr =  new String[5];
		
		//Incializa el primero elemento del array
				arr[0]="cero";
		
		//Incializa el segundo elemento del array
		arr[1]="uno";
		
		//sucesivamente
		arr[2]="dos";
		arr[3]="tres";
		arr[4]="cuatro";
		
        System.out.println("El elemento en la psoicion 2 es:"+ arr[2]);
        System.out.println("El elemento en la psoicion 4 es:"+ arr[4]);
        
        for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice "+i +";"+ arr[i]);
		}
        System.out.println();

        String[] sArray = new String[] {"cero","uno"};
        for (int i = 0; i < sArray.length; i++) {
			System.out.println("Elemento en el indice"+ i+":"+sArray[i]);
		}
	}

}
