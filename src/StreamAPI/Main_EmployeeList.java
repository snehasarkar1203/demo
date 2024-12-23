package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_EmployeeList {
//private static  ArrayList<Employee_List> Employee_List = null;
public static void main(String[] args) {
	Employee_List s1=new Employee_List("sneha","tester",22.000);
	Employee_List s2=new Employee_List("kruti","CEO",21.6696);
	Employee_List s3=new Employee_List("sakshi","HR",23.568);
	Employee_List s4=new Employee_List("achal","tester",233.56);
	Employee_List s5=new Employee_List("tanisha","CEO",185.789);
	Employee_List s6=new Employee_List("mishika","HR",16.235);
	Employee_List s7=new Employee_List("chitra","Devloper",22.438);
	Employee_List s8=new Employee_List("mansi","tester",21.483);
	Employee_List s9=new Employee_List("aparna","HR",320.58);
	Employee_List s10=new Employee_List("karishma","CEO",25.680);
	Employee_List s11=new Employee_List();
	s11.display();
		//ArrayList<Employee_List>employee_Lists=Employee_List.getEmployee_List();	
	//Main_EmployeeList.printList_1(Employee_List);
	//Main_EmployeeList.printList_2(Employee_List);
	//Main_EmployeeList.printList_3(Employee_List);
	//Main_EmployeeList.printList_4(Employee_List);	
}
//public static void printList_4(ArrayList<Employee_List>List) {
//	List.stream().sorted((s1,s2)->-(s1.getSalary()-s2.getSalary())).forEach(d->System.out.println(d));
//}
//public static void printList_3(ArrayList<Employee_List>List) {
//	List<Employee_List> list2=new ArrayList<Employee_List>();
//	list2=List.stream().filter(d->d.getName().startsWith("s")).collect(Collectors.toList());
//    list2.stream().forEach(d->System.out.println(d));
//}
//public static void printList_2(ArrayList<Employee_List>List) {
//	System.out.println("*********");
//	List.stream().filter(d->d.getSalary()>55.300).forEach(e->System.out.println(e));
//}
//public static void printList_1(ArrayList<Employee_List>List) {
//    System.out.println("---------");
//    List.stream().forEach(t->System.out.println(t));
//}
}
