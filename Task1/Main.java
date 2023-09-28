public class Main
{
	public static void main(String[] args)
	{
		Team one = new Team("Grumperne");
		Team two = new Team("Bumberne");
		Team three = new Team("Slumperne");
		Team four = new Team("Skinkerne");
		Team five = new Team("Bassarmene");
		Team six = new Team("Krudtuglerne");

		one.setRank(2);
		two.setRank(3);
		three.setRank(4);
		four.setRank(5);
		five.setRank(1);
		six.setRank(6);

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);

	}

}