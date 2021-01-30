import java.util.Scanner;


public class EjercicioThread extends Thread{

	private String name;
	private static int upperLimit;

	public EjercicioThread(String name) {

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
		System.out.println("Ingrese el límite de números: ");
		Scanner scannerObj = new Scanner(System.in);
		int wenas=Integer.parseInt((scannerObj.nextLine()).trim());
		upperLimit = wenas;
		EjercicioThread t0 =  new EjercicioThread("Thread"+0);
		EjercicioThread t1 = new EjercicioThread("Thread"+1);

		t0.start();
		t1.start();
	}

}
