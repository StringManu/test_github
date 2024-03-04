package array;

public class Umsatzsteigerung {
	
	
	static int[] dailyGains = {1000,2000,500,9000,9010};
	
	static int count5percent(int[] gains) {
		int i = 0;
		int anzahl = 0;
		if(!(gains[i]==0)) {
			for(int a=0; a<gains.length-1; a++) {
			if(gains[a]*1.05 <= gains[a+1]){
				anzahl++;
				i++;
			 }
			}
		}
		return anzahl;
	}
	
	static String[] tmp2 = {"hallo","hallo","hallo","hallo"};
	
	static int[][] magnify(int[][] array, int factor){
		int z=0;int s=0;int zaehlen=0;int befuellen=1;
		for(int i=1;i<array.length;i++) {
			z++;
			for(int a=0;a<array[0].length;a++) {
				s++;
			}
		}z*=factor;s*=factor;
		int[][] tmp =new int [z][s];
		for(int i=0;i<tmp.length;i++) {
			for(int a=0;a<tmp[0].length;a++) {
				if(zaehlen<factor+1) {
					tmp[i][a]=befuellen;
					zaehlen++;
				}
				if(zaehlen==factor) {
					zaehlen=0;
				}
			}
		}
		return tmp;
	}
	
	public static void printOutArray(int [] [] array) {
		int z=0;int s=0;
		for(z =0;z<array.length;z++) {
			System.out.println(array[z][s]);
			for(s=0;s<array[0].length;s++) {
				System.out.print(array[z][s] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int [][] idk= {{1,2},{4,5}};
		printOutArray(magnify(idk,3));
	}
	
}
