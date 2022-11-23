package com.reeyanto.androiddialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class AlertFragment extends DialogFragment {

    private String title, message;
    private AlertListener alertListener;

    public interface AlertListener {
        void onAlertOK();
        void onAlertNO();
    }

    public AlertFragment(String title, String message, AlertListener alertListener) {
        this.title = title;
        this.message = message;
        this.alertListener = alertListener;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", ((dialogInterface, i) -> {
                    if (alertListener != null) {
                        alertListener.onAlertOK();
                    }
                }))
                .setNegativeButton("NO", ((dialogInterface, i) -> {
                    if (alertListener != null) {
                        alertListener.onAlertNO();
                    }
                }));

        return builder.create();
    }
}
