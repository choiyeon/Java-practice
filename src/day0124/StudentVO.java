package day0124;

public class StudentVO {
	private int studentNum;
	private String name;
	private int javaScore;
	private int oracleScore;
	private static int startNumber = 1;// static 영역에 저장해서 증가식 관리
	private int number;
	private double averageScore;

	public StudentVO() {

	}

	public StudentVO(int studentNum, String name, int javaScore, int oracleScore) {
		this.studentNum = studentNum;
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
		this.number = startNumber++;
		this.averageScore = (javaScore + oracleScore) / 2.0;// 실수로 연산해야 결과도 실수.
	}

	public void printData() {
		System.out.printf("%d\t%d\t%s\t%d\t%d\t%d\t%.2f\n", number, studentNum, name, javaScore, oracleScore,
				javaScore + oracleScore, (javaScore + oracleScore) / 2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public int getOracleScore() {
		return oracleScore;
	}

	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}

	@Override
	public String toString() {
		return number + "\t" + studentNum + "\t" + name + "\t" + javaScore + "\t" + oracleScore + "\t"
				+ (javaScore + oracleScore) + "\t" + String.format("%.2f", averageScore);
	}

}
