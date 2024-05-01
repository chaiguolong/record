import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		//将数据写入某一种载体
		DataOutputStream out = null;
		DataInputStream	 in = null;
		try {
			out = new DataOutputStream(
					new FileOutputStream("/Users/develop/Documents/Doc"
						+"/Daily_record/test/order.txt"));
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		//价格
		double[] prices = {18.99, 9.22, 14.22, 5.22, 4.21};
		//数目
		int[] units = {10, 10, 20, 39, 40};
		//产品名称
		String[] descs = {"T恤衫", "杯子", "洋娃娃", "大头针", "钥匙链"};
		//向数据过滤流写入主要类型
		try {
			for (int i = 0; i < prices.length; i++) {
				//写入价格,使用tab隔开数据
				out.writeDouble(prices[i]);
				out.writeChar('\t');
				//写入数目
				out.writeInt(units[i]);
				out.writeChar('\t');
				//写入产品名称,行尾加入换行符
				out.writeChars(descs[i]);
				out.writeChar('\n');
			}
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		//将数据读出
		double price;
		int unit;
		StringBuffer desc;
		double total = 0.0;
		try {
			in = new DataInputStream(
					new FileInputStream("/Users/develop/Documents/Doc/"
						+"Daily_record/test/order.txt"));
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}

		try {
			while(true){
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
				System.out.println("订单信息: "+"产品名称: "+ desc+",\t数量: "+unit+",\t价格:"+price);
				total = total + unit*price;
			}
			
		} catch(EOFException e){
			System.out.println("\n总共需要: "+total+"元");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
