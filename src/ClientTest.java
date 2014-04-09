import javax.swing.JFrame;


public class ClientTest {
	public static void main(String[] args) {
		Client nithi;
		nithi = new Client("172.25.115.80");
		nithi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nithi.startRunning();
	}
	
}
