package Almacen.Model;

import java.time.LocalDate;
import java.util.Date;

//SE crea la clase Cliente Natural que hereda de la clase Cliente
public class ClienteNatural extends Cliente {

    // Atributos de la clase
    private String email;
    private LocalDate fechaNacimiento;

    // Constructor de la clase


    public ClienteNatural(String nombre, String apellidos, int id, String direccion, String telefono,
                          String email, LocalDate fechaNacimiento) {
        super(nombre, apellidos, id, direccion, telefono);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    // getters y setters de la clase
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

