/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javax.swing.*;
/**
 *
 * @author nrage
 */
public class PanelFactory {
    private Helper help;
    
    public PanelFactory(Helper help) {
        this.help = help;
    }
    
    public Panel getPanel(int panelID, PanelManager pm) {
        Panel panel = null;

        switch (panelID) {
            /* Login Menu */
            case 1:
                panel = new LoginPanel();
                panel.setPanelManager(pm);
                break;
            case 2:
                panel = new CustomerPanel();
                panel.setPanelManager(pm);
                break;
        }
        return panel;
    }
}