# Ejercicio 6: SancionUsuarioException

## Explicación Lógica
1. **Protección de Estado:** Impide la ejecución de transacciones operativas (`renovarPrestamo`) si el objeto no cumple las condiciones de habilitación (`sancionado == true`).
2. **Control de Flujo:** Notifica el rechazo de la acción impidiendo inconsistencias dentro del flujo de negocio.