import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayDemo {
	public static void main(String[] args) {
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte[] src = tmp.getBytes();
		ByteArrayInputStream input = new ByteArrayInputStream(src);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		new ByteArrayDemo().transform(input, output);
		byte[] result = output.toByteArray();
		System.out.println(new String(result));

	}

	public void transform(InputStream input, OutputStream out){
		int c = 0;
		try {
			while ((c = input.read()) != -1) {
				int C = (int)Character.toUpperCase((char)c);
				out.write(C);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
