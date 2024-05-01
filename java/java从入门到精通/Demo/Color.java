public class Color {
	private String name;
	public static final Color RED = new Color("红色");
	public static final Color GREEN = new Color("绿色");
	public static final Color BLUE = new Color("蓝色");

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	private Color(String name){
		this.setName(name);
	}

	public static Color getInstance(int i){
		if(i == 0){
			return RED;
		}

		if(i == 1){
			return GREEN;
		}

		if( i == 2 ){
			return BLUE;
		}

		return null;
	}
	
}
