import java.io.*;
public class ByteArrayDemo {
	public static void main(String[] args) {
		String tmp = "abcdefghijklmnopqrstuvwxyx";
		byte[] src = tmp.getBytes();
		ByteArrayInputStream input = new ByteArrayInputStream(src);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		new ByteArrayDemo().transform(input, output);
		byte[] result = output.toByteArray();
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

