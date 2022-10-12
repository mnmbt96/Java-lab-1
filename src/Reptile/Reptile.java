package Reptile;
import Animal.Animal;

public class Reptile extends Animal{
    private boolean drySkin;
    private boolean backBone;
    private String softShelledEggs;

		//Dafault
		public Reptile(){}

    public Reptile(int height, int weight, String animalType, String bloodType, boolean drySkin, boolean backBone, String softShelledEggs){
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.backBone = backBone;
        this.softShelledEggs = softShelledEggs;
    }

	public boolean getDrySkin() {
		return this.drySkin;
	}

	public void setDrySkin(boolean drySkin) {
		this.drySkin = drySkin;
	}

	public boolean getBackBone() {
		return this.backBone;
	}

	public void setBackBone(boolean backBone) {
		this.backBone = backBone;
	}

	public String getSoftShelledEggs() {
		return this.softShelledEggs;
	}

	public void setSoftShelledEggs(String softShelledEggs) {
		this.softShelledEggs = softShelledEggs;
	
    }
}

