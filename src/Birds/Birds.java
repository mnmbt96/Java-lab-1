package Birds;

import Animal.Animal;

public class Birds extends Animal{
  private boolean feathers;
  private boolean canFly;

  public Birds(int height, int weight, String animalType, String bloodType, boolean feathers, boolean canFly){
    super(height,weight,animalType,bloodType);
    this.feathers = feathers;
    this.canFly = canFly;
  }

	public boolean getFeathers() {
		return this.feathers;
	}

	public void setFeathers(Boolean feathers) {
		this.feathers = feathers;
	}

	public boolean getCanFly() {
		return this.canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

}
