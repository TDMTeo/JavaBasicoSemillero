import com.models.*;

public class Main {


	public static void main (String[] args){
		// Instancia de Administrador
		Administrador administrador = new Administrador("Luis Fernando","123");
		administrador.mostrarInformacion();

		// Instancia de Hacedor
		Hacedor hacedor = new Hacedor("Juan Buitrago","456");
		hacedor.mostrarInformacion();

		// Instancia de Oferente
		Oferente oferente = new Oferente("Angela Bolivar","789");
		oferente.mostrarInformacion();
		
		// Instancia 
	}
}
