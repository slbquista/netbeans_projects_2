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
public abstract class Observer {
    protected Subject subj;
    public abstract void update();
}
