package lac.puc.ubi.services.modellibrary;

import java.io.Serializable;
import java.util.UUID;

/**
 * Serializavel AuthInfo. 
 * Ser� visto tanto pelo Cliente Android quando pela M�dulo Controlador, ent�o 
 * recomenda-se que fique em algum tipo de projeto-library visto pelos dois.
 * 
 * @author andremd
 *
 */
public class AuthInfo implements Serializable {
	
	/**
	 * Default Java serial version UID
	 **/
	private static final long serialVersionUID = 1L;

	/** Client UUID */
	private UUID uuid;
	
	/** Authentication Info */
	private String email;
	private String password;

	/**
	 * Constructor.
	 **/
	public AuthInfo(UUID _id, String _name, String _pass) {
		uuid = _id;
		email = _name;
		password = _pass;
	}
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	/**
     * {@inheritDoc}
     **/
    @Override
    public String toString() {
    	return "Event Authentication: \n uuid: " + uuid + "\n email: " + email + "\n pass: " + password + "\n";
	}
}
