package plugin3dressing.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import plugin1dressing.Plugin1DressingDialog;
import plugin2dressing.Plugin2DressingDialog;

public class DressingPart {
	
	
	@PostConstruct
    public void createPartControl(Composite parent) {
	       parent.setLayout(new GridLayout(2, false)); // Change to 2 columns for side-by-side buttons

	        int buttonSize = 250;

	        Button btn1 = new Button(parent, SWT.PUSH);
	        btn1.setText("Plugin 1 Dressing");
	        btn1.setSize(buttonSize, buttonSize);
	        btn1.setBackground(new Color(Display.getCurrent(), 0, 122, 204));
	        btn1.addListener(SWT.Selection, e -> openPlugin1Dialog(parent.getShell()));

	        Button btn2 = new Button(parent, SWT.PUSH);
	        btn2.setText("Plugin 2 Dressing");
	        btn2.setSize(buttonSize, buttonSize);
	        btn2.setBackground(new Color(Display.getCurrent(), 0, 204, 0));
	        btn2.addListener(SWT.Selection, e -> openPlugin2Dialog(parent.getShell()));

	        addCircularPaintListener(btn1, buttonSize);
	        addCircularPaintListener(btn2, buttonSize);
	    }

	    private void addCircularPaintListener(Button button, int buttonSize) {
	        button.addPaintListener(new PaintListener() {
	            @Override
	            public void paintControl(PaintEvent e) {
	                GC gc = e.gc;
	                gc.setAntialias(SWT.ON);
	                gc.setBackground(button.getBackground());
	                gc.fillOval(0, 0, buttonSize, buttonSize);
	                gc.setForeground(button.getDisplay().getSystemColor(SWT.COLOR_WHITE));
	                gc.drawText(button.getText(), 
	                            buttonSize / 2 - gc.textExtent(button.getText()).x / 2, 
	                            buttonSize / 2 - gc.textExtent(button.getText()).y / 2);
	            }
	        });
	    }

	    private void openPlugin1Dialog(Shell shell) {
	        Plugin1DressingDialog dialog = new Plugin1DressingDialog(shell);
	        dialog.open();
	    }

	    private void openPlugin2Dialog(Shell shell) {
	        Plugin2DressingDialog dialog = new Plugin2DressingDialog(shell);
	        dialog.open();
	    }
}
