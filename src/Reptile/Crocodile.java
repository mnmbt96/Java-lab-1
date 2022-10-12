package Reptile;

public class Crocodile extends Reptile{

  public Crocodile(int height, int weight, String animalType, String bloodType, boolean drySkin, boolean backBone, String softShelledEggs) {
    super(height,weight,animalType,bloodType,drySkin, backBone, softShelledEggs);
  }

  public void showInfo(){
    System.out.println("Height: " + getHeight()+"m");
    System.out.println("Weight: " + getWeight()+"kg");
    System.out.println("Animal type: "+ getAnimalType());
    System.out.println("Has dry Skin?: " + (getDrySkin()?"Yes":"No"));
    System.out.println("Has backbone?: " + (getBackBone()?"Yes":"No"));
    System.out.println("Shell type: " + getSoftShelledEggs());
  }
}