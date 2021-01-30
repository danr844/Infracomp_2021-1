
public class main2  implements Runnable{
	
	public void run() {
		System.out.println("Extendido la interfaz Runnable.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new main2() );
		t.start();
	}

}
