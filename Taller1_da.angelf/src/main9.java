
public class main9 extends Thread{

	private String name;

	public main9(String name) {
		System.out.println("Extendiendo la clase Thread");
		this.name = name;
	}

	public void run () {
		try {
			for(int i= 0; i<5; i++) {
				System.out.println("El nombre es: "+name);
				Thread.sleep(50);
			}

		}
		catch(Exception e){}
		System.out.println("Saliendo: "+name);
	}

	public static void main(String[] args) {
		main9 t0 = new main9 ("Thread"+0);
		main9 t1 = new main9 ("Thread"+1);
		main9 t2 = new main9 ("Thread"+2);

		t0.start();
		t1.start();
		t2.start();
	}

}
