package controller;

public class ThreadVetor extends Thread {
	
	int n;
	int[] vetor;
	
	public ThreadVetor(int n, int[] vetor) {
		this.n = n;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		long finalTempo;
		long inicioTempo;
		if(n%2 == 1) {
			inicioTempo = System.nanoTime();
			for(int item : vetor) {
				System.out.print(item+" ");
			}
			finalTempo = System.nanoTime();
			System.out.println("\n" + (finalTempo - inicioTempo) + "\n");
		}if(n%2 == 0) {
			inicioTempo = System.nanoTime();
			for(int x = 0; x < vetor.length; x++) {
				System.out.print(vetor[x]+" ");
			}
			finalTempo = System.nanoTime();
			System.out.println("\n" + (finalTempo - inicioTempo) + "\n");
		}
		
	}
	
}
