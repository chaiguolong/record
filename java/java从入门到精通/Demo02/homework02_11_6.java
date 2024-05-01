abstract class Person{
	private String name;
	private int age;
	private String occupation;

	public Person(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	public abstract void talk();

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		if(age > 0){
			this.age = age;
		}
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
//Student继承Person
class Student extends Person{
	public Student(String name, int age, String occupation){
		super(name,age,occupation);
	}

	public void talk(){
		System.out.println(getOccupation()+"-->姓名:"+getName()
				+",年龄:"+getAge()+",职业:"+getOccupation());
	}
}
public class homework02_11_6 {
	public static void main(String[] args) {
		new Student("李乐乐", 20, "干部").talk();
		new Student("王小六", 30, "工人").talk();
	}
	
}
