package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")){
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Figure Joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Figure Jane")) {
			AbstractDriverAdapter driver = new AbstractDriverAdapter(driverManager.getCurrentDriver());
			FiguresJane.figureScript(driver);
		}
		else if(e.getActionCommand().equals("Rectangle")) {
			AbstractDriverAdapter driver = new AbstractDriverAdapter(driverManager.getCurrentDriver());
			ComplexCommandFactory.rectangle(driver).execute();
		}
		else if(e.getActionCommand().equals("Triangle")) {
			AbstractDriverAdapter driver = new AbstractDriverAdapter(driverManager.getCurrentDriver());
			ComplexCommandFactory.triangle(driver).execute();
		}
	}
}
