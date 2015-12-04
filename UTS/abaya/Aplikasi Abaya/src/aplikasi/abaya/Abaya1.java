/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.abaya;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "abaya1", catalog = "abaya", schema = "")
@NamedQueries({
    @NamedQuery(name = "Abaya1.findAll", query = "SELECT a FROM Abaya1 a"),
    @NamedQuery(name = "Abaya1.findByKodeAbaya", query = "SELECT a FROM Abaya1 a WHERE a.kodeAbaya = :kodeAbaya"),
    @NamedQuery(name = "Abaya1.findByTipe", query = "SELECT a FROM Abaya1 a WHERE a.tipe = :tipe"),
    @NamedQuery(name = "Abaya1.findByUkuran", query = "SELECT a FROM Abaya1 a WHERE a.ukuran = :ukuran"),
    @NamedQuery(name = "Abaya1.findByJumlah", query = "SELECT a FROM Abaya1 a WHERE a.jumlah = :jumlah"),
    @NamedQuery(name = "Abaya1.findByHarga", query = "SELECT a FROM Abaya1 a WHERE a.harga = :harga")})
public class Abaya1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_abaya")
    private Integer kodeAbaya;
    @Basic(optional = false)
    @Column(name = "tipe")
    private String tipe;
    @Basic(optional = false)
    @Column(name = "ukuran")
    private String ukuran;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private int jumlah;
    @Basic(optional = false)
    @Column(name = "harga")
    private int harga;

    public Abaya1() {
    }

    public Abaya1(Integer kodeAbaya) {
        this.kodeAbaya = kodeAbaya;
    }

    public Abaya1(Integer kodeAbaya, String tipe, String ukuran, int jumlah, int harga) {
        this.kodeAbaya = kodeAbaya;
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public Integer getKodeAbaya() {
        return kodeAbaya;
    }

    public void setKodeAbaya(Integer kodeAbaya) {
        Integer oldKodeAbaya = this.kodeAbaya;
        this.kodeAbaya = kodeAbaya;
        changeSupport.firePropertyChange("kodeAbaya", oldKodeAbaya, kodeAbaya);
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        String oldTipe = this.tipe;
        this.tipe = tipe;
        changeSupport.firePropertyChange("tipe", oldTipe, tipe);
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        String oldUkuran = this.ukuran;
        this.ukuran = ukuran;
        changeSupport.firePropertyChange("ukuran", oldUkuran, ukuran);
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        int oldJumlah = this.jumlah;
        this.jumlah = jumlah;
        changeSupport.firePropertyChange("jumlah", oldJumlah, jumlah);
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        int oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeAbaya != null ? kodeAbaya.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abaya1)) {
            return false;
        }
        Abaya1 other = (Abaya1) object;
        if ((this.kodeAbaya == null && other.kodeAbaya != null) || (this.kodeAbaya != null && !this.kodeAbaya.equals(other.kodeAbaya))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.abaya.Abaya1[ kodeAbaya=" + kodeAbaya + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
