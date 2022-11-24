
 class Animals {
    
	 void eat() {
		 System.out.println(" **ANIMALS EATING STRUCTURES** ");
	 }
 }
class Lion extends Animals {
	
	void eat() {
		System.out.println("    LION EAT MEAT    ");
	}
}

class Deer extends Animals {
	void eat() {
		System.out.println("    DEER EAT GRASS    ");
	}
}

class Goat extends Animals {
	void eat() {
		System.out.println("    GOAT EAT NUTS    ");
	}
}

class Cat extends Animals {
	void eat() {
		System.out.println("    CAT EAT RAT    ");
	}
}

	class upcasting {
		public static void main(String[] args) {
			Animals A = new Animals();
			Animals L = new Lion();
			Animals D = new Deer();
			Animals G = new Goat();
			Animals C = new Cat();
			
			A.eat();
			L.eat();
			D.eat();
			G.eat();
			C.eat();
		}
	}
	
	
	
