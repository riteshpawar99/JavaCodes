//assignment 6-2
package neww;
public class Person {
		
		String name;
		int age;
		
		void setData(String name, int age) {
			
			this.name = name;
	        this.age = age;
		}
		
		void getData() {
			System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
		}
}
