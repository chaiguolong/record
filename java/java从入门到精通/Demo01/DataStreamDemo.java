import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		//将数据写入某种载体
		DataOutputStream out = new DataOutputStream(
				new FileOutputStream("/Users/develop/Documents/"
					+"Doc/Daily_record/test/order.txt"));
		//价格
		double[] prices = {18.99, 9.22, 14.22, 5.22, 4.21};
		//数目
		int[] units = {10, 10, 20, 39, 40};
		//产品名称
		String[] descs = {"T恤衫", "杯子", "洋娃娃", "大头针", "钥匙链"};

		//向数据过滤流写入主要类型
		for (int i = 0; i < prices.length; i++) {
			//写入价格,使用tab隔开数据
			out.writeDouble(prices[i]);
			out.writeChar('\t');
			//写入数目
			out.writeInt(units[i]);
			out.writeChar('\t');
			//写入产品名称
			out.writeChars(descs[i]);
			out.writeChar('\n');
		}
		out.close();

		//将数据读出
		DataInputStream in = new DataInputStream(
				new FileInputStream(
					"/Users/develop/Documents/"
					+"Doc/Daily_record/test/order.txt"));

		double price;
		int unit;
		StringBuffer desc;
		double total = 0.0;

		try {
			while (true) {
				//读出价格
				price = in.readDouble();
				//跳过tab
				in.readChar();
				//读出数目
				unit = in.readInt();
				//跳过tab
				in.readChar();
				char chr;
				//读出产品名称
				desc = new StringBuffer();
				while ((chr = in.readChar()) != '\n') {
					desc.append(chr);
				}
				System.out.println("订单信息: "+"产品名称: "+desc
						+", \t数量:"+unit+",\t价格:"+price);
				total = total + unit*price;
			}
			
		} catch(EOFException e){
			System.out.println("\n总共需要: "+total+"元");
		}
		in.close();
	}
}
