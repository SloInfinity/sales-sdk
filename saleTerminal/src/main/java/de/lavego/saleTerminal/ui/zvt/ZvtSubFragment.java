package de.lavego.saleTerminal.ui.zvt;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import de.lavego.sdk.Payment;
import de.lavego.sdk.CommandInterface;

public class ZvtSubFragment extends Fragment implements CommandInterface
{
    @Override
    public int doCustom(@NonNull byte[] apdu)
    {
        final FragmentActivity host = getActivity();
        
        if (host instanceof CommandInterface)
        {
            final CommandInterface commandInterface = (CommandInterface) host;
            return commandInterface.doCustom(apdu);
        }
        
        return 1;
    }
    
    @CallSuper
    @Override
    public int doDiagnosis(int type)
    {
        final FragmentActivity host = getActivity();
        
        if (host instanceof CommandInterface)
        {
            final CommandInterface commandInterface = (CommandInterface) host;
            return commandInterface.doDiagnosis(type);
        }
        
        return 1;
    }
    
    @CallSuper
    @Override
    public int doLogin()
    {
        final FragmentActivity host = getActivity();
        
        if (host instanceof CommandInterface)
        {
            final CommandInterface commandInterface = (CommandInterface) host;
            return commandInterface.doLogin();
        }
        
        return 1;
    }
    
    @CallSuper
    @Override
    public int doPayment(@NonNull Payment payment)
    {
        final FragmentActivity host = getActivity();
        
        if (host instanceof CommandInterface)
        {
            final CommandInterface commandInterface = (CommandInterface) host;
            return commandInterface.doPayment(payment);
        }
        
        return 1;
    }
    
    @Override
    public int doReconciliation()
    {
        final FragmentActivity host = getActivity();
        
        if (host instanceof CommandInterface)
        {
            final CommandInterface commandInterface = (CommandInterface) host;
            return commandInterface.doReconciliation();
        }
        
        return 1;
    }
    
    @CallSuper
    @Override
    public int doStatus()
    {
        final FragmentActivity host = getActivity();
        
        if (host instanceof CommandInterface)
        {
            final CommandInterface commandInterface = (CommandInterface) host;
            return commandInterface.doStatus();
        }
        
        return 1;
    }
    
    @CallSuper
    @Override
    public int doCancellation(int receiptNo)
    {
        final FragmentActivity host = getActivity();
        
        if (host instanceof CommandInterface)
        {
            final CommandInterface commandInterface = (CommandInterface) host;
            return commandInterface.doCancellation(receiptNo);
        }
        
        return 1;
    }
    
    @CallSuper
    @Override
    public void onAttachFragment(@NonNull Fragment childFragment)
    {
        super.onAttachFragment(childFragment);
    }
}
