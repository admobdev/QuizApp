package pl.ozodbek.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("ALL")

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Kirish oynasi
    public void startGame(View view) {
        Intent intent = new Intent(MainActivity.this, StartGame.class);  // Savollar oynasiga o'tish.
        startActivity(intent);  // Savollar oynasiga o'tishni boshlash
        finish();  // shu oynani yopib, Savollar oynasiga o'tish.
    }
}