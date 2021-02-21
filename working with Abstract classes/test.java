
public class test {

	public static void main(String[] args) {

		// Cat Objects
		Cat catObject1 = new Cat("Max","Ben Fleek",30,9);
		Cat catObject2 = new Cat("Wild","Kate Manns",20,9);
		Cat catObject3 = new Cat("Woopro","Jane Walace",28,7);
		
		// Budgie Objects
		Budgie budgieObject1 = new Budgie("Chalie","Megan Clay","Yellow");
		Budgie budgieObject2 = new Budgie("Beast","Mason Jill","White");
		
		Pet pet = new Cat("Cracker","Danny Mills",29,10);
		pet.getOwnerName();
		
		pet = new Budgie("Secret","Janet Dickson","Green");
		pet.getOwnerName();
		

	}

}
