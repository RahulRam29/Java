interface Parent {
	default void print() {
		System.out.println("Parent");
	}
}

class Child implements Parent {
	public void print() {
		System.out.println("Child");
	}
}

public class InterfaceDefaultMethodOverride {
  	public static void main(String[] args) {
      Parent p = new Child();
      p.print();
	}
}
