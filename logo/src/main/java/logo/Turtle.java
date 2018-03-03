package logo;

public class Turtle {

  private Coordinates coordinates = new Coordinates(0,0);
  private String avatar;

  public Turtle(String avatar) {
    this.avatar = avatar;
  }

  public Turtle setStrategy(MoveStrategy strategy) {

    return this;
  }

  public Turtle move() {

    return this;
  }

}
