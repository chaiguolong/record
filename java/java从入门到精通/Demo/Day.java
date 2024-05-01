public enum Day {
	MONDAY{
		public String getDay(){
			return "星期一";
		}
	},
	TUESDSY{
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
