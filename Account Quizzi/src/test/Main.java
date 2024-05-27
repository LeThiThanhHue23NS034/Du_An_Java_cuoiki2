package test;

import javax.swing.UIManager;

import view.index;
import view.loading;

public class Main {
		public static void main(String[] args) {

			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				loading frame = new loading();
				frame.setVisible(true);
				try {
					for (int x = 0; x <= 100; x++) {
						frame.Loading.setValue(x);
						Thread.sleep(50);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				new index().setVisible(true);
				frame.dispose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


}
