package wordsearch;

public class Vector implements Comparable<Vector> {
	private int x;
	private int y;
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int[] getVector() {
		int[] vector = new int[]{this.x, this.y};
		return vector;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	

	@Override
	public int compareTo(Vector o) {
        if (this.x-o.x != 0) {
            return this.x-o.x;
        }
        else {
            // we compare lastName if firstNames are equal
            return this.y - o.y;
        }
	}
}
