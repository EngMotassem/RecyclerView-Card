package com.example.mac.realmadrid;

/**
 * Created by mac on 15‏/11‏/2016.
 */

public class Players {
    private String playerName;
    private   String playerDetails;
    private int  playerImage;

    public Players(String playerDetails, String playerName,int playerImage) {
        this.playerDetails = playerDetails;
        this.playerImage = playerImage;
        this.playerName=playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerDetails() {
        return playerDetails;
    }

    public void setPlayerDetails(String playerDetails) {
        this.playerDetails = playerDetails;
    }

    public int getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(int playerImage) {
        this.playerImage = playerImage;
    }

}
