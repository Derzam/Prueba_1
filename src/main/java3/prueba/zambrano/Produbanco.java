package prueba.zambrano;

import java.util.Scanner;

public class Produbanco {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;
		int nuevosaldo = 0;
		int saldo = 1000;
		int saldototal = saldo - nuevosaldo;
		String clave;

		do {
			System.out.println("Ingrese la clave: ");
			clave = lector.nextLine();
			if (clave == "85AB") {
				System.out.println("BANCO PRODUBANCO, elija una opcion: ");
				System.out.println("1-Realizar transferencia");
				System.out.println("2-Consultar transacciones");
				System.out.println("3-SALIR");
				opcion = entrada.nextInt();
				
			} else if (clave != "85AB") {
				System.out.println("La clave no es correcta");
				System.out.println("Vuelva a ingresar la clave");
				clave = lector.nextLine();

			} else if (clave == "85AB") {
				System.out.println("La clave no es correcta");
				System.out.println("Vuelva a ingresar la clave");
				clave = lector.nextLine();
			} else if (opcion == 1) {
				System.out.println("Ingrese la cuenta de transferencia de destino y el monto a transferir");
				nuevosaldo = entrada.nextInt();
				System.out.println("Su nuevo saldo es: " + saldototal);
			} else if (opcion == 2) {
				System.out.println("En este momento se estan procesando las transacciones, inetente mas tarde");

			}

		} while (opcion != 3);

	}

}
