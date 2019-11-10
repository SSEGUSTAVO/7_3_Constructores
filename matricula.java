public class matricula{
    public static void main(String[] args){
	registro nuevo = new registro();
	prisionero datos = new prisionero();
	nuevo.ingreso();
	datos.nombre = nuevo.nombre;
	datos.altura = nuevo.altura;
	datos.sentencia = nuevo.sentencia;
	datos.mensaje();
    }
}