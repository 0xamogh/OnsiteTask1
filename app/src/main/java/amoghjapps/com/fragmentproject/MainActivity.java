package amoghjapps.com.fragmentproject;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener,BlankFragment2.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void passData1(String data) {
        BlankFragment2 frag2=(BlankFragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        frag2.getData2(data);
    }

    @Override
    public void passData2(String name) {
        BlankFragment frag1=(BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment1);
        frag1.getData1(name);

    }
}
