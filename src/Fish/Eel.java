package Fish;

public class Eel extends Fish {
  private boolean releaseElectricCharge;
  public Eel(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills,boolean releaseElectricCharge) {
    super(height, weight, animalType, bloodType, liveInWater, hasGills);
  }
  public boolean isReleaseElectricCharge() {
		return this.releaseElectricCharge;
	}
	public void setReleaseElectricCharge(boolean releaseElectricCharge) {
		this.releaseElectricCharge = releaseElectricCharge;
	}
  

  public void showInfo(){
    System.out.println("Height: " + getHeight()+"m");
    System.out.println("Weight: " + getWeight()+"kg");
    System.out.println("Animal type: "+ getAnimalType());
    System.out.println("Live in Water?: " + (getLiveInWater()?"Yes":"No"));
    System.out.println("Has gills?: "+ (getHasGills()?"Yes":"No"));
    System.out.println("Release electric charge?: " +(isReleaseElectricCharge()?"Yes":"No"));
  }

}
