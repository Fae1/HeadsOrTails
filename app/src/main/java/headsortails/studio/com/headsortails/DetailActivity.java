package headsortails.studio.com.headsortails;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imagem = (ImageView) findViewById(R.id.coinId);
        backButton = (ImageView) findViewById(R.id.backButtonId);

        Bundle extra = getIntent().getExtras();
        if( extra != null ){

            String optionChoiced = extra.getString("option");

            if( optionChoiced.equals("head") ){

                imagem.setImageDrawable( ContextCompat.getDrawable(this, R.drawable.moeda_cara ) );
            }else{

                imagem.setImageDrawable( ContextCompat.getDrawable(this, R.drawable.moeda_coroa ) );
            }

        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailActivity.this, MainActivity.class));
            }
        });
    }
}