package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String dp = sc.next();
		
		System.out.print("Dia do pagamento: ");
		Integer day = sc.nextInt();
		
		System.out.print("Email: ");
		String em = sc.next();
		
		System.out.print("Telefone: ");
		String tel = sc.next();
		System.out.println();
		
		Department dept = new Department(dp, day, new Address(em, tel));
		
		System.out.println("Quantos funcionários tem o departamento?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Dados do funcionário " + i + ": ");
			System.out.print("Nome: ");
			String nam = sc.nextLine();
			
			System.out.print("Salário: ");
			double sal = sc.nextDouble();
			sc.nextLine();
			
			Employee emp = new Employee(nam, sal);
			dept.addEmployee(emp);
		}
		
		System.out.println();
		
		showReport(dept);
		
		sc.close();

	}

	private static void showReport(Department dept) {
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println("Departamento " + dept.getName() + ": R$" + String.format("%.2f", dept.payroll()));
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println();
		System.out.println("Funcionarios: ");
		System.out.println(dept);
		System.out.println("Para dúvidas, favor, entrar em contato " + dept.getAddress() + "\n");
		
	}

}
