public class Employee {
  String empNo;
  String empName;
  int salary;

  public Employee() {
  }

  public Employee(String empNo, String empName, int salary) {
    this.empNo = empNo;
    this.empName = empName;
    this.salary = salary;
  }

  public Employee(String empNo, String empName) {
    this.empNo = empNo;
    this.empName = empName;
  }

  void print() {
    System.out.println("사번: " + empNo + ", 이름" + empName + ", 기본급" + salary);
  }

}