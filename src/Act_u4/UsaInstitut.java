package Act_u4;

public class UsaInstitut {

	public static void main(String[] args) {
		
		Institut JH = new Institut ("Jaume Huguet");
	
		Institut JH2 = new Institut ("JH2",1000);
		
		Alumne David = new Alumne ("David",18, "12345678G", "d@gmail.com");
		Alumne Sergi = new Alumne ("Sergi",18, "87654321G", "s@gmail.com");
		Alumne Anna = new Alumne ("Anna",20, "13572468G", "a@gmail.com");
		Alumne Luismi = new Alumne ("Luismi",22, "11223344G", "l@gmail.com");
		Alumne Gerard = new Alumne ("Gerard",24, "88776655G", "g@gmail.com");
		Alumne Joan = new Alumne ("Joan",28, "22446688G", "j@gmail.com");
		
		JH.AafegirAlumne(Gerard);
		JH.AafegirAlumne(Luismi);
		JH.AafegirAlumne(Anna);
		JH2.AafegirAlumne(Sergi);
		JH2.AafegirAlumne(David);	
		JH2.AafegirAlumne(Joan);
		
		for (int i = 0 ; i < JH.getNum(); i++ ) {
			System.out.println(JH.getLlistaAlumne()[i].getNom());
		}
		
		for (int i = 0 ; i < JH2.getNum(); i++ ) {
			System.out.println(JH2.getLlistaAlumne()[i].getNom());
		}
		
	}
}
