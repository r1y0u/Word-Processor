import java.util.Arrays;

public class WordProcessor {
	
	private String[] words;
	private int number;
	public static final int INITIAL_CAPACITY = 8;
	
	public WordProcessor(){
		
		words = new String[8];
	}
	
	public void add(String toAdd) {
		
		growIfNeeded();
		words[number] = toAdd;
		number++;

	}
	
	public void add(String toAdd, int index) {
		
		growIfNeeded();
		
		if(index >= 0 && index < number) {
			
			for(int i = number; i > index;i--) {
				
				words[i] = words[i-1];
			}
			
			words[index] = toAdd;
			number++;
			
		}
	}
	
	public void remove(int index) {
		
		for(int i = index;i < number;i++) {
			
			words[i] = words[i+1];
			
		}
		number--;
		
		
	}

	public void removeAdjacentDuplicates() {
		
		String last = words[0];
		
		int i = 0;
		
		while (i < number) {
			
			String current = words[i];
			if (current.equals(last)) {
				
				remove(i);
			}
			
			else {
				
				last = current;
				number++;
			}
			
		}
		
	}
	
	private void growIfNeeded()
	   {
	      
	       if(number == words.length)
	       {
	           String[] newArray = Arrays.copyOf(words,number * 2);
	           words = newArray;

	       }
	   }
	
	public String toString()
	   {
	      String brackets = "[";
	      for (int i = 0; i < number; i++)
	      {
	          if (i != 0)
	          {
	        	  brackets = brackets +", ";
	          }
	          brackets = brackets + words[i];
	      }

	      brackets = brackets + "]";
	      
	      return brackets;
	   }

}
