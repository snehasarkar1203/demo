package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_StudentList {
public static void main(String[] args) {
	Student_List s1=new Student_List("sneha",22);
	Student_List s2=new Student_List("kruti",23);
	Student_List s3=new Student_List("sakshi",25);
	Student_List s4=new Student_List("tanisha",18);
	Student_List s5=new Student_List("falguni",20);
	Student_List s6=new Student_List("chitra",22);
	Student_List s7=new Student_List("mansi",21);
	Student_List s8=new Student_List("dolly",16);
	Student_List s9=new Student_List("hanshika",19);
	Student_List s10=new Student_List("khushi",22);
	ArrayList<Student_List>student_List=Student_List.getStudent_List();
			
	Main_StudentList.printList_1(student_List);
	Main_StudentList.printList_2(student_List);
	Main_StudentList.printList_3(student_List);
	Main_StudentList.printList_4(student_List);	
}
public static void printList_4(ArrayList<Student_List>List) {
	List.stream().sorted((s1,s2)->-(s1.getAge()-s2.getAge())).forEach(s->System.out.println(s));
}
public static void printList_3(ArrayList<Student_List>List) {
	List<Student_List> list2=new ArrayList<Student_List>();
	list2=List.stream().filter(d->d.getName().startsWith("s")).collect(Collectors.toList());
    list2.stream().forEach(d->System.out.println(d));
}
public static void printList_2(ArrayList<Student_List>List) {
	System.out.println("*********");
	List.stream().filter(d->d.getAge()>25).forEach(e->System.out.println(e));
}
public static void printList_1(ArrayList<Student_List> student_List) {
    System.out.println("---------");
    student_List.stream().forEach(t->System.out.println(t));
}
}
