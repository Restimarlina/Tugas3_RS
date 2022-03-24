package org.nsh.tugas3_app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Rumah Sakit Awal Bros", "Rumah sakit Eka Hospital", "Rumah Sakit Annisa",
        "Rumah Sakit Jiwa Tampan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bros")){
                a = new Intent(this,RumahSakitAwalBros.class);

            } else if (pilihan.equals("Rumah sakit Eka Hospital"))
            {
                a = new Intent(this,RumahSakitEkaHospital.class);
            } else if (pilihan.equals("Rumah Sakit Annisa"))
            {
                a = new Intent(this,RumahSakitAnnisa.class);
            } else if (pilihan.equals("Rumah Sakit Jiwa Tampan"))
            {
                a = new Intent(this,RumahSakitJiwaTampan.class);
            }
            startActivity(a);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    ;
}
