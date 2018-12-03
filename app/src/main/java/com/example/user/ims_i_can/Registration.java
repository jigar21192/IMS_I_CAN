package com.example.user.ims_i_can;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Registration extends AppCompatActivity {
    Button Btn;
    EditText Fname, Lname, EnrNo, Bdate, Email, Mobno, Pmobno, Address;
    Spinner State, City, Area;
    RadioButton Rmale, Rfemale;
    RadioGroup Rgroup;
    DatePickerDialog.OnDateSetListener date;
    Calendar myCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Btn = (Button) findViewById(R.id.Btn);
        Fname = (EditText) findViewById(R.id.Fname);
        Lname = (EditText) findViewById(R.id.Lname);
        EnrNo = (EditText) findViewById(R.id.EnrNo);
        Bdate = (EditText) findViewById(R.id.Bdate);
        Mobno = (EditText) findViewById(R.id.Mobno);
        Pmobno = (EditText) findViewById(R.id.Pmobno);
        Address = (EditText) findViewById(R.id.Address);
        Email = (EditText) findViewById(R.id.Email);

        Bdate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(Registration.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        datepick();

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fname1=Fname.getText().toString();
                String lname1=Lname.getText().toString();
                String enrno1=EnrNo.getText().toString();
                String mobno1=Mobno.getText().toString();
                String pmobno1=Pmobno.getText().toString();
                String address1=Address.getText().toString();
                String email1=Email.getText().toString();


               Intent intent = new Intent(Registration.this, Registration_Detail.class);
                startActivity(intent);
                if (validate(Fname) && validate(Lname) && validate(EnrNo) && validate(Bdate) && validate(Mobno) && validate(Pmobno)
                        && validate(Address) && validate(Email)) ;
            }
        });
    }

    private void datepick() {
        myCalendar = Calendar.getInstance();
        date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }


        };
    }
    private void updateLabel() {
        String myFormat = "dd/MM/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        Bdate.setText(sdf.format(myCalendar.getTime()));
    }

    private boolean validate(EditText editText) {
// check whether the field is empty or not
        if (editText.getText().toString().trim().length() < 1) {
// display the error if field is empty
            editText.setError("Please Fill This.!!!");
// set focus on field so that cursor will automatically move to that field
            editText.requestFocus();
            return false;
        }
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}