import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat("blake", 100, "Ethan");
		blake.setName("Blake");
		blake.setAge(100);
		blake.setOwner("Ethan");
		blake.eat("Cat Food");
		

		
			
			
		Lion leo = new Lion("Leo", 100, "Ethan");
		leo.setName("Leo");
		leo.setManeColor(Color.YELLOW);
		leo.roar();
		
		
	}
	
	
	
}