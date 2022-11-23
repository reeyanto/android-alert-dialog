package com.reeyanto.androiddialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    private Calendar calendar;
    private EditText etTime;

    public TimePickerFragment(EditText editText) {
        etTime = editText;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int mins = calendar.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, mins, DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
        etTime.setText(String.format("%s:%s", hour, minute));
    }
}
