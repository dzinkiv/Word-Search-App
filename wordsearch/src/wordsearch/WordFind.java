package wordsearch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class WordFind {
	private char[][] matrix;
	private int n;
	private ArrayList<Vector> vArr;
	private int row;
	private int col;
	
	public WordFind(char[][] data, int size) {
		n = size;
		matrix = data;
		row = 0;
		col = 0;
		vArr = new ArrayList<>();
		
		vArr.add(new Vector(0,1));  //right
		vArr.add(new Vector(1,1));  //down-right
		vArr.add(new Vector(1,0));  //down
		vArr.add(new Vector(1,-1)); //down-left
		vArr.add(new Vector(0,-1)); //left
		vArr.add(new Vector(-1,-1));//up-left
		vArr.add(new Vector(-1,0)); //up
		vArr.add(new Vector(-1,1)); //up-right
	}
	
	public int[] search(String word) {
		int[] locations = new int[word.length()];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(word.charAt(0)==matrix[i][j]){
					locations[0] = (i*n) + j;
					int check = 1;
					int x,y;
					Iterator<Vector> vectors = vArr.iterator();
			        while(vectors.hasNext() && check<word.length()) {
						int vec_i = i;
						int vec_j = j;
			        	check = 1;
			        	Vector v = vectors.next();
						x = v.getX();
						y = v.getY();
						for(int k=1; k<word.length(); k++) {
							vec_i+=x;
							vec_j+=y;
							if(vec_i<n && vec_i>=0 && vec_j<n && vec_j>=0 && word.charAt(k)==matrix[vec_i][vec_j]) {
								check++;
								locations[k] = (vec_i*n) + vec_j;
							}
							else k=word.length();
						}
						if(check==word.length()) return locations;
					}
				}
			}
		}
		return null;
	}
}
