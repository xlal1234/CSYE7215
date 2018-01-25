package coffeehouse;

/**
 * We create all food objects used by the simulation in one place, here.  
 * This allows us to safely check equality via reference, rather than by 
 * structure/values.
 *
 */
public class FoodType {
	public static final Food burger = new Food("burger",600);
	public static final Food fries = new Food("fries",450);
	public static final Food coffee = new Food("coffee",150);
}
