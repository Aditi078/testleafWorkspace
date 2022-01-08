package org.system;

public class Desktop extends Computer {

	private void desktopSize() {
		System.out.println("My desktop size is 15 inch.");
	}

	public static void main(String[] args) {
		Desktop system = new Desktop();
		system.desktopSize();
		system.computerModel();
	}

}
