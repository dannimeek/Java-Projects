
public class Budgie extends Pet {
	
	String colorOfFeathers;
	
	
	Budgie(String name, String ownerName, String colorOfFeathers){
		
		super(name,ownerName);
		
		this.colorOfFeathers = colorOfFeathers;
			
	}
	
	String getName() {
		
		return super.name;
		
	}
	
	String getOwnerName() {
		
		return super.ownerName;
		
	}
	
	String getColorOfFeathers() {
		
		return colorOfFeathers;
		
	}

}
