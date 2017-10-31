/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.ControlesFlujo;

/**
 * @Instituto Rumiñahui
 * @author alexis 08
 */
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println(ControlesFlujo.getCheck());
//        ControlesFlujo.comparacionFor();
        ControlesFlujo.unirFor();
    }
}
