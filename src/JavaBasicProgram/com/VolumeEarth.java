package JavaBasicProgram.com;

public class VolumeEarth {
	public static void main(String[] args) {
		int r = 6378;

		double volumeinKm = (4 / 3) * 3.14 * Math.pow(r, 3);

		double rinMiles = r * 0.621371;

		double volumeinMiles = (4 / 3) * 3.14 * Math.pow(rinMiles, 3);

		System.out.println(
				"The volume of earth in cubic kilometers is " + volumeinKm + "and cubic miles is " + volumeinMiles);

	}

}
