
public class Cat extends Pet {

	int numberOfTeeth;
	int lengthOfTail;
	
	
	Cat(String name, String ownerName, int numberOfTeeth, int lengthOfTail){
		
		super(name,ownerName);
		
		this.numberOfTeeth = numberOfTeeth;
		this.lengthOfTail = lengthOfTail;
				
	}
	
	String getName() {
		
		return super.name;
		
	}
	
	String getOwnerName() {
		
		return super.ownerName;
			
	}
	
	int getNumberOfTeeth() {
		
		return numberOfTeeth;
		
	}
	
	int getLengthOfTail() {
		
		return lengthOfTail;
		
	}
	
}
