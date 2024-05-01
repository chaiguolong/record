import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/1.txt");
		if(f.exists()){
			f.delete();
		}else{
			try {
				f.createNewFile();
			} catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		//getname()方法,取得文件名
		System.out.println("文件名: "+ f.getName());
		//getPath()方法,取得文件路径
		System.out.println("文件路径: " + f.getPath());
		//getAbsoluteFile()方法,得到绝对路径名
		System.out.println("绝对路径: "+ f.getAbsoluteFile());
		//f.getParent()方法,得到父文件夹名称
		System.out.println("父文件夹名称: "+ f.getParent());
		//f.exists()方法,判断文件是否存在.
		System.out.println(f.exists() ? "文件存在" : "文件不存在");
		//f.canWrite()方法,判断文件是否可写
		System.out.println(f.canWrite() ? "文件可写" : "文件不可写");
		//f.canRead()方法,判断文件是否可读
		System.out.println(f.canRead() ? "文件可读" : "文件不可读");
		//f.isDirectory()方法,判断文件是否是目录
		System.out.println(f.isDirectory() ? "是目录": "不是目录");
		//f.isFile()方法,判断是否是文件
		System.out.println(f.isFile() ? "是文件" : "不是文件");
		//f.isAbsolute()方法,判断是否是绝对路径
		System.out.println(f.isAbsolute() ? "是绝对路径" : "不是绝对路径");
		//f.lastModified()方法,文件最后的修改时间
		System.out.println("文件的最后修改时间: "+f.lastModified());
		//length(),文件的长度
		System.out.println("文件大小: "+f.length()+"Bytes");
	}
	
}
