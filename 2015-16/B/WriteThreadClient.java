

import util.SocketWrapper;

import java.io.IOException;
import java.util.Scanner;

public class WriteThreadClient implements Runnable {

    private Thread thr;
    private SocketWrapper socketWrapper;
    String name;

    public WriteThreadClient(SocketWrapper socketWrapper, String name) {
        this.socketWrapper = socketWrapper;
        this.name = name;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                String from = name;
                System.out.println("Choose what you want to do: ");
                System.out.println("1. Send a message to only one client");
                System.out.println("2. Send a message to your group");
                System.out.println("3. Create your group");
                int choice;
                choice = input.nextInt();
                input.nextLine();
                switch(choice){
                    case 1:
                            System.out.print("Enter name of the client to send: ");
                            String to = input.nextLine();
                            System.out.print("Enter the message: ");
                            String text = input.nextLine();
                            Message message = new Message();
                            message.setFrom(from);
                            message.setTo(to);
                            message.setText(text);
                            socketWrapper.write(message);
                            break;
                    case 2: System.out.println("Enter the name of your group:");
                            String groupName = input.nextLine();
                            System.out.print("Enter the message: ");
                            text = input.nextLine();
                            message = new Message();
                            message.setGroupName(groupName);
                            message.setFlag(true);
                            message.setFrom(from);
                            message.setText(text);
                            socketWrapper.write(message);
                            break;
                    case 3:
                            System.out.println("Enter group name: ");
                            groupName = input.nextLine();
                            Group group = new Group();
                            group.setName(groupName);
                            int number = 6;
                           do{
                            System.out.println("Enter the number of friends you want to add: ");
                            number = input.nextInt();
                            input.nextLine();
                            }while(number<=0 && number>5);
            
                            for (int i =0; i<number;i++){
                                System.out.println("Enter the name of the friend: ");
                                group.getFriends().add(input.nextLine());
                            }
                            group.getFriends().add(name);
                            socketWrapper.write(group);
                            break;

                }
                
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                socketWrapper.closeConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
