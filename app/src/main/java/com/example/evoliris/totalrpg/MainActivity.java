package com.example.evoliris.totalrpg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.evoliris.totalrpg.Db.DAO.ScoreDAO;
import com.example.evoliris.totalrpg.models.Entity;
import com.example.evoliris.totalrpg.models.Monster;
import com.example.evoliris.totalrpg.models.Score;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnAttaque;
    private Button btnPotion;
    private ProgressBar pvMonster;
    private ProgressBar pvPlayer;
    private ImageView imageMonster;
    private TextView nbPotion;

    private ArrayList<Entity> listeEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreDAO maDb = new ScoreDAO(this);
        maDb.openWriteable();
        maDb.insert(new Score(1, "marsu", 100));
        maDb.close();

        maDb.openWriteable();
        List<Score> mesScores = maDb.findAll();
        maDb.close();

        String strPersos ="";

        Score monScore = new Score(1, "marsu", 100);
        Score monstreCourent = new Score(2, "marsu", 100);


        for (Score item : mesScores
                ) {
            strPersos +=  item;

        }

        Toast.makeText(this, strPersos, Toast.LENGTH_SHORT).show();



        //this.initializeItem();
        //this.startGame();
    }

    public void initializeItem(){
        this.btnAttaque = (Button) findViewById(R.id.button);
        this.btnPotion = (Button) findViewById(R.id.button2);

        this.listeEntity = new ArrayList<>();

        this.generateMonster();
    }

    private void generateMonster() {
        for(int i=1; i<=10;i++){
            this.listeEntity.add(new Monster(100,10,"Monster"+i));
        }
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.button: attackMonster(); break;
            case R.id.button2: takePotion(); break;
        }
    }

    private void attackMonster() {
        //listeEntity.get(1).

    }

    private void takePotion(){

    }

    public void startGame(){

    }
}
