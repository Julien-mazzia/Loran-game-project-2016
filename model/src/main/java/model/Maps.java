package model;

import model.hero.Lorann;

public class Maps {
	
	private int x;
	
	private int y;
	
	private Lorann lorann;

	public Maps(char[][] Elements) {
		
		
		for(int k=0; k<15; k++){
			for(int l=0; l<19; l++){
				
				if(Elements[k][l]=='l'){
					x=k;
					y=l;
				}
				
			}
		
	}
	lorann = new Lorann(x,y);
	}
	
	
}
