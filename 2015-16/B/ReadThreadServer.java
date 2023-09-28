

import util.SocketWrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadThreadServer implements Runnable {
    private Thread thr;
    private SocketWrapper socketWrapper;
    public HashMap<String, SocketWrapper> clientMap;
    public HashMap<String,ArrayList<Group>>groups;

    public ReadThreadServer(HashMap<String, SocketWrapper> map, SocketWrapper socketWrapper, HashMap<String,ArrayList<Group>>g) {
        this.clientMap = map;
        this.socketWrapper = socketWrapper;
        this.groups = g;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            while (true) {
                Object o = socketWrapper.read();
                if (o instanceof Message) {
                    Message obj = (Message) o;
                    if (!obj.getFlag()){
                    String to = obj.getTo();
                    SocketWrapper nu = clientMap.get(to);
                    if (nu != null) {
                        nu.write(obj);
                    }
                }
                else{
                    ArrayList<Group> wow = groups.get(obj.getFrom());
                    for (Group temp : wow){
                        System.out.println(obj.getGroupName());
                        if (temp.getName().contains(obj.getGroupName())){
                            for (String temp2 : temp.getFriends()){    
                                if (temp2.equals(obj.getFrom())){
                                    continue;
                                }       
                            SocketWrapper nu = clientMap.get(temp2);
                             if (nu != null) {
                                    nu.write(obj);
                            }
                            }
                            break;
                        }
                    }
                }
                }
                else if (o instanceof Group){
                    Group temp = (Group) o;
                    ArrayList<Group>wow;
                    for (String temp2 : temp.getFriends()){
                        wow = groups.get(temp2);
                        wow.add(temp);
                        groups.put(temp2,wow);
                    }
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
