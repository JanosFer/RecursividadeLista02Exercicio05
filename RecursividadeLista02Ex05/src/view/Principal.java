package view;

import controller.MdcController;

public class Principal {

	public static void main(String[] args) {
		MdcController mc = new MdcController();
		
		int x = 48, y = 18;
		
		System.out.println(mc.mdc(x, y));
	}
}
