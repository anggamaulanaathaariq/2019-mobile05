package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.Praktikum2Fragment;
import polinema.ac.id.starterchapter05.fragments.Praktikum3Fragment;
import polinema.ac.id.starterchapter05.fragments.PraktikumFragment;

public class PraktikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);
    }

    public void handleClickHandstandFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (getSupportFragmentManager().findFragmentByTag("PRAKTIKUM_FRAGMENT") != null) {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.fragmentHolder, new PraktikumFragment(), "PRAKTIKUM_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.fragmentHolder, new PraktikumFragment(), "PRAKTIKUM_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
        public void handleClickPushUpFragment(View view){
            FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
            if (getSupportFragmentManager().findFragmentByTag("PRAKTIKUM2_FRAGMENT") != null) {
            fragmentTransaction2.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
                fragmentTransaction2.replace(R.id.fragmentHolder,new Praktikum2Fragment(),"PRAKTIKUM2_FRAGMENT");
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();
            } else {
                fragmentTransaction2.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
                fragmentTransaction2.replace(R.id.fragmentHolder, new Praktikum2Fragment(), "PRAKTIKUM2_FRAGMENT");
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();
            }
        }

        public void handleClickDipsFragment(View view) {
            FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
            if (getSupportFragmentManager().findFragmentByTag("PRAKTIKUM2_FRAGMENT") != null) {
            fragmentTransaction3.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
                fragmentTransaction3.replace(R.id.fragmentHolder, new Praktikum3Fragment(), "PRAKTIKUM2_FRAGMENT");
                fragmentTransaction3.addToBackStack(null);
                fragmentTransaction3.commit();
            } else {
                fragmentTransaction3.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_left);
                fragmentTransaction3.replace(R.id.fragmentHolder, new Praktikum3Fragment(), "PRAKTIKUM2_FRAGMENT");
                fragmentTransaction3.addToBackStack(null);
                fragmentTransaction3.commit();
        }
    }

}
