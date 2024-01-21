import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.logindialogeg.R;

public class LoginDialogFragment extends DialogFragment  {

    EditText username , password ;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
       View DialogView = inflater.inflate(R.layout.layout_loginfile, null);

       builder.setView(DialogView);
       builder.setTitle("Login");

       builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {

           }
       });

       builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {

           }
       });

       username = DialogView.findViewById(R.id.username);
       password = DialogView.findViewById(R.id.password);

        return builder.create();
    }
}
