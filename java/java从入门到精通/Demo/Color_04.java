public enum Color_04 {
	RED{
		public String getColor(){
			return "红色";
		}
	},

	GREEN{
		public String getColor(){
			return "绿色";
		}
	},
	
	BLUE{
		public String getColor(){
			return "蓝色";
		}
	};

	public abstract String getColor();
	
}
