package design;
import java.util.Date;

public class FortuneEmployee{

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo(1111,"Ilias", "HR", "1/21/11", 12000);
		System.out.println(employee1.calculateEmployeeBonus(5,12000));

		EmployeeInfo employee2 = new EmployeeInfo(1001,"Mohammed", "CEO", "5/23/08", 22000);
		System.out.println(employee1.calculateEmployeeBonus(8,22000));

		EmployeeInfo employee3 = new EmployeeInfo(2222,"Shumi", "Finance", "2/21/10", 90000);
		System.out.println(employee1.calculateEmployeeBonus(6,90000));

		EmployeeInfo daysOff = new EmployeeInfo();
		daysOff.setBonusPaidLeave(36);
		daysOff.setHolidaysLeaves(40);
		daysOff.setSickDays(120);
		daysOff.setVacationDays(80);
		System.out.println("\nNumber of hours of Bonus Paid leave: " + daysOff.getBonusPaidLeave()+"hrs");
		System.out.println("\nNumber of hours of Holiday Paid leave: " + daysOff.getHolidaysLeaves()+"hrs");
		System.out.println("\nNumber of hours of Sick leave: " + daysOff.getSickDays()+"hrs");
		System.out.println("\nNumber of hours of Vacation Paid leave: " + daysOff.getVacationDays()+"hrs");
	}
}
