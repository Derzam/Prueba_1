package prueba.zambrano.moreira;

import java.util.Scanner;

public class MainBancoPichincha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoInt = new Scanner(System.in);
		int opcion;
		String claveIngresada;
		String cuentaTransferencia;
		String cuentaDestino;
		int saldo = 2500;
		do {
			System.out.println("Ingresar clave");
			claveIngresada = teclado.nextLine();
			if (claveIngresada.equals("85ZF")) {
				do {
					System.out.println("BANCO PICHINCHA, elija una opcion");
					System.out.println("1-Consultar pagos");
					System.out.println("2- Realizar trasferencia");
					System.out.println("3-SALIR");
					opcion = tecladoInt.nextInt();

					if (opcion == 1) {
						System.out.println("No posee movimientos en su cuenta :"  );
						cuentaTransferencia = teclado.nextLine();
						System.out.println("No posee movimientos en su cuenta :" +cuentaTransferencia );
					} else if (opcion == 2) {
						System.out.println("Ingrese la cuenta de destino ");
						cuentaDestino = teclado.nextLine();
						System.out.println("Ingrese el monto a transferir");
						int monto = tecladoInt.nextInt();
						int nuevoSaldo = saldo - monto;
						System.out.println("Su nuevo saldo es: " + nuevoSaldo);
					}
				} while (opcion != 3);
			} else {
				System.out.println("La clave ingresada no es la correcta ");
				System.out.println("Ingrese una nueva clave");
				claveIngresada = teclado.nextLine();
			}

		} while (claveIngresada.equals("3"));

		System.out.println("Gracias por preferirnos");

	}

}
