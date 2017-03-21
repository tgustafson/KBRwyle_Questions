package CollectionFrameworkEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionQuestions {
	static List<Integer> oneThurTen;
	static List<Integer> sixThurFifthteen;
	
	public static void main(String[] args){
		
		oneThurTen = new ArrayList();
		//add all values to list
		oneThurTen.add(1);
		oneThurTen.add(2);
		oneThurTen.add(3);
		oneThurTen.add(4);
		oneThurTen.add(5);
		oneThurTen.add(6);
		oneThurTen.add(7);
		oneThurTen.add(8);
		oneThurTen.add(9);
		oneThurTen.add(10);
		//Randomise the collection
		Collections.shuffle(oneThurTen);
		
		sixThurFifthteen = new ArrayList();
		//add all values to list
		sixThurFifthteen.add(6);
		sixThurFifthteen.add(7);
		sixThurFifthteen.add(8);
		sixThurFifthteen.add(9);
		sixThurFifthteen.add(10);
		sixThurFifthteen.add(11);
		sixThurFifthteen.add(12);
		sixThurFifthteen.add(13);
		sixThurFifthteen.add(14);
		sixThurFifthteen.add(15);
		//Randomise the collection
		Collections.shuffle(sixThurFifthteen);
		
		//Print out both collections
		System.out.println("1 through 10 list values after shuffle: " + oneThurTen.toString());
		System.out.println("6 through 15 list values after shuffle: " +sixThurFifthteen.toString() + "\n");
		
		//Print out the size of both collections
		System.out.println("Size of 1 through ten list: " + oneThurTen.size());
		System.out.println("Size of 6 through 15 list: " + sixThurFifthteen.size() + "\n");
		
		
		//Combine both collections into a third collection
		Set<Integer> combinedSet = (Set<Integer>) new LinkedHashSet();
		combinedSet.addAll(oneThurTen);
		combinedSet.addAll(sixThurFifthteen);
		
		//Print out the combined list that has no duplicates (Set's do not allow duclicates)
		System.out.println("Combined set of the two prior lists (no duplicates): " + combinedSet.toString() + "\n");
		
		
		//Sort the combined list in order
		List<Integer> sortedCombinedList = new ArrayList(combinedSet);
		Collections.sort(sortedCombinedList);
		System.out.println("Combined List has been sorted\n");
		
		//Remove the middle value from the set
		Double middle = Double.valueOf(sortedCombinedList.size()) / 2;
		Math.ceil(middle);
		sortedCombinedList.remove(middle);
		System.out.println("Middle value has been removed\n");
		
		//Print out the combined sorted list with the middle value remove in reverse order
		ListIterator it = sortedCombinedList.listIterator(sortedCombinedList.size());
		
		System.out.println("Below is list printed out in reverse order\n");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		//Print out the size of the collection
		System.out.println("Size of the combined list with middle value removed: " + sortedCombinedList.size() + "\n");
		
		
		//Define a collection that contains a key/value pair
		//Keys with be integers + values will be strings
		HashMap<Integer, String> mapCollection = new HashMap();
		//Add a key/value pairs to collection
		mapCollection.put(1, "ValueOne");
		System.out.println("Collection created with one key/value pair");
		
		//Add five more key/value pairs to collection
		mapCollection.put(2, "ValueTwo");
		mapCollection.put(3, "ValueThree");
		mapCollection.put(4, "ValueFour");
		mapCollection.put(5, "ValueFive");
		mapCollection.put(6, "Value1");
		System.out.println("Five more key/value pairs have been added to the collection\n");
		
		//Check if key/value is already in the list + and print if found then do not add to collection
		if(!mapCollection.containsKey(3)){
			mapCollection.put(3, "different3KeyValue");
		}
		else{
			System.out.println("Duplicate Found! -->  Key: " + 3 + mapCollection.get(3) + "\n");
		}
		
		//Print out all key/values pairs in the mapCollection HashMap
		for(Entry<Integer, String> pair: mapCollection.entrySet()){
			System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
		}
		
		//Print the size of the collection when done
		System.out.println("\nSize of Collection: " + mapCollection.size());
		
		//COMMENT THE CODE TO EXPLAIN
		/*
		 * I chose to use a HashMap because it is an object that maps keys to values.
		 * It also does not allow duplicates which was what was wanted for the assignment
		 * Also I used a basic HashMap because the order of the key/value pair did not matter if they
		 * had I would have used a LinkedHashMap.
		 */
	}
}
