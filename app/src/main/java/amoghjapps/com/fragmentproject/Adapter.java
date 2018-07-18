package amoghjapps.com.fragmentproject;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter {
    public Activity activityContext;
    public ArrayList<Data> list;

    public Adapter(@NonNull  Activity activityContext, ArrayList<Data> list) {
        super(activityContext,R.layout.itemview,list);
        this.activityContext = activityContext;
        this.list = list;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=activityContext.getLayoutInflater();
               convertView= inflater.inflate(R.layout.itemview,null,false);
              TextView name=convertView.findViewById(R.id.sendername);
              TextView text= convertView.findViewById(R.id.text);
               TextView timeanddate=convertView.findViewById(R.id.time);

               if(list.get(position).sendername=="Me"){
                   name.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
                   text.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
                   timeanddate.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);

               }
               name.setText(list.get(position).sendername);
               text.setText(list.get(position).text);
               timeanddate.setText(list.get(position).time);
               return convertView;
    }
}
