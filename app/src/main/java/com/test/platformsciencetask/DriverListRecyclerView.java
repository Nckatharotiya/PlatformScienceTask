package com.test.platformsciencetask;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.test.platformsciencetask.databinding.RowChildBinding;

import java.text.MessageFormat;

public class DriverListRecyclerView extends RecyclerView.Adapter<DriverListRecyclerView.ViewHolder> {
    private final MainModel mainModel;
    private final int[][] assignment;

    public DriverListRecyclerView(MainModel mainModel, int[][] assignment) {
        this.mainModel = mainModel;
        this.assignment = assignment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowChildBinding rowChildBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_child, parent, false);
        return new ViewHolder(rowChildBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding(assignment[position]);
    }

    @Override
    public int getItemCount() {
        return mainModel.driversList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final RowChildBinding rowChildBinding;

        public ViewHolder(@NonNull RowChildBinding rowChildBinding) {
            super(rowChildBinding.getRoot());
            this.rowChildBinding = rowChildBinding;
        }

        public void binding(int[] ints) {
            rowChildBinding.tvDrive.setText(MessageFormat.format("{0}{1}", rowChildBinding.getRoot().getContext().getString(R.string.driver), mainModel.getDriversList().get(ints[0])));
            rowChildBinding.tvAddress.setText(MessageFormat.format("{0}{1}", rowChildBinding.getRoot().getContext().getString(R.string.address), mainModel.getShipmentsList().get(ints[1])));
        }
    }
}
