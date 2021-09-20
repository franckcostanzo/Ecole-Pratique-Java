package HeritagePolymorphismDemo;

import java.util.HashMap;
import java.util.Map;

import HeritagePolymorphismEntity.Animal;
import HeritagePolymorphismEntity.Chat;
import HeritagePolymorphismEntity.Chien;
import HeritagePolymorphismEntity.PoissonRouge;

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
		
//		Zoo barben = new Zoo();
////		Zoo barben = new Zoo(medor, nemo, loulou);
//		barben.setAnimal1(medor);
//		barben.setAnimal2(nemo);
//		barben.setAnimal3(loulou);
//		
//		barben.faireCrierTousLesAnimaux();
//		barben.faireMangerTousLesAnimaux();
//		
//		Animal lambda = new Animal();
//		lambda.setNom("LambdA");
//		barben.presenterTousLesAnimaux(lambda);
		
//		Animal [] tabAnimal = new Animal[3];
//		tabAnimal[0] = loulou;
//		tabAnimal[1] = nemo;
//		tabAnimal[2] = medor;
		
//		for (Animal animal : tabAnimal)
//		{
//			animal.crier();
//		}
//		List<Animal> parc = new ArrayList<Animal>();
//		parc.add(medor);
//		parc.add(nemo);
//		parc.add(loulou);
//		
//		for (Animal i : parc) 
//		{
//			i.presentation();
//		}
		
		Map<String, Animal> pouk = new HashMap<String, Animal>();
		pouk.put("DOG", medor);
		pouk.put("CAT", loulou);
		pouk.put("FISH", nemo);
		
		System.out.println("Values " + pouk.keySet());
	
		
	}
	
}
