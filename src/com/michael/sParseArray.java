package com.michael;

public class sParseArray {
	public static void main(String[] args) {
		int[][] chestArray = new int[11][11];
		chestArray[1][2] = 1;
		chestArray[2][3] = 2;
		chestArray[8][4] = 1;
		System.out.println("原始的二维数组~~");
		for(int[] row : chestArray) {
			for(int data : row) {
				System.out.printf("%d\t",data);
			}
			System.out.println();
		}
		int sum = 0;
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				if(chestArray[i][j]!=0) {
					sum++;
				}
			}
		}
		
		int[][] sparseArr = new int[sum+1][3];
		sparseArr[0][0] = 11;
		sparseArr[0][1] = 11;
		sparseArr[0][2] = sum;
		int count = 0;
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				if(chestArray[i][j]!=0) {
					count++;
					sparseArr[count][0] = i;
					sparseArr[count][1] = j;
					sparseArr[count][2] = chestArray[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("稀疏数组~~");
		for(int i=0;i<sparseArr.length;i++) {
			System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
		}
		System.out.println("恢复后的二维数组~~");
		int[][] newArray = new int[sparseArr[0][0]][sparseArr[0][1]];
		for(int i=1;i<sparseArr.length;i++) {
			newArray[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2]; 
		}
		for(int i=0;i<sparseArr[0][0];i++) {
			for(int j=0;j<sparseArr[0][1];j++) {
				System.out.printf("%d\t",newArray[i][j]);
			}
			System.out.println();
		}
	}
}
