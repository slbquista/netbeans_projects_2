/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_01;

/**
 *
 * @author 1516392
 */
public class BinObserver extends Observer {
    public BinObserver (Subject s) {
        subj = s;
        subj.attach(this);
    }
    
    public void update() {
        System.out.println("  " + Integer.toBinaryString(subj.getState()));
    }
}