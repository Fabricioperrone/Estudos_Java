package cursoemvideo;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoulucaoDeTela {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();;
		System.out.println("A resolu��o do seu sistema �: \n"  + d.width +  " X " + d.height);
	}

}
