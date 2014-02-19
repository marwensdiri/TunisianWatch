/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Main;

import com.tunisianwatch.Connection.ResourceManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Marwen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection con = ResourceManager.getInstance();
        con.close();
        System.out.println("Dev.Gear");
    }
    
}
