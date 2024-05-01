import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayDemo {
	public static void main(String[] args) {
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		//src为转换前的内存块
		byte[] src = tmp.getBytes();
		ByteArrayInputStream input = new ByteArrayInputStream(src);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		new ByteArrayDemo().transform(input, output);
		byte[] result = output.toByteArray();	//result为转换后的内存.
		System.out.println(new String(result));


	}

	public void transform(InputStream in, OutputStream out){
		int c = 0;
		try {
			while ((c = in.read()) != -1) {
				int C = (int)Character.toUpperCase((char)c);
				out.write(C);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
