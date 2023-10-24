/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author Duong Ngo Manh
 */
public class Phong {
    private String maPhong;
    private String maLoaiPhong;
    private String tenPhong;

    public Phong() {
    }

    public Phong(String maPhong, String maLoaiPhong, String tenPhong) {
        this.maPhong = maPhong;
        this.maLoaiPhong = maLoaiPhong;
        this.tenPhong = tenPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maPhong);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Phong other = (Phong) obj;
        return Objects.equals(this.maPhong, other.maPhong);
    }

    @Override
    public String toString() {
        return "Phong{" + "maPhong=" + maPhong + ", maLoaiPhong=" + maLoaiPhong + ", tenPhong=" + tenPhong + '}';
    }
    
}
