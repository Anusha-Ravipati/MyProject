package assignment1;
public class NotRepeat {
	 public static Character firstNonRepeating(String str) {
	        int[] count = new int[256];
	        for (char c : str.toCharArray()) {
	            count[c]++;
	        }
	        for (char c : str.toCharArray()) {
	            if (count[c] == 1) return c;
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        String input = "ANUSHA";
	        System.out.println(firstNonRepeating(input)); 
	    }
	

}
