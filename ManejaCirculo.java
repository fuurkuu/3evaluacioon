package MIPROGRAMA;

public class ManejaCirculo {

	 public static void main(String[] args) {
	       System.out.println("Vamos a hacer un circulito");
	       Circulo miCirculito;
	       miCirculito=new Circulo(15,20,2);
	       
	       System.out.println("El area vale = "+miCirculito.devuelveArea());

	   }

	}