package green.java.spring.exam;

public class Dogs {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void getDogsInfo() {
		System.out.println("이름"+getName());
	}
	
}
