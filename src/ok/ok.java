package ok;

import java.util.Scanner;
//bubblesort
public class ok {
public static void main(String[] args){
	int[] x =new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++){
		x[i]=s.nextInt();
	}
	int temp=0;
	for(int i=0;i<5;i++){
		
		for(int j=0;j<5;j++){
			
			if(x[i]<x[j]){
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
				
			}
		}
		
	}
	for(int i=0;i<5;i++){
		System.out.println(x[i]);
		
	}
}
}
