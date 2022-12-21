package wordsearch;

import java.util.PriorityQueue;

public class WordFind {
	private char[][] matrix;
	private int n;
	private PriorityQueue<Vector> vArr;
	private int row;
	private int col;
	
	public WordFind(char[][] data, int size) {
		n = size;
		matrix = data;
		row = 0;
		col = 0;
		vArr = new PriorityQueue<>();
		
		vArr.add(new Vector(0,1));
		vArr.add(new Vector(1,1));
		vArr.add(new Vector(1,0));
		vArr.add(new Vector(1,-1));
		vArr.add(new Vector(0,-1));
		vArr.add(new Vector(-1,-1));
		vArr.add(new Vector(-1,0));
		vArr.add(new Vector(-1,1));
	}
	
	public String search(String word) {
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.println(matrix[i][j]);
				Vector v = vArr.peek();
				if(word.charAt(0)==matrix[i][j]){
					System.out.println("Start at ("+i+","+j+")");
					int k=0;
//					while(k<8 && v!=null) {
//						
//					}
				}
			}
			System.out.println("\n");
		}

		
		String info = "";
		return info;
	}
}
