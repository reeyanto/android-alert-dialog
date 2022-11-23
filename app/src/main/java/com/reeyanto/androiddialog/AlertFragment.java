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

    public AlertFragment(String title, String message) {
        this.title = title;
        this.message = message;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", ((dialogInterface, i) -> Toast.makeText(getActivity(), "Anda menekan OK", Toast.LENGTH_SHORT).show()));

        return builder.create();
    }
}
