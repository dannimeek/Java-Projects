
public abstract class Pet {
	
	String name;
	String ownerName;
	
	Pet(String name, String ownerName){
		
	   this.name = name;
	   this.ownerName = ownerName;
		
	}
	
	abstract String getName();
	abstract String getOwnerName();
		
}
