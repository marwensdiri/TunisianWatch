/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Entities;

/**
 *
 * @author asd
 */
public class Geolocalisation {
    int id;
    Lieu lieu;
    double lon;
    double lat;
    
    public Geolocalisation(){
        
    }

    public int getId() {
        return id;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
    
    
    
}
