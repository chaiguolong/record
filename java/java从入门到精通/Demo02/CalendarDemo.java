import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		System.out.println("当前时间为:"
				+ca.get(Calendar.YEAR)+"年;"
				+(ca.get(Calendar.MONTH)+1)+"月"
				+ca.get(Calendar.DAY_OF_MONTH)+"日"
				+ca.get(Calendar.HOUR)+"时"
				+ca.get(Calendar.MINUTE)+"分"
				+ca.get(Calendar.SECOND)+"秒");

		ca.add(Calendar.DAY_OF_YEAR, 230);

		System.out.println("230天后的时间为:"
				+ca.get(Calendar.YEAR)+"年;"
				+ca.get(Calendar.MONTH)+"月"
				+ca.get(Calendar.DAY_OF_MONTH)+"日"
				+ca.get(Calendar.HOUR)+"时"
				+ca.get(Calendar.MINUTE)+"分"
				+ca.get(Calendar.SECOND)+"秒");
	}
	
}
