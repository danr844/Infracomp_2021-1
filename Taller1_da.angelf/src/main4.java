
public class main4 implements Runnable{
	
	private int n;
	
	public main4(int n) {
		System.out.println("Extendiendo la interfaz Runnable");
		this.n = n;
	}
	
	public void run () {
		System.out.println("El valor inicial es: "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new main4(5));
		t.start();
	}

}
