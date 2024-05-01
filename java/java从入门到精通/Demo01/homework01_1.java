abstract class Person{
	private String name;
	private int age;
	private String occupation;

	public  abstract String getInfo();

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getOccupation(){
		return occupation;
	}
}

class Worker extends Person{
	public String getInfo(){
		return this.getOccupation()+"-->姓名: "+this.getName()+", 年龄: "+this.getAge()+", 职业: "+this.getOccupation();
	}
}
public class homework01_1 {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.setName("李乐乐");
		w1.setAge(20);
		w1.setOccupation("干部");
		Worker w2 = new Worker();
		w2.setName("王小六");
		w2.setAge(30);
		w2.setOccupation("工人");
		System.out.println(w1.getInfo());
		System.out.println(w2.getInfo());
	}
	
}
