package Fish;

import Animal.Animal;

public class Fish extends Animal {
  private boolean liveInWater;
  private boolean hasGills;

	//Default
	public Fish(){}

  public Fish(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills){
    super(height, weight,animalType,bloodType);
    this.liveInWater = liveInWater;
    this.hasGills = hasGills;
  }

	public boolean getLiveInWater() {
		return this.liveInWater;
	}

	public void setLiveInWater(boolean liveInWater) {
		this.liveInWater = liveInWater;
	}

	public boolean getHasGills() {
		return this.hasGills;
	}

	public void setHasGills(boolean hasGills) {
		this.hasGills = hasGills;
	}
  
}
