




package shraddha.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {




    private String[] data;


    public ProgrammingAdapter(String[] data)
    {
        this.data=data;
    }
    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) //creates first layout
     {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title= data[position];
        holder.text1.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView img1;
        TextView text1;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            img1=(ImageView) itemView.findViewById(R.id.img1);
            text1=(TextView) itemView.findViewById(R.id.text1);
        }
    }
}



