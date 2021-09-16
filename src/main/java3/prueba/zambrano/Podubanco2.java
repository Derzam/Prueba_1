package prueba.zambrano;

import java.util.Scanner;

public class Podubanco2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		int opcion;
		String clave;
		String cuentaTransferencia;
		int saldoDisponible = 2500;

		do {

			System.out.println("Ingrese clave");
			clave = lector.nextLine();

			if (clave.equals("85DB")) {
				do {
					System.out.println("BANCO PRODUBANCO, elija una opcion: ");
					System.out.println("1-Realizar transferencia");
					System.out.println("2-Consultar transacciones");
					System.out.println("3-SALIR");
					opcion = entrada.nextInt();
					if (opcion == 1) {
						System.out.println("No tiene ningun pago pendiente");
					} else if (opcion == 2) {
						System.out.println("Ingrese la cuenta de destino de la transferencia");
						cuentaTransferencia = lector.nextLine();
						System.out.println("Ingrese el monto a transferir");
						int montoIngresado = entrada.nextInt();
						int nuevoSaldo = (saldoDisponible - montoIngresado);
						System.out.println("Su nuevo saldo es: " + nuevoSaldo);

					}
				} while (opcion != 3);

			} else {
				System.out.println("La clave ingresada es incorrecta");
			}

		} while (!clave.equals("-1"));
		System.out.println("Gracias por preferirnos");

	}

}
