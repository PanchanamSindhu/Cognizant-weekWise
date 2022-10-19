import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTestCases {

	@Test
	public void employeeRole() {
		System.out.println("test case for Role of the employee");
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee("John", 23, 14000, "SE",101);
		Employee e2 = new Employee("Bob", 24, 25000, "analyst",102);
		Employee e3 = new Employee("Tom", 25, 26000, "SE",103);
		Employee e4 = null;
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		assertEquals(2, TestClass.empRole(empList).size());
		assertNotNull(empList);
		assertTrue(e1.getAge() > 20);
		assertFalse(e2.getName().startsWith("A"));
		assertNull(e4);
		assertNotSame(empList, TestClass.empRole(empList));
	}

}
