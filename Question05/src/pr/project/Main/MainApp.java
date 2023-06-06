package pr.project.Main;

import pr.project.AbstractDemo.Dog;
import pr.project.InterfaceDemo.AnimalImpl;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog=new Dog();
		
		dog.makeSound();
		dog.move();
		
		AnimalImpl animal=new AnimalImpl(); 
		animal.makeSound();
		animal.move();

	}

}
