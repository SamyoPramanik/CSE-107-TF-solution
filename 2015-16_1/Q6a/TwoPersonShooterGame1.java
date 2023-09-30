package Q6a;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TwoPersonShooterGame1 {
    ObjectInputStream ois;
    ObjectOutputStream oos;
    Socket socket;

    TwoPersonShooterGame1(Socket socket) {
        try {
            System.out.println("creating streams");
            this.socket = socket;
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Bullet receiveBulletFromNetwork() {
        try {
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
        System.out.println("Bullet sent");
    }

    public static void main(String[] args) {
        try {
            Random random = new Random();
            ServerSocket ss = new ServerSocket(4000);
            System.out.println("waiting for client");

            Socket socket = ss.accept();
            System.out.println("client connected");

            TwoPersonShooterGame1 game = new TwoPersonShooterGame1(socket);
            Bullet bullet = new Bullet(0, 0);

            int i = 0;
            while (i++ < 20) {
                game.updateBullet(bullet, random.nextInt(10, 100), random.nextInt(10, 100));
                Thread.sleep(400);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
