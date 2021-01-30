
public class main3 extends Thread{
	
	private int n;
	
	public main3(int n) {
		System.out.println("Extendiendo la clase Thread");
		this.n = n;
	}
	
	public void run () {
		System.out.println("El valor inicial es: "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main3 t = new main3(5);
		t.start();
	}

}
