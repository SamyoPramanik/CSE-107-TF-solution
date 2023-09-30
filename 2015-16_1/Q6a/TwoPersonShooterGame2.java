package Q6a;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TwoPersonShooterGame2 {
    ObjectInputStream ois;
    ObjectOutputStream oos;
    Socket socket;

    TwoPersonShooterGame2(String s, int port) {
        try {
            socket = new Socket(s, port);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

            System.out.println("Streams created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Bullet receiveBulletFromNetwork() {
        try {
            System.out.println("Waiting for bullet");
            return (Bullet) ois.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public void updateBullet(Bullet bullet, int x, int y) throws IOException {
        bullet._posX = x;
        bullet._posY = y;

        oos.writeObject(bullet);
    }

    public static void main(String[] args) {
        try {
            TwoPersonShooterGame2 game = new TwoPersonShooterGame2("127.0.0.1", 4000);
            System.out.println("object created");

            for (int i = 0; i < 20; i++) {
                Object b = game.receiveBulletFromNetwork();
                if (b instanceof Bullet)
                    System.out.println(b);
                else
                    System.out.println("Received object is not a bullet");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
