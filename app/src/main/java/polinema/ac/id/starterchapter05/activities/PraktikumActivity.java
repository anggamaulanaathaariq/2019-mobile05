package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.PraktikumFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class PraktikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);
    }

    public void handleClickHandstandFragment(View view){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (getSupportFragmentManager().findFragmentByTag("PRAKTIKUM_FRAGMENT") != null) {
//            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.fragmentHolder,new PraktikumFragment(),"PRAKTIKUM_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.fragmentHolder, new PraktikumFragment(), "PRAKTIKUM_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }
}
