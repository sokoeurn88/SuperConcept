
public class LearningSuper {
	
	int maxSpeed = 120;
	
	public void vroom() {
		
		System.out.println("vroom");
		
	}
	
	LearningSuper(){
		System.out.println("learningsuper constructor");
	}

}



class LearningSuper01 extends LearningSuper{
	
	int maxSpeed = 100;
	
	public void display() {
		System.out.println(super.maxSpeed);
	}
	
	
	public void vroom() {
		
		System.out.println("outsite room");
		super.vroom();
	}
	
	
	LearningSuper01(){
		super();
		System.out.println("we are inside constructor");
		
	}
	
}
