/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.Controller;

import javaapplication9.Model.Model;
import javax.swing.text.View;

/**
 *
 * @author 6030213005
 */
public class Controller {
    private Model model;
    private View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
 
}
