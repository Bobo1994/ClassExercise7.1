
public class Number {

	int[] number;

	public Number() {
		number = new int[10];
	}

	public Number(int[] number) {
		this.number = number;
	}

	public void setArray(int[] Array) {
		number[0] = Array[0];
		number[1] = Array[1];
		number[2] = Array[2];
		number[3] = Array[3];
		number[4] = Array[4];
		number[5] = Array[5];
		number[6] = Array[6];
		number[7] = Array[7];
		number[8] = Array[8];
		number[9] = Array[9];

	}

	public int[] returnArray() {
	

		for (int i = 0; i < number.length-1; i++) {
			for (int j = i+1; j < number.length; j++) {
				if (number[i] > number[j])
					{swap(number, i, j);

				}
			}
		}

		return this.number;
	}

	public static void swap(int[] list, int smallestIndex, int i) {
		int temp = list[smallestIndex];
		list[smallestIndex]=list[i];
		list[i]=temp;
	
	}

	public String toString() {
		String list = "";
		for (int x : this.number) {
			list+= x + " ";
		}
		return list;
	}
}

