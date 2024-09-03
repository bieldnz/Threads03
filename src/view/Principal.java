package view;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		for(int x = 0; x < 1000; x++) {
			vetor[x] = (int)(Math.random()*101);
		}
		
		ThreadVetor t1 = new ThreadVetor(1, vetor);
		t1.start();
		
		ThreadVetor t2 = new ThreadVetor(2, vetor);
		t2.start();
	}
}
