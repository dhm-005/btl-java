
package qlstk.model.entity;

import java.io.Serializable;
import qlstk.model.interfaces.IAutoId;
import qlstk.model.interfaces.IFileEntity;

public class NganHang implements Serializable, IAutoId, IFileEntity{
     private static int id = 100;
    private int maNH;
    private String tenNH;
    private double laiSuat;

    public NganHang() {
    }

    public NganHang(String tenNH, double laiSuat) {
        this.maNH = id++;
        this.tenNH = tenNH;
        this.laiSuat = laiSuat;
    }

    public static int getId() {
        return id;
    }

    public int getMaNH() {
        return maNH;
    }

    public String getTenNH() {
        return tenNH;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public static void setId(int id) {
        NganHang.id = id;
    }

    public void setMaNH(int maNH) {
        this.maNH = maNH;
    }

    public void setTenNH(String tenNH) {
        this.tenNH = tenNH;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }
    
    
}
