public class Personne {
	private String Nom ;
	private String Prenom ;
	
	public Personne( String n, String p) {
		Nom = n ;
		Prenom = p ;
	}
	
	public String getNom() {
		return Nom; 
	}
	
	public String getPrenom() {
		return Prenom; 
	}
	
	public String toString() {
		return "La personne se nomme " + Nom + " "+ Prenom ;
	}
	
	
}