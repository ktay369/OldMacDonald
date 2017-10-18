class Chick implements Animal 
{     
  private String myType;
    private String mySound;
    private String mySound1;
  public Chick(String type, String sound) {
    myType = type;
    mySound = sound;
    mySound1 = sound;
  }
   public Chick() {
    myType = "chick";
    mySound = "cluck";
    mySound1 = "cheep";
   }
  public String getSound() {
    if(Math.random()<0.5){
    return mySound;
    }
    else
    return mySound1;
  }
  public String getType() {
    return myType;
  }
}