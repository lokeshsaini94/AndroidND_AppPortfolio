package lokeshsaini.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.app1:
                    showToast(getString(R.string.popular_movies));
                    break;
                case R.id.app2:
                    showToast(getString(R.string.stock_hawk));
                    break;
                case R.id.app3:
                    showToast(getString(R.string.build_it_bigger));
                    break;
                case R.id.app4:
                    showToast(getString(R.string.make_your_app_material));
                    break;
                case R.id.app5:
                    showToast(getString(R.string.go_ubiquitous));
                    break;
                case R.id.app6:
                    showToast(getString(R.string.capstone));
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button app1 = (Button) findViewById(R.id.app1);
        Button app2 = (Button) findViewById(R.id.app2);
        Button app3 = (Button) findViewById(R.id.app3);
        Button app4 = (Button) findViewById(R.id.app4);
        Button app5 = (Button) findViewById(R.id.app5);
        Button app6 = (Button) findViewById(R.id.app6);

        app1.setOnClickListener(onClickListener);
        app2.setOnClickListener(onClickListener);
        app3.setOnClickListener(onClickListener);
        app4.setOnClickListener(onClickListener);
        app5.setOnClickListener(onClickListener);
        app6.setOnClickListener(onClickListener);
    }

    private void showToast(String appName) {
        String text = "The Button will launch my " + appName + " app!";
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
