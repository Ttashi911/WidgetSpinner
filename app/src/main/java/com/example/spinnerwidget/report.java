package com.example.spinnerwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class report extends AppCompatActivity {
    TextView tvAge, tvEducation, tvFathername, tvGrandFathername, tvMothername, tvOccupation, tvSpousename, tvReligion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        tvAge = findViewById(R.id.reportAge);
        tvEducation = findViewById(R.id.reportEducation);
        tvFathername = findViewById(R.id.reportFathername);
        tvGrandFathername = findViewById(R.id.reportGrandFathername);
        tvMothername = findViewById(R.id.reportMother);
        tvOccupation = findViewById(R.id.reportOccupation);
        tvSpousename = findViewById(R.id.reportSpousename);
        tvReligion = findViewById(R.id.reportReligion);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            tvAge.setText("Age: "+bundle.getString("age"));
            tvReligion.setText("Religion: "+bundle.getString("religion"));
            tvEducation.setText("Education: "+bundle.getString("education"));
            tvFathername.setText("FAther's Name: "+bundle.getString("Fathername"));
            tvGrandFathername.setText("Grandfather's Name: "+bundle.getString("GrandFathername"));
            tvMothername.setText("Mother's Name: "+bundle.getString("mothername"));
            tvOccupation.setText("Occupation: "+bundle.getString("occupation"));
            tvSpousename.setText("Spouse's Name: "+bundle.getString("spousename"));

        }

    }
}
