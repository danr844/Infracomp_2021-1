
public class main10 implements Runnable{

	private String name;

	public main10(String name) {
		System.out.println("Implementando la interfaz Runnable");
		this.name = name;
	}

	public void run () {
		try {
			for(int i= 0; i<5; i++) {
				System.out.println(name+ " valor: "+i);
				Thread.sleep(50);
			}

		}
		catch(Exception e){}
		System.out.println("Saliendo: "+name);
	}

	public static void main(String[] args) {
		Thread t0 = new Thread (new main10("Thread"+0));
		Thread t1 = new Thread (new main10("Thread"+1));
		Thread t2 = new Thread (new main10("Thread"+2));

		t0.start();
		t1.start();
		t2.start();
	}

}
