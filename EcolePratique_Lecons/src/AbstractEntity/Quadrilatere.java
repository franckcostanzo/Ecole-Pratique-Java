package AbstractEntity;

public class Quadrilatere extends Figure{

	//attributes
	protected double a;
	protected double b;
	protected double c;
	protected double d;
	protected double p;
	protected double q;
	
	//constructor
	public Quadrilatere(String nom, double side1, double side2, double side3, double side4, double diagonal1, double diagonal2)
	{
		super(nom);
		setSide1(side1);
		setSide1(side2);
		setSide1(side3);
		setSide1(side4);
		setDiagonal1(diagonal1);
		setDiagonal2(diagonal2);
	}
	
	public Quadrilatere(String nom)
	{
		super(nom);
	}
	
	public Quadrilatere() 
	{
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		p = 0;
		q = 0;
		
	}
	
	//setters
	public void setSide1 (double side)
	{
		this.a = side;
	}
	
	public void setSide2 (double side)
	{
		this.b = side;
	}
	
	public void setSide3 (double side)
	{
		this.c = side;
	}
	
	public void setSide4 (double side)
	{
		this.d = side;
	}
	
	public void setDiagonal1 (double side)
	{
		this.p = side;
	}
	
	public void setDiagonal2 (double side)
	{
		this.q = side;
	}
	
	//getters
	public double getSide1 ()
	{
		return a;
	}
	
	public double getSide2 ()
	{
		return b;
	}
	
	public double getSide3 ()
	{
		return c;
	}
	
	public double getSide4 ()
	{
		return d;
	}
	
	public double getDiagonal1 ()
	{
		return p;
	}
	
	public double getDiagonal2 ()
	{
		return q;
	}
	
	//methods
	public double areaCalc()
	{
		return ( 0.25 * Math.sqrt((4*Math.pow(p, 2)*Math.pow(q, 2)) - (Math.pow(b, 2)+Math.pow(d, 2)-Math.pow(a, 2)-Math.pow(c, 2))));
	}
}
