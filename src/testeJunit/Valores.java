package testeJunit;

public class Valores implements ValoresITF{
		
	int[] array = new int[9];
	int indice = 0;
				
	
	@Override
	public Boolean ins(int v) {
		
		if(v > 0) {
			if(indice < array.length){
				array[indice] = (int)(v);
				indice++;
			}
		}
				
		return null;
		
	}

	@Override
	public int del(int i) {
		
		int valorRemovido = array[i];
		
		array[i] = 0;
				
		return valorRemovido;
	}

	@Override
	public int size() {
		int tamanho = 0;
		
		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
			if(array[i] != 0 ) {
				tamanho = tamanho+1;
			}
		}
		
		return tamanho;
		

	}

	@Override
	public double mean() {

			int divisor = 0;
			int dividendo = 0;
			
			for(int indice = 0; indice < 9; indice++) {
				if (array[indice] > 0) {
					dividendo += array[indice];
					divisor++;
				}
			}		
			return (dividendo/divisor);
	}

	@Override
	public int greater() {
		 
		int maior=array[0];
		for (int i=0; i<array.length;i++)
			if (maior<array[i])
				maior=array[i];
			return maior;
		
		
	}

	@Override
	public int lower() {
		int menor=array[0];
		for (int i=0; i<array.length;i++)
			if (menor>array[i])
				menor=array[i];
			return menor;
	}
	
}
