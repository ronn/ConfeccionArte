package usuario;

/**
 *
 * @author RonnieDave
 */
public interface UsuarioDao {
    
    public boolean crearUsuario();
    
    public boolean autenticarUsuario();
    
    public boolean actualizarUsuario();
}
