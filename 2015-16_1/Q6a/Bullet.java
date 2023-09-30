package Q6a;

import java.io.Serializable;

public class Bullet implements Serializable, Cloneable {
    int _posX, _posY;

    public Bullet(int initialX, int initialY) {
        _posX = initialX;
        _posY = initialY;
    }

    public String toString() {
        return "<" + _posX + ", " + _posY + ">";
    }

    public Object Clone() {
        return new Bullet(_posX, _posY);
    }
}
