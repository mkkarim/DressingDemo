package plugin2dressing;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Plugin2DressingDialog extends Dialog {

	 public Plugin2DressingDialog(Shell parentShell) {
	        super(parentShell);
	    }

	    @Override
	    protected Control createDialogArea(Composite parent) {
	        Composite container = (Composite) super.createDialogArea(parent);
	        Label label = new Label(container, SWT.NONE);
	        label.setText("Je suis plugin 2 dressing");
	        return container;
	    }
}
