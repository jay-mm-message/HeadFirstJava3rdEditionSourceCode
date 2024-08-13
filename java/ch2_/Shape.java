package ch2_;

abstract public class Shape {
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    abstract public void rotate();
    abstract public void playSound();
}
