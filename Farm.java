class Farm 
{     
  private Animal[] aBunchOfAnimals = new Animal[3];
  public Farm() {
    aBunchOfAnimals[0] = new Cow("cow", "moo");
    aBunchOfAnimals[1] = new Chick("chick", "cluck");
    aBunchOfAnimals[2] = new Pig("pig", "oink");
  }
  public void animalSounds() {
    for (int i = 0; i<aBunchOfAnimals.length; i++) {
      System.out.println(aBunchOfAnimals[i].getType()+" goes "+aBunchOfAnimals[i].getSound());
    }
  }
}