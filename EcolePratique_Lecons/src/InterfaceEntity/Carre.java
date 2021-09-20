package InterfaceEntity;

public class Carre implements ISurfaceCalculable, IPerimetreCalculable
{
	public double cote;
	
	@Override
	public double calculSurface()
	{
		return Math.pow(cote, 2);
	}
	
	@Override
	public double calculPerimetre()
	{
		return cote*4;
	}
}
