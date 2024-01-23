package day0123;

public class WorkVO {
	private String name;
	private int javaScore;
	private int oracleScore;
	
	public WorkVO() {
		
	}
	
	public WorkVO(String name, int javaScore, int oracleScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
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
