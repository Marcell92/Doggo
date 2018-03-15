
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int position;
		int myPosition = 98;

		for (position = 1; position <= 100; position++) {
			if (position != myPosition)
				if (position != 11 && position != 12 && position != 13) {
					switch (position % 10) {
					case 1:
						System.out.println(position + "st");
						break;
					case 2:
						System.out.println(position + "nd");
						break;
					case 3:
						System.out.println(position + "rd");
						break;
					default:
						System.out.println(position + "th");
					}
				} else
					System.out.println(position + "th");
		}

	}

}
