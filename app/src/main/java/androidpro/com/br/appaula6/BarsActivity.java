package androidpro.com.br.appaula6;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class BarsActivity extends ActionBarActivity {

    private ProgressBar progressBar = null;
    private ProgressBar progressBar2 = null;
    private SeekBar seekBar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(100);

        TesteProgressTask testeProgressTask = new TesteProgressTask();
        testeProgressTask.execute();
    }

    private class TesteProgressTask extends AsyncTask<Void, Integer, Integer> {

        @Override
        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);

        }

        @Override
        protected Integer doInBackground(Void... params) {

            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100); // APENAS PARA DEMONSTRAÇÃO
                    publishProgress(i);
                } catch (InterruptedException e) {
                    return -1;
                }
            }
            return 100;
        }

        @Override
        protected void onProgressUpdate(Integer... progess) {
            Integer progress = progess[0];
            progressBar2.setProgress(progress);
            seekBar.setProgress(progress);
        }

        @Override
        protected void onPostExecute(Integer result) {
            progressBar.setVisibility(View.INVISIBLE);
        }

    }

}
