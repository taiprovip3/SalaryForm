package model;
import java.util.Date;
import java.util.Objects;
public class BangChamCong {
    private String maBangChamCong;
    private String maDonVi;
    private Date ngayChamCong;

    public String getMaBangChamCong() {
        return maBangChamCong;
    }

    public void setMaBangChamCong(String maBangChamCong) {
        this.maBangChamCong = maBangChamCong;
    }

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    public Date getNgayChamCong() {
        return ngayChamCong;
    }

    public void setNgayChamCong(Date ngayChamCong) {
        this.ngayChamCong = ngayChamCong;
    }

    public BangChamCong() {
    }

    public BangChamCong(String maBangChamCong, String maDonVi, Date ngayChamCong) {
        this.maBangChamCong = maBangChamCong;
        this.maDonVi = maDonVi;
        this.ngayChamCong = ngayChamCong;
    }

    @Override
    public String toString() {
        return "BangChamCong{" + "maBangChamCong=" + maBangChamCong + ", maDonVi=" + maDonVi + ", ngayChamCong=" + ngayChamCong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.maBangChamCong);
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
        final BangChamCong other = (BangChamCong) obj;
        if (!Objects.equals(this.maBangChamCong, other.maBangChamCong)) {
            return false;
        }
        return true;
    }
    
}
