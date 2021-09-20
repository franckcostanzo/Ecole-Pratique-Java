package StaticDemo;

import StaticEntity.*;

public class Execution {

	public static void main(String[] args)
	{
		Chat loulou = new Chat();
		loulou.setNom("Loulou");
		loulou.setCouleurCollier("Rouge");
		
		PoissonRouge nemo = new PoissonRouge();
		nemo.setNom("Nemo");
		nemo.setSurfaceBocal(32);
		
		Chien medor = new Chien();
		medor.setNom("Médor");
		medor.setCouleurBalle("Rouge");
		
//		medor.manger();
//		medor.crier();
//		medor.rapporterBalle();
		
		Zoo barben = new Zoo();
//		Zoo barben = new Zoo(medor, nemo, loulou);
		barben.setAnimal1(medor);
		barben.setAnimal2(nemo);
		barben.setAnimal3(loulou);
		
		barben.faireCrierTousLesAnimaux();
		barben.faireMangerTousLesAnimaux();
		
		Animal lambda = new Animal();
		lambda.setNom("LambdA");
		barben.presenterTousLesAnimaux(lambda);
		
//		Animal [] tabAnimal = new Animal[3];
//		tabAnimal[0] = loulou;
//		tabAnimal[1] = nemo;
//		tabAnimal[2] = medor;
		
//		for (Animal animal : tabAnimal)
//		{
//			animal.crier();
//		}
		
	}
	
}
