package Interfaces;

import Abstraction.Animal;

public class Demo extends Animal implements MyInterface,MyInheritance2 {

	 public void method1() {
	        System.out.println("implementation of method1");
	    }
	    public void method2() {
	        System.out.println("implementation of method2");
	    }
	    public static void main(String arg[]) {
	    	Demo obj = new Demo();
	        obj.method1();
	        System.out.println("test");
	        
	    }
		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void method4() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void sound() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void walk() {
			// TODO Auto-generated method stub
			
		}
		
		public void test() {
			System.out.println("Demo");
		}
		
		
	    
	    
	
}
