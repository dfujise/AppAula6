package androidpro.com.br.appaula6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class AdaptersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapters);

        String[] valores = {"Coelho", "Cachorro", "Gato", "Elefante", "Leao"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, valores);
        spinner.setAdapter(spinnerAdapter);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(spinnerAdapter);
    }
}
