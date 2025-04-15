import com.grupo3.Vehiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    public void testConstructor() {
        // Verificar que el constructor inicializa correctamente
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        Assertions.assertEquals("Toyota", vehiculo.getMarca());
        Assertions.assertEquals("Corolla", vehiculo.getModelo());
    }

    @Test
    public void testSettersAndGetters() {
        // Verificar los setters y getters
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        vehiculo.setMarca("Honda");
        vehiculo.setModelo("Civic");
        Assertions.assertEquals("Honda", vehiculo.getMarca());
        Assertions.assertEquals("Civic", vehiculo.getModelo());
    }

    @Test
    public void testMostrarDetalles() {
        // Este test podría verificar la salida de mostrarDetalles
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        vehiculo.mostrarDetalles();
        // Podrías usar herramientas de captura de salida para verificar lo que se imprime
    }
}
