package de.lavego.saleTerminal.ui.zvt;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import de.lavego.saleTerminal.R;
import de.lavego.sdk.TransactionData;
import de.lavego.zvt.ZvtResponseCallback;

import static de.lavego.sdk.GoogleGson.Gson;

public class ZvtFragment extends Fragment implements ZvtResponseCallback
{
    private TextView intermediate_status;
    private TextView completion_status;
    
    private void clearIntermediateText()
    {
        if (intermediate_status != null && isAdded())
        {
            intermediate_status.setText("");
        }
    }
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_zvt, container, false);
        intermediate_status = root.findViewById(R.id.intermediate_status);
        completion_status = root.findViewById(R.id.completion_status);
        completion_status.setMovementMethod(new ScrollingMovementMethod());
        clearCompletionText();
        setIntermediateText(getString(R.string.please_send_command));
        return root;
    }
    
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater)
    {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.zvt, menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == R.id.action_register)
        {
            changeSubFragment(new RegisterFragment());
        }
        else if (item.getItemId() == R.id.action_payment)
        {
            changeSubFragment(new AmountFragment());
        }
        else if (item.getItemId() == R.id.action_diagnosis)
        {
            changeSubFragment(new DiagnosisFragment());
        }
        else if (item.getItemId() == R.id.action_reconciliation)
        {
            changeSubFragment(new ReconciliationFragment());
        }
        else if (item.getItemId() == R.id.action_cancellation)
        {
            changeSubFragment(new CancellationFragment());
        }
        else if (item.getItemId() == R.id.action_status_enquiry)
        {
            changeSubFragment(new StatusFragment());
        }
        else if (item.getItemId() == R.id.action_custom_command)
        {
            changeSubFragment(new CustomFragment());
        }
        
        return super.onOptionsItemSelected(item);
    }
    
    private void changeSubFragment(@NonNull Fragment newFragment)
    {
        FragmentTransaction ft      = getChildFragmentManager().beginTransaction();
        final Fragment      current = getChildFragmentManager().findFragmentById(R.id.zvt_sub_fragment);
        
        if (current != null)
        {
            ft.replace(R.id.zvt_sub_fragment, newFragment);
        }
        else
        {
            ft.add(R.id.zvt_sub_fragment, newFragment);
        }
        clearCompletionText();
        setIntermediateText(getString(R.string.please_send_command));
        ft.commit();
    }
    
    @Override
    public void onOptionsMenuClosed(@NonNull Menu menu)
    {
        super.onOptionsMenuClosed(menu);
    }
    
    private void clearCompletionText()
    {
        if (completion_status != null && isAdded())
        {
            completion_status.setText("");
        }
    }
    
    private void setIntermediateText(@NonNull String text)
    {
        if (intermediate_status != null)
        {
            intermediate_status.setText(text);
        }
    }
    
    @Override
    public void onRawData(String hex)
    {
        // Feel free to decode the APDU with the given API.
        // May be you need some special values!
    }
    
    @Override
    public void onStatus(@NonNull String status)
    {
        final TransactionData data = Gson().fromJson(status, TransactionData.class);
        
        if(data != null)
        {
            // do something with TransactionData
        }
        
        setCompletionText(status);
    }
    
    @Override
    public void onIntermediateStatus(String status)
    {
        setIntermediateText(status);
    }
    
    @Override
    public void onCompletion(String completion)
    {
        setCompletionText(completion);
    }
    
    @Override
    public void onReceipt(String receipt)
    {
        setCompletionText(receipt);
    }
    
    @Override
    public void onError(String error)
    {
        //clearCompletionText();
        setIntermediateText("Error");
        setCompletionText(error);
    }
    
    @Override
    public void onSocketConnected(boolean connected)
    {
        setIntermediateText(String.format("Socket connected=%s", connected));
        setCompletionText("");
    }
    
    private void setCompletionText(@NonNull String text)
    {
        if (completion_status != null)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(completion_status.getText());
            sb.append("\n");
            sb.append(text);
            
            if (text.contains("CMD_0600")) { setIntermediateText("Register gesendet..."); }
            else if (text.contains("CMD_0501")) { setIntermediateText("Status enquiry gesendet..."); }
            
            completion_status.setText(sb.toString());
            completion_status.post(() -> {
                try
                {
                    final int scrollAmount = completion_status
                                                     .getLayout()
                                                     .getLineTop(completion_status.getLineCount()) - completion_status.getHeight();
                    // if there is no need to scroll, scrollAmount will be <=0
                    completion_status.scrollTo(0, Math.max(scrollAmount, 0));
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            });
        }
    }
}
