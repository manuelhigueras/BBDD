/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.transaccion;

import java.sql.SQLException;

/**
 *
 * @author user
 */
public class PruebaTransaccion {
    public static void main(String[] args) {
        try{
            Mantenimiento_tienda mto = new Mantenimiento_tienda();
            mto.corregirFallo("Colombian", "Espresso", 5);
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
