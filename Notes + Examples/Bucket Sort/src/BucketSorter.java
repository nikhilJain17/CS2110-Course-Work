// Bucket Sort example
public class BucketSorter {

	// 1. Find min
	// 2. Find max
	// 3. Make array of size min - max
	// 4. Scan through sequence
	// 5. Increment the bucket for that number in the sequence
	// 6. Repeat
	
	
	
	private int min, max;
	private int[] sequence; // to be sorted
	
	// getters and setters
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int[] getSequence() {
		return sequence;
	}
	public void setSequence(int[] sequence) {
		this.sequence = sequence;
	}
	
	
	// constructor
	public BucketSorter(int[] sequence) {
		this.sequence = sequence;
		findMin();
		findMax();
		
		// test
		System.out.println("Min: " + min + "\nMax: " + max);
		
	}
	
	
	// find min of sequence
	private void findMin() {
		
		int localMin = 666666; // yolo
		
		for (int i = 0; i < sequence.length; i++) {
		
			if (sequence[i] < localMin)
				localMin = sequence[i];
		
		}
		
		min = localMin;
		
		
	} // end of findMin()
	
	
	
	// find max of sequence
	public void findMax() {
		
		int localMax = -666666; 
		
		for (int i = 0; i < sequence.length; i++) {
			
			if (sequence[i] > localMax)
				localMax = sequence[i];
			
		}
		
		max = localMax;
		
	} // end of findMax
	
	
	
	// main
	public static void main(String[] args) {
		
		// TEST
		int[] testValues = new int[10];
		
		for (int i = 0; i < testValues.length; i++) {
			testValues[i] = i - 3;
			System.out.println(testValues[i]);
		}
		
		BucketSorter sorter = new BucketSorter(testValues);
		// END TEST
		
		
	}
	
	
	
}