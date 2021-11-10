
public class Ex10 {
	String company;
	String model;
	String color;
	int maxSpeed;

	public Ex10(String company,	String model, int maxSpeed) {
	// 생성자에서 다른 생성자 실행
		this(company,model);
//		this.company = company;
//		this.model = model;
		this.color = color;	
	}

	//this() 메서드를 사용하는 생성자는 아래에 만들어주는 것이 좋다
	public Ex10(String company,	String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;	
	}

	
	public Ex10(String company,	String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	//	this.maxSpeed = color;		
	}
	
	public Ex10(String company, String model) {
		this.company = company;
		this.model = model;	
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}	
}