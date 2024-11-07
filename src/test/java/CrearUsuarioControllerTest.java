
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import controllers.CrearUsuarioController;
import models.Cliente;

public class CrearUsuarioControllerTest {

    CrearUsuarioController crearUsuarioController = new CrearUsuarioController();
  
    @Test
    public void testUsuarioValidoConCamposValidos() {

      Cliente resultado = crearUsuarioController.usuarioValido("John Doe", "1234567890", "john.doe@example.com", "123", "pass123", "Tarjeta");

      // Verificamos que el objeto Cliente no sea nulo
      assertEquals("John Doe", resultado.getNombre());
      assertEquals("john.doe@example.com", resultado.getEmail());
      assertEquals("1234567890", resultado.getTelefono());
      assertEquals("Tarjeta", resultado.getMedioPago());
      assertEquals("pass123", resultado.getContra());
      assertEquals("123", resultado.getExtension());
    }
}