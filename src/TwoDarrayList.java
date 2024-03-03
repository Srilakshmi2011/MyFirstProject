import java.util.ArrayList;

public class TwoDarrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<String> > groceryList= new ArrayList<ArrayList<String>>();
   //2D Array list
		ArrayList <String> produceList= new ArrayList();
		produceList.add("Tomatoes");
		produceList.add("Mushroom");
		produceList.add("Celery");
		
		ArrayList <String> drinksList= new ArrayList();
		drinksList.add("");
		drinksList.add("Mushroom");
		drinksList.add("Celery");
		
		
		ArrayList <String> MeatList= new ArrayList <String>();
		 MeatList.add("Chicken");
		 MeatList.add("Duck");
		 MeatList.add("Lamb");
		 
		 groceryList.add(produceList);
		 groceryList.add(drinksList);
		 groceryList.add(MeatList);
		 System.out.println(groceryList);
		 //to get first list
		 System.out.println(groceryList.get(0));
		 //to get first list of first eleement
		 System.out.println(groceryList.get(0).get(0));
		 
		 
		
		
	}

}
