package ciclos;

import java.util.Iterator;

public class ForLoopBreak_Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<=10; i++) {
			if(i == 8) {
				break;
			}
			System.out.println("i:"+i);
		}
		System.out.println("El ciclo se completo");

	}

}
