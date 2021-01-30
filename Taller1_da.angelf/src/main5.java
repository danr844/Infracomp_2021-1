
public class main5 extends Thread{

	private String name;

	public main5(String name) {
		System.out.println("Extendiendo la clase Thread");
		this.name = name;
	}

	public void run () {
		System.out.println("El nombre es: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main5 t0 = new main5("Thread"+0);
		main5 t1 = new main5("Thread"+1);
		main5 t2 = new main5("Thread"+2);

		t0.start();
		t1.start();
		t2.start();
	}

}
