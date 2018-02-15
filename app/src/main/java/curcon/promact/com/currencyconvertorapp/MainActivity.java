package curcon.promact.com.currencyconvertorapp;

import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Japanese_Yen, Indian_Rupee, Swiss_Franc, Hungarian_Forint, Russian_Ruble, Bahraini_Dinar, Malaysian_Ringgit, US_Dollar;
    double jy, ir, sf, hf, rr, bd, mr, ud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Japanese_Yen = (EditText) findViewById(R.id.i1);
        Indian_Rupee = (EditText) findViewById(R.id.i2);
        US_Dollar = (EditText) findViewById(R.id.i3);
        Malaysian_Ringgit = (EditText) findViewById(R.id.i4);
        Bahraini_Dinar = (EditText) findViewById(R.id.i5);
        Russian_Ruble = (EditText) findViewById(R.id.i6);
        Hungarian_Forint = (EditText) findViewById(R.id.i7);
        Swiss_Franc = (EditText) findViewById(R.id.i8);
    }

    public void onButtonClick(View v) {
        try {
            Toast.makeText(this, "values", Toast.LENGTH_SHORT).show();
            jy = Double.parseDouble(Japanese_Yen.getText().toString());
            ir = jy * 0.587;
            ud = jy * 0.0091;
            mr = jy * 0.0358;
            bd = jy * 0.0034;
            rr = jy * 0.5221;
            hf = jy * 2.2851;
            sf = jy * 0.0085;
            Indian_Rupee.setText(Double.toString(ir));
            US_Dollar.setText(Double.toString(ud));
            Malaysian_Ringgit.setText(Double.toString(mr));
            Bahraini_Dinar.setText(Double.toString(bd));
            Russian_Ruble.setText(Double.toString(rr));
            Hungarian_Forint.setText(Double.toString(hf));
            Swiss_Franc.setText(Double.toString(sf));
        } catch (Exception e) {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }
    //for taking input in IndianRupee
    public void onButtonClick1(View v) {
        try {
            ir = Double.parseDouble(Indian_Rupee.getText().toString());
            jy = ir * 1.6932;
            ud = ir * 0.0155;
            mr = ir * 0.0608;
            bd = ir * 0.0058;
            rr = ir * 0.8941;
            hf = ir * 3.9019;
            sf = ir * 0.0145;
            Japanese_Yen.setText(Double.toString(jy));
            US_Dollar.setText(Double.toString(ud));
            Malaysian_Ringgit.setText(Double.toString(mr));
            Bahraini_Dinar.setText(Double.toString(bd));
            Russian_Ruble.setText(Double.toString(rr));
            Hungarian_Forint.setText(Double.toString(hf));
            Swiss_Franc.setText(Double.toString(sf));
        }
        catch (Exception e) {
                Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
            }
    }
    //for taking input in US_Dollar
    public void onButtonClick2(View v) {
        try {
            ud = Double.parseDouble(US_Dollar.getText().toString());
            jy = ud * 108.9071;
            ir = ud * 64.2903;
            mr = ud * 3.9126;
            bd = ud * 0.376;
            rr = ud * 57.4481;
            hf = ud * 250.8708;
            sf = ud * 108.9071;
            Japanese_Yen.setText(Double.toString(jy));
            Indian_Rupee.setText(Double.toString(ir));
            Malaysian_Ringgit.setText(Double.toString(mr));
            Bahraini_Dinar.setText(Double.toString(bd));
            Russian_Ruble.setText(Double.toString(rr));
            Hungarian_Forint.setText(Double.toString(hf));
            Swiss_Franc.setText(Double.toString(sf));
        } catch (Exception e) {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }
    //for taking input in Malaysian_Ringgit
    public void onButtonClick3(View v) {
        try {
            mr = Double.parseDouble(Malaysian_Ringgit.getText().toString());
            jy = mr * 27.8328;
            ud = mr * 0.2555;
            ir = mr * 16.4344;
            bd = mr * 0.0961;
            rr = mr * 14.6633;
            hf = mr * 64.1226;
            sf = mr * 0.2388;
            Japanese_Yen.setText(Double.toString(jy));
            US_Dollar.setText(Double.toString(ud));
            Indian_Rupee.setText(Double.toString(ir));
            Bahraini_Dinar.setText(Double.toString(bd));
            Russian_Ruble.setText(Double.toString(rr));
            Hungarian_Forint.setText(Double.toString(hf));
            Swiss_Franc.setText(Double.toString(sf));
        } catch (Exception e) {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }
    //for taking input in Bahraini_Dinar
    public void onButtonClick4(View v) {
        try {
            bd = Double.parseDouble(Bahraini_Dinar.getText().toString());
            jy = bd * 289.5963;
            ud = bd * 2.6595;
            mr = bd * 10.4095;
            ir = bd * 170.895;
            rr = bd * 152.6186;
            hf = bd * 666.9613;
            sf = bd * 2.4839;
            Japanese_Yen.setText(Double.toString(jy));
            US_Dollar.setText(Double.toString(ud));
            Malaysian_Ringgit.setText(Double.toString(mr));
            Indian_Rupee.setText(Double.toString(ir));
            Russian_Ruble.setText(Double.toString(rr));
            Hungarian_Forint.setText(Double.toString(hf));
            Swiss_Franc.setText(Double.toString(sf));
        } catch (Exception e) {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }
    //for taking input in Russian_Ruble
    public void onButtonClick5(View v) {
        try {
            rr = Double.parseDouble(Russian_Ruble.getText().toString());
            jy = rr * 1.8977;
            ud = rr * 0.01742;
            mr = rr * 0.0682;
            bd = rr * 0.0065;
            ir = rr * 1.1197;
            hf = rr * 4.3702;
            sf = rr * 0.0163;
            Japanese_Yen.setText(Double.toString(jy));
            US_Dollar.setText(Double.toString(ud));
            Malaysian_Ringgit.setText(Double.toString(mr));
            Bahraini_Dinar.setText(Double.toString(bd));
            Indian_Rupee.setText(Double.toString(ir));
            Hungarian_Forint.setText(Double.toString(hf));
            Swiss_Franc.setText(Double.toString(sf));
        } catch (Exception e) {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }
    //for taking input in Hungarian_Forint
    public void onButtonClick6(View v) {
        try {
            hf = Double.parseDouble(Hungarian_Forint.getText().toString());
            jy = hf * 0.4344;
            ud = hf * 0.0032;
            mr = hf * 0.0156;
            bd = hf * 0.0014;
            rr = hf * 0.2288;
            ir = hf * 0.2561;
            sf = hf * 0.0037;
            Japanese_Yen.setText(Double.toString(jy));
            US_Dollar.setText(Double.toString(ud));
            Malaysian_Ringgit.setText(Double.toString(mr));
            Bahraini_Dinar.setText(Double.toString(bd));
            Russian_Ruble.setText(Double.toString(rr));
            Indian_Rupee.setText(Double.toString(ir));
            Swiss_Franc.setText(Double.toString(sf));
        } catch (Exception e) {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }
    //for taking input in Swiss_Franc
    public void onButtonClick7(View v) {
        try {
            sf = Double.parseDouble(Swiss_Franc.getText().toString());
            jy = sf * 116.6192;
            ud = sf * 1.0706;
            mr = sf * 4.1875;
            bd = sf * 0.4025;
            rr = sf * 61.2213;
            hf = sf * 267.7758;
            ir = sf * 68.7123;
            Japanese_Yen.setText(Double.toString(jy));
            US_Dollar.setText(Double.toString(ud));
            Malaysian_Ringgit.setText(Double.toString(mr));
            Bahraini_Dinar.setText(Double.toString(bd));
            Russian_Ruble.setText(Double.toString(rr));
            Hungarian_Forint.setText(Double.toString(hf));
            Indian_Rupee.setText(Double.toString(ir));
        } catch (Exception e) {
            Toast.makeText(this, "Enter the values", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.mybutton) {
            Indian_Rupee.setText(null);
            Japanese_Yen.setText(null);
            US_Dollar.setText(null);
            Malaysian_Ringgit.setText(null);
            Bahraini_Dinar.setText(null);
            Russian_Ruble.setText(null);
            Hungarian_Forint.setText(null);
            Swiss_Franc.setText(null);
        }
        return super.onOptionsItemSelected(item);
    }


}
