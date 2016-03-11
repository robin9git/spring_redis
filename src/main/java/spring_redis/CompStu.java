package spring_redis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stu> listS = new ArrayList<Stu>();
        Stu s1 = new Stu();
        s1.setId(1);
        s1.setName("小明1");
        s1.setAge(20);
        Stu s2 = new Stu();
        s2.setId(14);
        s2.setName("小明5");
        s2.setAge(27);
        Stu s3 = new Stu();
        s3.setId(5);
        s3.setName("小明2");
        s3.setAge(25);
        Stu s4 = new Stu();
        s4.setId(16);
        s4.setName("小明10");
        s4.setAge(10);
        listS.add(s1);
        listS.add(s2);
        listS.add(s3);
        listS.add(s4);
        print(listS);
        Collections.sort(listS);
        print(listS);
        Collections.sort(listS, new AgeComp());
        print(listS);
        //根据Collections.sort重载方法实现
        Collections.sort(listS, new Comparator<Stu>() {

			public int compare(Stu o1, Stu o2) {
				// TODO Auto-generated method stub
				Stu s1 = o1;
				Stu s2 = o2;
				return s1.getId()-s2.getId();
			}
		});
        print(listS);
		
	}
	
	public static void print(List<Stu> list){
		System.out.println("----------------------------------");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).toString());
	    }
	}
	
	static class AgeComp implements Comparator{

		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Stu s1 = (Stu) o1;
			Stu s2 = (Stu) o2;
			return s1.getAge()-s2.getAge();
		}
		
	}

}


