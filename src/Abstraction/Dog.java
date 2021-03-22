package Abstraction;
public class Dog extends Animal{

	int temp = 1;
	public static void main(String[] args) {
		 Dog timmy = new Dog();
	        timmy.sound();
	        

	}
	
	public void test() {
		System.out.println("Dog");
		System.out.println(this.temp);
		super.test();
		System.out.println(super.temp1);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	


	


}
