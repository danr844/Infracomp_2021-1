
public class main7 extends Thread {
	
	private final static int MAX = 3;
	private String name;

	public main7(String name) {
		System.out.println("Extendiendo la clase Thread");
		this.name = name;
	}

	public void run () {
		System.out.println("El nombre es: "+name);
	}

	public static void main(String[] args) {
		main7 [] ta = new main7[MAX];
		for(int i=0; i<ta.length; i++) {
			ta[i] = new main7 ("Thread"+i);
		}
		for(int i=0; i<ta.length; i++) {
			ta[i].start();
		}
	}

}
