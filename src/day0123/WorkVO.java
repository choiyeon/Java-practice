package day0123;

public class WorkVO {
	private String name;
	private int javaScore;
	private int oracleScore;
	private static int startNumber = 1;//static 영역에 저장해서 증가식 관리
	private int number;
	
	public WorkVO() {
		
	}
	
	public WorkVO(String name, int javaScore, int oracleScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
		this.number = startNumber++;
	}
	
	public void printData() {
		System.out.printf("%s\t%s\t%d\t%d\t%d\n", number, name, javaScore, oracleScore, javaScore+oracleScore);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
