package MinecraftMobs;

public class Creeper extends AggressiveMob{

	public Creeper(int h, int mS, int d, int dR, double aS){
		// Since all data members are made by the parent
		// super needs to be used here to invoke that constructor
		super(h, mS, d, dR, aS);
	}

	// This is to show the specific implementation
	// of sound() and attack() for the Creeper class
	@__
	public void __(){
		System.out.println("Hisssssssssssss!");
	}

	@__
	protected int __(){
		return (int)(super.attack()*100);
	}

}
