
public class Test {
	
	public static void main(String[] args) { 
		 		Persona luca = new Persona(); 
		 		luca.setSurname("Bianchi"); 
		 		luca.setName("Luca"); 
		 		luca.setPassword("123456"); 
		 		luca.setEta(56);// eta è privato all'interno della classe Persona 
		 		 Persona anna = new Persona();
		 		 anna.setEta(15);
		 		 anna.setName("Anna");
		 		 anna.setSurname("Nardin");
		 		 anna.setPassword("9876");
		 		//luca.setEta(20); 
		 		//luca.setEta(200); 
		 		 
		 		//luca.eta = 250; 
		 		stampaDatiPersona(luca); 
		 		stampaDatiPersona(anna); 
		 		 
		 	} 
		 	 
		 	static void stampaDatiPersona(Persona p) { 
		 		System.out.println(p.getName()); 
		 		String pass = "123"; 
		 		pass += "456"; 
		 		System.out.println("Password: " + p.verificaPassword(pass)); 
		 		System.out.println(p.getEta());
		 	} 


}
