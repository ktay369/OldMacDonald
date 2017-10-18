
public void setup()
{
  Cow c = new Cow("cow", "moo");
  System.out.println(c.getType()+" goes "+c.getSound());
  Chick cc = new Chick("chick", "cluck");
  System.out.println(cc.getType()+" goes "+cc.getSound());
  Pig p = new Pig("pig", "oink");
  System.out.println(p.getType()+" goes "+p.getSound());
}