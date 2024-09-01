package br.edu.fatec.quizdetransito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Placa4 extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btnProximaPergunta;
    private static final int botao_correto = R.id.btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_placa4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btnProximaPergunta = findViewById(R.id.btnProximaPergunta);

        setButtonClickListener(btn1);
        setButtonClickListener(btn2);
        setButtonClickListener(btn3);
        setButtonClickListener(btn4);
    }
    private void setButtonClickListener(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == botao_correto) {
                    // Resposta correta
                    view.setBackgroundColor(getResources().getColor(R.color.cor_verde));
                    Toast.makeText(Placa4.this, "Resposta Correta!", Toast.LENGTH_SHORT).show();
                } else {
                    // Resposta incorreta
                    view.setBackgroundColor(getResources().getColor(R.color.cor_vermelho));
                    Toast.makeText(Placa4.this, "Resposta Incorreta. Tente novamente.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void proxima (View view){
        //Declarando uma variável do tipo Intent
        Intent it = new Intent(this, Placa5.class);
        //Iniciando a Tela desejada
        startActivity(it);
    }
}