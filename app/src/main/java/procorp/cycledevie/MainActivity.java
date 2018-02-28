package procorp.cycledevie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button monBouton;
    private final String EXTRA_TEXT = "text_to_display";
    public Livre monLivre = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null) {

            if ("".equals(savedInstanceState.getString("titre"))) {
                savedInstanceState.putString("titre", "les miserables");
                savedInstanceState.putString("Auteur", "Victor Hugo");
                savedInstanceState.putInt("nbrePages", 354);
            } else {
                monLivre = new Livre(savedInstanceState.getString("titre"), savedInstanceState.getString("Auteur"), savedInstanceState.getInt("nbrePages"));
                Toast.makeText(this, monLivre.toString(), Toast.LENGTH_SHORT).show();
                savedInstanceState.putString("titre", "Autre monde");
                savedInstanceState.putString("Auteur", "Maxime Chattam");
                savedInstanceState.putInt("nbrePages", 512);
            }
        }



        Toast.makeText(this, "onCreate1", Toast.LENGTH_SHORT).show();

        monBouton = findViewById(R.id.monBouton);
        monBouton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondeActivity.class);
                intent.putExtra(EXTRA_TEXT, "yo");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart1", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume1", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Toast.makeText(this, "onFreeze1", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "onRestore1", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause1", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop1", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart1", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy1", Toast.LENGTH_SHORT).show();

    }


}
