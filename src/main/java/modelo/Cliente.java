package modelo;
public class Cliente {
    private final int id;
    private final String dni;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente(int id, String dni) {
        this.id = id;
        this.dni = dni;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    } 
}