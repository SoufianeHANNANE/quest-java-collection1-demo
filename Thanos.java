import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>();
		
		Hero Black = new Hero("Black Widow", 34);
		Hero Captain = new Hero("Captain America", 100);
		Hero Vision = new Hero("Vision", 3);
		Hero Iron = new Hero("Iron Man", 48);
		Hero Scarlet = new Hero("Scarlet Witch", 29);
		Hero Thor = new Hero("Thor", 1500);
		Hero Hulk = new Hero("Hulk", 49);
		Hero Doctor = new Hero("Doctor Strange", 42);
		
		heroes.add(Black);
		heroes.add(Captain);
		heroes.add(Vision);
		heroes.add(Iron);
		heroes.add(Scarlet);
		heroes.add(Thor);
		heroes.add(Hulk);
		heroes.add(Doctor);
		
		Thor.setAge(1501);
		
		Collections.shuffle(heroes);
		
		List<Hero> heroes2 = heroes.subList(0, 4);
		
		for (int i = 0; i < heroes2.size();i++){
			System.out.println(heroes2.get(i).getName()); 
		}
		
    }
}
