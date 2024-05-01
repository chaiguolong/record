public enum homework01_17 {
	MONDAY{
		public String getDay(){
			return "星期一";
		}
	},
	TUESDAY{
		public String getDay(){
			return "星期二";
		}
	},
	WEDNESDAY{
		public String getDay(){
			return "星期三";
		}
	};

	public abstract String getDay();
	
}
