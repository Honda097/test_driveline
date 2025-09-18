package curriculum29;

import java.util.Scanner;

import Procedure.Procedure;

public class Execution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		String upDown = scanner.nextLine();
		Procedure process = new Procedure(num, upDown);
		process.sort();
		scanner.close();
	}
}