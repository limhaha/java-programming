
public class GradeDemo {

	public static void main(String[] args) {
		Grade g = new Grade();
		g.count();
		int total = g.total();
		System.out.println("Total number of Grades: " + total);
		
		float percentA, percentB, percentC, percentD, percentF;
		
		percentA = g.percentA();
		percentB = g.percentB();
		percentC = g.percentC();
		percentD = g.percentD();
		percentF = g.percentF();
		
		System.out.println("\nPercent of grade 'A' : " + percentA + "%");
		System.out.println("Percent of grade 'B' : " + percentB + "%");
		System.out.println("Percent of grade 'C' : " + percentC + "%");
		System.out.println("Percent of grade 'D' : " + percentD + "%");
		System.out.println("Percent of grade 'F' : " + percentF + "%");
		
		g.graph();
	}

}
