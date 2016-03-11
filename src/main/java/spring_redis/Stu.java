package spring_redis;

public class Stu implements Comparable<Stu>{

	private int id;
	
	private String name;
	
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "id:"+id+" name:"+name+" age:"+age;
	}

	public int compareTo(Stu o) {
		// TODO Auto-generated method stub
//		return 0;
//		return o.age==age?0:(o.age>age?-1:1);
		return this.name.compareTo(o.getName());
//		return o.compareTo(o);
	}
	
	
	
}
