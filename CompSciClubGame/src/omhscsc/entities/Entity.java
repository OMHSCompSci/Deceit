package omhscsc.entities;

import omhscsc.GameObject;
import omhscsc.state.GameStateState;
import omhscsc.util.Hitbox;
import omhscsc.util.Location;
import omhscsc.world.World;

public abstract class Entity extends GameObject {

	protected Hitbox hitbox;
	
	public Entity(Hitbox h)
	{
		this.hitbox = h;
	}
	
	public Entity(World wr, int x, int y, int w, int h)
	{
		Location l = new Location(x,y,wr);
		hitbox = new Hitbox(w,h,l);
	}
	
	@Override
	public void tick(GameStateState s)
	{
		//Default tick
		//May be used later, so leave empty
	}
	
	public Hitbox getHitbox()
	{
		return this.hitbox;
	}
	
	public Location getLocation()
	{
		return this.hitbox.getLocation();
	}
	
}