import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Renda anual com salário: ");
		double annualSalaryIncome = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		double annualServiceIncome = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double annualCapitalGain = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double medicalExpenses = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double educationalExpenses = sc.nextDouble();
		System.out.println();
		
		double salaryTax = 0.0;
		if (annualSalaryIncome / 12 < 3000.0) {
			salaryTax = 0.0;
		} 
		else if (annualSalaryIncome / 12 < 5000.0) {
			salaryTax = annualSalaryIncome * 0.1;
		} 
		else {
			salaryTax = annualSalaryIncome * 0.2;
		}
		
		double serviceTax = 0.0;
		if (annualServiceIncome == 0.0) {
			serviceTax = 0.0;
		}
		else {
			serviceTax = annualServiceIncome * 0.15;
		}
		
		double capitalTax = 0.0;
		if (annualCapitalGain == 0.0) {
			capitalTax = 0.0;
		}
		else {
			capitalTax = annualCapitalGain * 0.2;
		}
		
		double grossTax = salaryTax + serviceTax + capitalTax;
		
		double abatement = 0.0 ;
		double maximumDeductible = grossTax * 0.3;
		double expenses = medicalExpenses + educationalExpenses;
		if (expenses < maximumDeductible) {
			abatement = expenses;
		}
		else {
			abatement = maximumDeductible;
		}
		
		double netTax = grossTax - abatement;
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", salaryTax);
		System.out.printf("Imposto sobre serviços: %.2f%n", serviceTax);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", capitalTax);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maximumDeductible);
		System.out.printf("Gastos dedutíveis: %.2f%n", expenses);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", grossTax);
		System.out.printf("Abatimento: %.2f%n", abatement);
		System.out.printf("Imposto devido: %.2f%n", netTax);

		
		sc.close();

	}

}
