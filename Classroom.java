public class Classroom {

	public static void main(String[] args) {
		Wilder casey = new Wilder("Casey", true);
		Wilder damien = new Wilder("Damien", true);
		Wilder carl = new Wilder("Carl", false);

		System.out.println(casey.whoAmI());
		System.out.println(damien.whoAmI());
		System.out.println(carl.whoAmI());
	}
}