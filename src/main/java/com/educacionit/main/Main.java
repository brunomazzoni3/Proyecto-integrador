package com.educacionit.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int leido = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Bienvenido al sistema de peliculas");
			System.out.println("Ingrese la opcion deseada:");
			System.out.println("1.- Buscar por titulo");
			System.out.println("2.- Buscar por genero");
			System.out.println("3.- ABM");
			System.out.println("4- Salir");
			leido = scanner.nextInt();

			switch (leido) {
			case 1:
				System.out.println("Ingresar nombre de pelicula"); 
			break;
			
			case 2:
				System.out.println("Ingresar genero");
			break;
			
			case 3:
				System.out.println("Ingrese nueva pelicula");
				System.out.println("Modificar pelicula");
				System.out.println("Eliminar pelicula");
				System.out.println("Volver al menu principal");
			break;
			
		    }
		} while (leido < 4);
		
	
	}
}
