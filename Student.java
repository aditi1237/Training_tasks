package Datatypes;
import java.io.*; 
import java.util.*; 

public class Student implements Comparable<Student>
{

private int id;
private String name;
private int marks;
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
public int getMarks() {
return marks;
}
public void setMarks(int marks) {
this.marks = marks;
}

public Student() {

}
public Student(int id, String name, int marks) {
super();
this.id = id;
this.name = name;
this.marks = marks;
}


@Override
public String toString() {
return id+" "+name+" "+marks;
}
@Override
public int compareTo(Student arg0) {
	// TODO Auto-generated method stub
	return this.id -arg0.id;
}

}

