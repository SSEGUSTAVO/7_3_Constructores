import java.util.*;
public class registro{
    public String nombre;
    public double altura;
    public int sentencia;
    public void ingreso(){
	Scanner input = new Scanner(System.in);
	System.out.print("Ingrese el nombre del imputado: ");
	nombre = input.next();
	System.out.print("Ingrese la altura (en metros) del imputado: ");
	altura = input.nextDouble();
	System.out.print("Ingrese la sentencia (en años) del imputado: ");
	sentencia = input.nextInt();
    }
}