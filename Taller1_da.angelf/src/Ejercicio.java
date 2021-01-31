import java.util.Scanner;


public class Ejercicio implements Runnable {

	private String name;
	private static int upperLimit;

	public Ejercicio(String name) {

		System.out.println("Implementando la interfaz Runnable");
		this.name = name;
	}

	public void run () {

		try {
			for(int i= 0; i<upperLimit; i++) {
				if(i%2==0 && name.equals("Thread0")) {
					System.out.println(name+ " valor: "+i);
					Thread.sleep(1000);
				}
				else if(i%2!=0&& name.equals("Thread1")) {
					System.out.println(name+ " valor: "+i);
					Thread.sleep(1000);
				}
			}

		}
		catch(Exception e){}
		System.out.println("Saliendo: "+name);
	}

	public static void main(String[] args) {
		System.out.println("Ingrese el l�mite de n�meros: ");
		Scanner scannerObj = new Scanner(System.in);
		int wenas=Integer.parseInt((scannerObj.nextLine()).trim());
		scannerObj.close();
		upperLimit = wenas;
		Thread t0 = new Thread (new Ejercicio("Thread"+0));
		Thread t1 = new Thread (new Ejercicio("Thread"+1));

		t0.start();
		t1.start();
	}

}
