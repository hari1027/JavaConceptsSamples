package Interface;

interface Collage
{
	String collage = "Sastra collage student named Hari";
	
}
interface Branch
{
	String branch = "who is in civil branch";
}
interface Exam
{
	String exam = "final sem";
}
interface Maths
{
	int maths = 80;
}
interface Science
{
	int science = 70;
}
interface English
{
	int english = 60;
}
class Avg implements Collage,Branch,Exam,Maths,Science,English
{
	public void avg()
	{
		String clg = Collage.collage;
		System.out.println(clg);
		String branch = Branch.branch;
		System.out.println(branch);
		String exm = Exam.exam;
		int avg = ((Maths.maths + Science.science + English.english)/3 );
		System.out.println("has scored an avg mark of :" + avg + " in the final sem ");
	}
}
public class MultipleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Avg obj = new Avg() ;
		obj.avg();

	}

}
