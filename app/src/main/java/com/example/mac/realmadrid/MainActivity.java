package com.example.mac.realmadrid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  SearchView.OnQueryTextListener{
private RecyclerView recyclerView;
    //private Players ;
   private MyAdapter adapter;
    ArrayList<Players> players=new ArrayList<Players>() ;

      Players player1,player2,player3,player4;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       /* player1=new Players("Goal keeper","Navas",R.drawable.k);
        player2=new Players("attak","ball",R.drawable.b);

        player3=new Players("attak","BenZema",R.drawable.bz);
        player4=new Players("mididdidiuidioudiududdid","ball",R.drawable.a);


        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

*/
        recyclerView=(RecyclerView) findViewById(R.id.recycleView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter=new MyAdapter(this,getPlayers());
        recyclerView.setAdapter(adapter);

       //Menu menu= findViewById(R.menu.menu_main);



       //


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem=menu.findItem(R.id.app_bar_search);

       searchView=(SearchView)MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.app_bar_search) {
           // searchView.setOnQueryTextListener(new Se);

           // Toast.makeText(getApplicationContext(),"search",Toast.LENGTH_LONG).show();


            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String query) {
       // Toast.makeText(getApplicationContext(),"Text changed",Toast.LENGTH_LONG).show();
        adapter.getFilter().filter(query);
       
        return false;
    }

    /*@Override
    public boolean onQueryTextSubmit(String query) {
        adapter.getFilter().filter(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.getFilter().filter(newText);

        return true;
    }*/
    //ADD PLAYERS TO ARRAYLIST
    private ArrayList<Players> getPlayers()
    {
        ArrayList<Players> players=new ArrayList<>();
        player1=new Players("Goal keeper","Navas",R.drawable.k);
        player2=new Players("attak","ball",R.drawable.b);

        player3=new Players("attak","BenZema",R.drawable.bz);
        player4=new Players("mididdidiuidioudiududdid","ball",R.drawable.a);


        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);


        return players;
    }
}
