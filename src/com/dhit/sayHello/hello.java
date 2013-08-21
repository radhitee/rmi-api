/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhit.sayHello;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Radhitee
 */
public interface hello extends Remote{
    public String hello(String h)throws RemoteException;
}
