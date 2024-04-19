package MIPROGRAMA;

import java.util.Scanner;

public class MANEJAPERSONA {
	public static void main(String[] args) {
		 System.out.println("Vamos a conocer la persona");
		 Scanner entrada = new Scanner(System.in);
		 Alumno clase[];
		 clase=new Alumno[3];
		 for(int cont=0;cont<3;cont++) {
			 clase[cont]=new Alumno();
			 System.out.println("\nNombre alumno;"+cont);
			 clase[cont].setNombre(entrada.next());
			 System.out.println("\n 1º Apellido alumno;"+cont);
			 clase[cont].setApellido1(entrada.next());
			 System.out.println("\n 1º Apellido;"+cont);
			 clase[cont].setApellido2(entrada.next());
			 System.out.println("\nNota Alumno;"+cont);
			 clase[cont].setNota(entrada.nextDouble());
	}
		 System.out.println("**********************");
		 System.out.println("     LISTA CLASE");
		 System.out.println("**********************");
		 for(int cont=0;cont<3;cont++) {
			 System.out.println("\n"+(cont+1)+"  ");
			 System.out.println(clase[cont].getNombre()+"  ");
			 System.out.println(clase[cont].getApellido1()+"  ");
			 System.out.println(clase[cont].getApellido2()+"  ");
			 System.out.println(clase[cont].getNota()+"  ");
			 
			 
		 }
}
}
