
public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne ("CONTRUCCI", "Lou");
		System.out.println("La personne se nomme " + p1.getNom() 
		 +" "+ p1.getPrenom());
		
		System.out.println(	p1.toString());
	}
}
