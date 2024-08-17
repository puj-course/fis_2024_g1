# *Siste Turismo*

<!-- fis_2024_g1 -->

## `Tabla de Contenidos`
- [Descripción](#descripcion)
- [Características](#caracteristicas)
- [Tecnologías](#tecnologias)
- [Diagrama Casos de Uso](#diagramaCasosDeUso)
- [Diagrama de Clases](#diagramaClases)
- [Instalación y Uso](#instalacionUso)
- [Especificacion de Funcionalidades](#especificacionFuncionalidades)


### Descripción {#descripcion}
El Sistema de Reservas de Hotel es una aplicación que permite gestionar las reservas de habitaciones en un hotel.  
La aplicación facilita el registro de habitaciones, clientes y reservas, así como la consulta de la disponibilidad de habitaciones.  
Además, ofrece reportes de ocupación y estadísticas del hotel.

### Características {#caracteristicas}
- **Registro de habitaciones**: Permite agregar, modificar y eliminar habitaciones en el sistema.
- **Registro de clientes**: Permite agregar, modificar y eliminar información de los clientes.
- **Gestión de reservas**: Permite crear, modificar y cancelar reservas de habitaciones.
- **Disponibilidad de habitaciones**: Consulta la disponibilidad de habitaciones en tiempo real.
- **Reportes de ocupación**: Genera reportes sobre la ocupación de habitaciones.
- **Estadísticas**: Proporciona estadísticas sobre las reservas y la ocupación del hotel.

### Tecnologías {#tecnologias}
- **Java Swing**: Utilizado para la interfaz gráfica de usuario (GUI).
- **MySQL o PostgreSQL**: Utilizado para la persistencia de datos.

### Diagrama de Casos de Uso {#diagramaCasosDeUso}
![Diagrama Casos de Uso](https://github.com/ErickSalazar07/Web/blob/main/pictures/userCase.png?raw=true)

### Diagrama de Clases{#diagramaClases}

```mermaid
 classDiagram
    Hotel --|> Habitacion
    Hotel --|> BaseDatos
    Habitacion --|> Cliente
    Habitacion --|> Pago 

    class Pago{
        -String metodoPago
    }

    class Habitacion{
        -int id
        -bool ocupado
        -Date fechaInitOcupacion
        -Date fechaEndOcupacion
        +void mostrarCliente()
    }
    class Hotel{
        -int numHabitaciones
        +void mostrarHabitaciones()
    }

    class Cliente{
        -int id
        -String correo
        -String direccion
        +void mostrarInformacion()
    }  

    class BaseDatos{
        +void conectar()
        +void desconectar()
    }
    
```

### Instalación y Uso {#instalacionUso}
1. Clona el repositorio: `git clone` [Repositorio](https://github.com/puj-course/fis_2024_g1.git)  

### `Lean Canvas`  
### ***Link:*** [Canvas](https://www.canva.com/design/DAGL5-BW-tM/t6wcoT0ZNaTMHwAL7HTbfA/edit?utm_content=DAGL5-BW-tM&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton) 

### Especificacion de funcionalidades {#especificacionFuncionalidades}

* Reserva(precio, fecha, check in, check out, etc) "Falta especificar mas"
* Busqueda de hoteles por ciudad/ubicacion
* Disponibilidad de ocupacion en hoteles
* Caracteristicas de habitaciones
* Servicios por GUI
* (Conexion con base de datos)
* Proveer diferentes metodos de pago
* Proveer un espacio para retroalimentacion del hotel y sus habitaciones por parte del usuario
* Informe de estadisticas (habitaciones mas usadas, comentario postivos/negativos)
