package plugin1dressing;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Plugin1DressingDialog extends Dialog {

	 public Plugin1DressingDialog(Shell parentShell) {
	        super(parentShell);
	    }

	    @Override
	    protected Control createDialogArea(Composite parent) {
	        Composite container = (Composite) super.createDialogArea(parent);
	        Label label = new Label(container, SWT.NONE);
	        label.setText("Je suis plugin 1 dressing");
	        return container;
	    }
}
