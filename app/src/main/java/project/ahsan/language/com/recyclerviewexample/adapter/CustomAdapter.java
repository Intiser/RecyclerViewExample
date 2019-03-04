package project.ahsan.language.com.recyclerviewexample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

import project.ahsan.language.com.recyclerviewexample.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Holder> {

    ArrayList<Date> dateArrayList = new ArrayList<>();
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setDateArrayList(ArrayList<Date> dateArrayList) {
        this.dateArrayList = dateArrayList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

    }


    @Override
    public int getItemCount() {
        return dateArrayList.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView senderTextView;
        TextView dateTextView;
        TextView subjectTextView;
        TextView bodyTextView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            senderTextView = itemView.findViewById(R.id.textview_email_sender);
            dateTextView = itemView.findViewById(R.id.textview_email_time);
            subjectTextView = itemView.findViewById(R.id.textview_email_subject);
            bodyTextView = itemView.findViewById(R.id.textview_email_body);
        }
    }

}
