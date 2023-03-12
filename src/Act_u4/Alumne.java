package Act_u4;

	public class Alumne {
		private int edat;
		private String nom;
		private String dni;
		private String email;


	public Alumne (String nom, int edat, String dni, String email) {
	this.nom = nom;
	this.edat = edat;
	this.dni = dni;
	this.email = email;
	}

	public String getNom() {
		return nom;
	}

	}