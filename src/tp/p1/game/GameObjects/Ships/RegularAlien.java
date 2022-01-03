package tp.p1.game.GameObjects.Ships;

import tp.p1.game.Game;

public class RegularAlien extends AlienShip {
	
	public RegularAlien(Game game, int x, int y, int life) {
		super(game, x, y, life);
	}
	
	//metodos de movimiento
	public void moverIzq() {
		col--;
	}
	public void moverDer() {
		col++;
	}
	public void moverAbajo() {
		fil++;
	}
	
	@Override
	public void computerAction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onDelete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "R[" + this.getLive() + "]";
	}
}
