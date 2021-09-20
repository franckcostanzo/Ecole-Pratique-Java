package InterfaceEntity;

public class Rectangle implements ISurfaceCalculable 
{
		//attributes :
		public double largeur;
		public double hauteur;
		

		//method :
		@Override
		public double calculSurface() 		//gives the area of the rectangle
		{				
			return largeur*hauteur;
		}
}
