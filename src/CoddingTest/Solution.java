package CoddingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int[][] v) {
    	
    	
    	int firstX= v[0][0];
    	int firstY=v[0][1];
    	
    	int secX=v[1][0];
    	int secY=v[1][1];
    	
    	int thirdX = v[2][0];
    	int thirdY = v[2][1];
    	
    	int resultX = 0;
    	int resultY = 0;
    	
    	if(secX == thirdX) {
    		resultX = firstX;
    		resultY = thirdY;
    	}else {
    		
    	}
    	
    	
    	
        int[] answer = {resultX,resultY};
        System.out.println(resultX+","+resultY);
        return answer;
    }
    public static void main(String[] args) {
    	int[][] s = {{1, 4}, {3, 4}, {3, 10}};
		
    	
    	
    	
		System.out.println(solution(s));
	}
}
