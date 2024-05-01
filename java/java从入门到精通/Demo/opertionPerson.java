class Person{
	private String name;
	private int age;
	private String like;

	public Person(String name, int age, String like){
		this.name = name;
		this.age = age;
		this.like = like;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getLike(){
		return like;
	}

	public void setName(){
		this.name = name;
	}

	public void setAge(){
		this.age = age;
	}

	public void setLike(){
		this.like = like;
	}
}



public class opertionPerson {
	public static void main(String[] args) {
		Person p = new Person("张三", 30, "摄影");

		System.out.println(p.getName()+","+p.getAge()+","+p.getLike());

	}
	
}
