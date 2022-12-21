package wordsearch;

import java.util.PriorityQueue;

public class WordFind {
	private char[][] matrix;
	private int n;
	private PriorityQueue<Vector> vArr;
	private int row;
	private int col;
	
	public WordFind(int n) {
		this.n = n;
		this.matrix = new char[this.n][this.n];
		this.row = 0;
		this.col = 0;
		this.vArr = new PriorityQueue<>();
		
		this.vArr.add(new Vector(0,1));
		this.vArr.add(new Vector(1,1));
		this.vArr.add(new Vector(1,0));
		this.vArr.add(new Vector(1,-1));
		this.vArr.add(new Vector(0,-1));
		this.vArr.add(new Vector(-1,-1));
		this.vArr.add(new Vector(-1,0));
		this.vArr.add(new Vector(-1,1));
	}
	
	public void createMatrix(String e) {
		this.matrix[row][col] = e.charAt(1);
		this.row++;
		this.col++;
	}
	
	
	public String search(String word) {
		for(int i=0; i<this.n; i++){
			for(int j=0; j<this.n; j++){
				Vector v = this.vArr.peek();
				if(word.charAt(0)==this.matrix[i][j]){
					System.out.println("Start at ("+i+","+j+")");
					int k=0;
//					while(k<8 && v!=null) {
//						
//					}
				}
			}
		}

		
		String info = "";
		return info;
	}
}
