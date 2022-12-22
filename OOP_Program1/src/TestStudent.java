import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int student = scan.nextInt();
		Student[] std = new Student[student];
		System.out.println();
		for(int i=0;i<std.length;i++) {
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("--------------------------------");
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}//end while 
		}
		/*Student[] std = new Student[3];//define array object
		for(int i=0;i<std.length;i++) {
			std[i] = new Student();//declare array  object,call all of method Student()
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}//end while 
			System.out.println();
		}*/
		
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("------------------------------");
		/*for(int i=0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.println(">> "+std[i].getName()+" ("+std[i].getScore()+") ");
			}
		}*/
		for(Student STD : std) {
			System.out.println(">> "+STD.getName()+" ("+STD.findGrade()+") ");
		}
	}

}
