 
public class BinarySearch {

	private static final int ELEMENT_NOT_FOUND = -1;

	private static String search(String[] array, String element, int first, int last) {
		//System.out.println(first);
		//System.out.println(last);
		
		
		if (first > last) {
			return element;
		}

		int mid = (first + last) / 2;
		String midElement = array[mid];
		//System.out.println("--- " +midElement);
		int compare = midElement.compareToIgnoreCase(element);
		
		
		if (midElement.equals(element)) {
			return "-----";
		} else if (compare > 0) {
			return search(array, element, first, mid - 1);
		} else {
			return search(array, element, mid + 1, last);
		}
	}

	public static String search(String[] array, String element) {
		return search(array, element, 0, array.length - 1);
	}
}
