

import java.util.Scanner;

class test {
  public static void main(String[] args) {
    Scanner com = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = com.nextLine();
    int age= com.nextInt();
    int salary= com.nextInt();
  
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
