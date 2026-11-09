public class Usuario {
    private String nombre;
    private boolean sancionado;
    private int diasPenalizacion;

    public Usuario(String nombre, boolean sancionado, int diasPenalizacion) {
        this.nombre = nombre;
        this.sancionado = sancionado;
        this.diasPenalizacion = diasPenalizacion;
    }

    public void renovarPrestamo() throws UsuarioSancionadoException {
        if (this.sancionado) {
            throw new UsuarioSancionadoException("El usuario '" + this.nombre + "' posee una sanción activa de " + this.diasPenalizacion + " días. No puede renovar materiales.");
        }
        System.out.println("Renovación aprobada para el usuario: " + this.nombre);
    }

    public static void main(String[] args) {
        Usuario usuarioSancionado = new Usuario("Renzo Gonzalez", true, 15);

        try {
            System.out.println("Intentando renovar préstamo para usuario sancionado...");
            usuarioSancionado.renovarPrestamo();
        } catch (UsuarioSancionadoException e) {
            System.err.println("Error de estado operativo: " + e.getMessage());
        }
    }
}