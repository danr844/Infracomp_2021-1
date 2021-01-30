
public class main6 implements Runnable{
	private String name;

	public main6(String name) {
		System.out.println("Extendiendo la Interfaz Runnable");
		this.name = name;
	}

	public void run () {
		System.out.println("El nombre es: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t0 = new Thread(new main5("Thread"+0));
		Thread t1 = new Thread(new main5("Thread"+1));
		Thread t2 = new Thread(new main5("Thread"+2));

		t0.start();
		t1.start();
		t2.start();
	}

}
