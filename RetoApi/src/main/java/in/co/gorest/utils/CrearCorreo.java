package in.co.gorest.utils;

import java.util.Random;

public class CrearCorreo {
	
	public static String GetRandomString(int n) {

		int lowerLimit = 97;

		int upperLimit = 122;

		Random random = new Random();

		StringBuffer r = new StringBuffer(n);

		for (int i = 0; i < n; i++) {

			// random entre 97 y 122
			int nextRandomChar = lowerLimit + (int) (random.nextFloat() * (upperLimit - lowerLimit + 1));

			r.append((char) nextRandomChar);
		}

		return r.toString();
	}
}
