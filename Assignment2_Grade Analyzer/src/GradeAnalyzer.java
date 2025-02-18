import java.util.Scanner;

public class GradeAnalyzer {
	public static void main(String[] args) {
		int aplus = 0, a = 0, aminus = 0, bplus = 0, b = 0, bminus = 0, cplus = 0, c = 0, cminus = 0, d = 0, f = 0;
		int grade_sum_sq = 0, score = 0, pow = 0, grade_sum = 0, total_grades = 0, vaild = 0;
		double average = 0, stddev = 0;
		System.out.print("Please input grades: ");
		Scanner Scanner = new Scanner(System.in);
		double avu = 0;
		while (Scanner.hasNextInt()) {
			score = Scanner.nextInt();
			grade_sum_sq += Math.sqrt(score);
			if (100 >= score && score >= 0) {
				grade_sum += score;
				total_grades += 1;
				pow += Math.pow(score, 2);
				avu += (-2) * score;
				if (100 >= score && score >= 98) {
					aplus += 1;
				} else if (98 > score && score >= 92) {
					a += 1;
				} else if (92 > score && score >= 90) {
					aminus += 1;
				} else if (90 > score && score >= 88) {
					bplus += 1;
				} else if (88 > score && score >= 82) {
					b += 1;
				} else if (82 > score && score >= 80) {
					bminus += 1;
				} else if (80 > score && score >= 78) {
					cplus += 1;
				} else if (78 > score && score >= 72) {
					c += 1;
				} else if (72 > score && score >= 70) {
					cminus += 1;
				} else if (70 > score && score >= 60) {
					d += 1;
				} else if (60 > score) {
					f += 1;
				}
			}
		}
		average = grade_sum / total_grades;
		stddev = Math
				.round(Math.sqrt((pow + (avu * average) + (average * average * total_grades)) / (total_grades - 1)));
		System.out.println("You entered " + total_grades + " valid grades from 0 too 100. Invalid grades are ignored!");
		System.out.print("The average = " + Math.round(average) + " with a standard deviation = ");
		System.out.println(stddev);
		System.out.println("The grade distribution is :");
		System.out.println("A+ = " + aplus);
		System.out.println("A = " + a);
		System.out.println("A- = " + aminus);
		System.out.println("B+ = " + bplus);
		System.out.println("B = " + b);
		System.out.println("B- = " + bminus);
		System.out.println("C+ = " + cplus);
		System.out.println("C = " + c);
		System.out.println("C- = " + cminus);
		System.out.println("D = " + d);
		System.out.println("F = " + f);
	}
}
