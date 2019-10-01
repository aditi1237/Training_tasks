package Datatypes;

import java.util.*;
import java.io.*; 




public class AscOrder {
	public static void main(String[] args) {
		

        ArrayList<Student> list = new ArrayList<Student>();
		Student stu1=new Student(1, "rama", 10);
		Student stu2=new Student(2, "raj", 11);
		Student stu3=new Student(3, "ram", 12);
		Student stu4=new Student(4, "ramu", 13);
		Student stu5=new Student(5, "abc2", 16);


		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);

		Collections.sort(list); 
		  
        System.out.println("Students after sorting : "); 
        for (Student movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getId() + " " + 
                               movie.getMarks()); 
        } 

		//System.out.println(map.get("raj"));


		}

}
