class Main{
	
	public static void main(String [] args){

		Team t1 = new Team("Taberne");
		t1.setRank(6);
		t1.addPlayer("Bo");
		t1.addPlayer("Børge");
		t1.addPlayer("Benny");

		Team t2 = new Team("Flaberne");
		t2.setRank(3);
		t2.addPlayer("FatMan");
		t2.addPlayer("FatWoman");
		t2.addPlayer("Lizzo");

		Team t3 = new Team("Skaberne");
		t3.setRank(2);
		t3.addPlayer("Diddy");
		t3.addPlayer("Drake");
		t3.addPlayer("Kayne");

		Team t4 = new Team("Naberne");
		t4.setRank(4);
		t4.addPlayer("Timmy Turner");
		t4.addPlayer("Timmy Changa");
		t4.addPlayer("Timmy Chungus");


		Team t5 = new Team("Aberne");
		t5.setRank(5);
		t5.addPlayer("Gabriel");
		t5.addPlayer("Theis");
		t5.addPlayer("Christopher");

		Team t6 = new Team("Snyderne");
		t6.setRank(1);
		t6.addPlayer("Gud");
		t6.addPlayer("Jesus");
		t6.addPlayer("Osama Bin Laden");

	
		

		



		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		System.out.println(t5.toString());
		System.out.println(t6.toString());

	} 
}