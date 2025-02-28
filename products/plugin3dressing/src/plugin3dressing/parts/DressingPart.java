package plugin3dressing.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import plugin1common.Plugin1CommonDialog;
import plugin1dressing.Plugin1DressingDialog;
import plugin2dressing.Plugin2DressingDialog;

public class DressingPart {
	
	
	@PostConstruct
    public void createPartControl(Composite parent) {
	       parent.setLayout(new GridLayout(3, false)); // Change to 2 columns for side-by-side buttons

	       // Bouton 1 : Afficher Plugin 1
	        Button btn1 = new Button(parent, SWT.PUSH);
	        btn1.setText("Plugin 1 Dressing");
	        btn1.addListener(SWT.Selection, e -> openPlugin1Dialog(parent.getShell()));

	        // Bouton 2 : Afficher Plugin 2
	        Button btn2 = new Button(parent, SWT.PUSH);
	        btn2.setText("Plugin 2 Dressing");
	        btn2.addListener(SWT.Selection, e -> openPlugin2Dialog(parent.getShell()));
	        
	        // Bouton 3 : Afficher Plugin 1 common 
	        Button btn3 = new Button(parent, SWT.PUSH);
	        btn3.setText("Plugin 1 common");
	        btn3.addListener(SWT.Selection, e -> openPlugin3Dialog(parent.getShell()));
	    }

	

	    private void openPlugin1Dialog(Shell shell) {
	        Plugin1DressingDialog dialog = new Plugin1DressingDialog(shell);
	        dialog.open();
	    }

	    private void openPlugin2Dialog(Shell shell) {
	        Plugin2DressingDialog dialog = new Plugin2DressingDialog(shell);
	        dialog.open();
	    }
	    
	    private void openPlugin3Dialog(Shell shell) {
	        Plugin1CommonDialog dialog = new Plugin1CommonDialog(shell);
	        dialog.open();
	    }
}
