import java.util.*;
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		//下面打印当前时间
		System.out.println(c1.get(Calendar.YEAR)+"年"+(c1.get(Calendar.MONTH)+1)+
				"月"+c1.get(Calendar.DAY_OF_MONTH)+"日"+c1.get(Calendar.HOUR)+
				":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));

		//增加天数为230
		c1.add(Calendar.DAY_OF_YEAR,230);

		//下面打印的是230天后的时间
		System.out.println(c1.get(Calendar.YEAR)+"年"+(c1.get(Calendar.MONTH)+1)+
				"月"+c1.get(Calendar.DAY_OF_MONTH)+"日"+c1.get(Calendar.HOUR)+
				":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
	}
	
}
