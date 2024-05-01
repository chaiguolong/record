abstract class Person{
	private String name;
	private int age;
	private String occupation;

	abstract String talk();

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getOccupation(){
		return occupation;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
}

class FactoryPerson extends Person{

	public String talk(){
		return this.getOccupation() + "-->姓名: " + this.getName()+", 年龄: "+this.getAge()+", 职业: "+this.getOccupation();
	}
}

public class homework_11 {
	public static void main(String[] args) {
		Person p = new FactoryPerson();
		p.setName("李乐乐");
		p.setAge(20);
		p.setOccupation("干部");
		Person p1 = new FactoryPerson();
		p1.setName("王小六");
		p1.setAge(30);
		p1.setOccupation("工人");
		System.out.println(p.talk());
		System.out.println(p1.talk());
	}
}
