import java.awt.Color;


public class Lion extends Cat
{
		private String name;
		private Color mane;
		
		
		public Lion(String n, int a, String o)
        {
            super(n, a, o);
        }
		
		
		public void roar()
		{
			String f = "roared";
			System.out.println (name +" just "+f);
		}

		
		

		public String getName()
		{
			return name;
		}
			
		
		public void setName (String n)
		{
			name = n;
		}

		
		
		public Color getManeColor()
		{
			return mane;
		}
		
		public void setManeColor(Color m)
		{
			mane = m;
		}
    
    
    
    
    
    
    
}