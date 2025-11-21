
package qlstk.model.entity;

import java.io.*;
public class SoTietKiem implements Serializable {
    private static final long serialVersionUID =1L;
    private KhachHang khachHang;
    private NganHang nganHang;
    private double soTienGui;
    
    public SoTietKiem(KhachHang KH, NganHang NH, double soTienGui) {
        this.khachHang= KH;
        this.nganHang= NH;
        this.soTienGui= soTienGui;
    }
    
    public KhachHang getKhachHang() {
        return khachHang;
    }
    public NganHang getNganHang() {
        return nganHang;
    }
    public double getSoTienGui() {
        return soTienGui;
    }
    @Override
    public String toString() {
        return khachHang.getHoTen()+'-'+nganHang.getTenNH()+'-'+String.format("%,.0f",soTienGui);
    }
}
