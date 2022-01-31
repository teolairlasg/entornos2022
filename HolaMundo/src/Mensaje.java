import java.util.Date;

public class Mensaje {
	private String emisor;
	private String cuerpo;
	private Date fechaHoraCreacion;
	private Date fechaHoraModificacion;
	private String destinatario;
	
	public Mensaje() {
		this.emisor = "Emisor desconocido";
		this.cuerpo = "Texto desconocido";
		this.fechaHoraCreacion = new Date();
		this.fechaHoraModificacion = new Date();
	}
	
	
	public Mensaje(String emisor, String texto) {
		super();
		this.emisor = emisor;
		this.cuerpo = texto;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraModificacion = new Date();
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String texto) {
		this.cuerpo = texto;
		actualizarFechaHoraModificacion();
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
		actualizarFechaHoraModificacion();
	}

	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	private void actualizarFechaHoraModificacion() {
		this.fechaHoraModificacion = new Date();
		System.out.println("Hora actualizada!");
	}
	
	@Override
	public String toString() {
		return "("+fechaHoraModificacion+") Mensaje de " + emisor + ": " + cuerpo + "";
	}
}
