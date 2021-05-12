package bean;

public class driver {
	private String name;
	   private String color;
	   private int year;
	   
	   public driver ()
	   {
		   super();
	   }
	   public driver (String name, String color, int year) {
		   this.name=name;
		   this.color=color;
		   this.year=year;
	   }
	   public void setName (String name)
	   {
		   this.name=name;
	   }
	   public String getName()
	   {
		   return name;
	   }
	   public void setAge (String color)
	   {
		   this.color=color;
	   }
	   public String getAge()
	   {
		   return color;
	   }
	   public void setWeight (int year)
	   {
		   this.year=year;
	   }
	   public int getWeight()
	   {
		   return year;
	   }
	@Override
	public String toString() {
		return "Driver [name=" + name + ", color=" + color + ", year=" + year + "]";
	}
}
