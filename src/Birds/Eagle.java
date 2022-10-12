package Birds;

public class Eagle extends Birds{

  //Default
  public Eagle(){}

  public Eagle(int height, int weight, String animalType, String bloodType, boolean feathers, boolean canFly, boolean releaseElectricCharge) {
    super(height, weight, animalType, bloodType, feathers, canFly);
  }

  public void showInfo(){
    System.out.println("Height: " + this.getHeight()+"m");
    System.out.println("Weight: " + this.getWeight()+"kg");
    System.out.println("Animal Type: " + getAnimalType());
    System.out.println("Blood Type: " + getBloodType());
    System.out.println("Has feathers?: "+ (this.getFeathers() ? "Yes":"No"));
    System.out.println("Can fly?: " + (this.getCanFly() ? "Yes": "No"));
  }
}
