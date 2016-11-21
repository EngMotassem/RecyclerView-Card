package com.example.mac.realmadrid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mac on 15‏/11‏/2016.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private ImageView playeImage;
    private TextView playerName;
    private  TextView playerDetails;
    ItemClickListner itemClickListner;

    public MyHolder(View itemView) {
        super(itemView);
        playeImage= (ImageView) itemView.findViewById(R.id.playerImage);
        playerName= (TextView) itemView.findViewById(R.id.playerName);
        playerDetails= (TextView) itemView.findViewById(R.id.playerDetails);
        itemView.setOnClickListener(this);


    }

    public ImageView getPlayeImage() {
        return playeImage;
    }

    public void setPlayeImage(ImageView playeImage) {
        this.playeImage = playeImage;
    }

    public TextView getPlayerDetails() {
        return playerDetails;
    }

    public void setPlayerDetails(TextView playerDetails) {
        this.playerDetails = playerDetails;
    }

    public TextView getPlayerName() {
        return playerName;
    }

    public void setPlayerName(TextView playerName) {
        this.playerName = playerName;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListner.onItemClick(v,getLayoutPosition());

    }
    public void setItemClickListner(ItemClickListner ic){

        this.itemClickListner=ic;
    }

    /**
     * Created by mac on 16‏/11‏/2016.
     */

    public static interface ItemClickListner {
        public void onItemClick(View v, int pos);
    }
}
