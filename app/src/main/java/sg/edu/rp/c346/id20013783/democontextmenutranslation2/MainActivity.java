package sg.edu.rp.c346.id20013783.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);


        getMenuInflater().inflate(R.menu.menu_main, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.EnglishSelection){
            tvTranslatedText.setText("Hello");
            return true;
        }else if(id == R.id.italianSelection){
            tvTranslatedText.setText("Ciao");
            return true;
        }else{
            tvTranslatedText.setText("Error Translation");
        }
        return super.onContextItemSelected(item);
    }
}