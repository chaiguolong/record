import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日hh点mm分ss秒");

		String str = "";
		try {
			Date date = sdf.parse("2005-8-11 18:30:38");
			str = sdf1.format(date);
		} catch(ParseException e){
			e.printStackTrace();
		}

		System.out.println(str);

	}
	
}
