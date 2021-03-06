package network_simulator;

import java.util.ArrayList;

public class Switch {
    //This variable is set during the connection process, and it is taken from the NetworkDevices ArrayList
    private String ipaddress;
    private int maxConnections = 48;
    private final ArrayList<String> connectedMACs;
    
    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    //For each device who's boolean online = true, add the respective MAC to this
    //Either go through the ArrayList and check each one here, or add the MAC in the turn online methods
    //May need to make this ArrayList 2D so as to store a unique ID, if referencing a specific device is necessary
    private Switch () {
        this.connectedMACs = new ArrayList();
    }
}
