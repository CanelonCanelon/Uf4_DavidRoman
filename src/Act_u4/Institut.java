package Act_u4;

	public class Institut {

		private String Nombre;
		private int Numero = 0;
		private Alumne llistaAlumne [];
	
		public Institut(String Nombre) {
			this.Nombre = Nombre;
			llistaAlumne = new Alumne [100];
		}

		public Institut(String Nombre, int max) {
			this.Nombre = Nombre;
			this.llistaAlumne = new Alumne [max];
		}
		
		public void AafegirAlumne(Alumne Alumne) {
			this.llistaAlumne [Numero] = Alumne;
			Numero++;
		}
		
		public void setLlistaAlumne(Alumne[] llistaAlumne) {
			this.llistaAlumne = llistaAlumne;

	}
		public int getNum() {
			return Numero;
		}

		public Alumne[] getLlistaAlumne() {
			return llistaAlumne;
		}
	}
	
	