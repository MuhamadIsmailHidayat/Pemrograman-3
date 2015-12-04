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
@Table(name = "pembayaran", catalog = "abaya", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pembayaran.findAll", query = "SELECT p FROM Pembayaran p"),
    @NamedQuery(name = "Pembayaran.findByKodePayment", query = "SELECT p FROM Pembayaran p WHERE p.kodePayment = :kodePayment"),
    @NamedQuery(name = "Pembayaran.findByTanggal", query = "SELECT p FROM Pembayaran p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "Pembayaran.findByNama", query = "SELECT p FROM Pembayaran p WHERE p.nama = :nama"),
    @NamedQuery(name = "Pembayaran.findByTipe", query = "SELECT p FROM Pembayaran p WHERE p.tipe = :tipe"),
    @NamedQuery(name = "Pembayaran.findByUkuran", query = "SELECT p FROM Pembayaran p WHERE p.ukuran = :ukuran"),
    @NamedQuery(name = "Pembayaran.findByItem", query = "SELECT p FROM Pembayaran p WHERE p.item = :item"),
    @NamedQuery(name = "Pembayaran.findByKodeAbaya", query = "SELECT p FROM Pembayaran p WHERE p.kodeAbaya = :kodeAbaya"),
    @NamedQuery(name = "Pembayaran.findByKodeCustomer", query = "SELECT p FROM Pembayaran p WHERE p.kodeCustomer = :kodeCustomer")})
public class Pembayaran implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_payment")
    private Integer kodePayment;
    @Basic(optional = false)
    @Column(name = "tanggal")
    private String tanggal;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "tipe")
    private String tipe;
    @Basic(optional = false)
    @Column(name = "ukuran")
    private String ukuran;
    @Basic(optional = false)
    @Column(name = "item")
    private String item;
    @Basic(optional = false)
    @Column(name = "kode_abaya")
    private int kodeAbaya;
    @Basic(optional = false)
    @Column(name = "kode_customer")
    private int kodeCustomer;

    public Pembayaran() {
    }

    public Pembayaran(Integer kodePayment) {
        this.kodePayment = kodePayment;
    }

    public Pembayaran(Integer kodePayment, String tanggal, String nama, String tipe, String ukuran, String item, int kodeAbaya, int kodeCustomer) {
        this.kodePayment = kodePayment;
        this.tanggal = tanggal;
        this.nama = nama;
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.item = item;
        this.kodeAbaya = kodeAbaya;
        this.kodeCustomer = kodeCustomer;
    }

    public Integer getKodePayment() {
        return kodePayment;
    }

    public void setKodePayment(Integer kodePayment) {
        Integer oldKodePayment = this.kodePayment;
        this.kodePayment = kodePayment;
        changeSupport.firePropertyChange("kodePayment", oldKodePayment, kodePayment);
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        String oldTanggal = this.tanggal;
        this.tanggal = tanggal;
        changeSupport.firePropertyChange("tanggal", oldTanggal, tanggal);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        String oldItem = this.item;
        this.item = item;
        changeSupport.firePropertyChange("item", oldItem, item);
    }

    public int getKodeAbaya() {
        return kodeAbaya;
    }

    public void setKodeAbaya(int kodeAbaya) {
        int oldKodeAbaya = this.kodeAbaya;
        this.kodeAbaya = kodeAbaya;
        changeSupport.firePropertyChange("kodeAbaya", oldKodeAbaya, kodeAbaya);
    }

    public int getKodeCustomer() {
        return kodeCustomer;
    }

    public void setKodeCustomer(int kodeCustomer) {
        int oldKodeCustomer = this.kodeCustomer;
        this.kodeCustomer = kodeCustomer;
        changeSupport.firePropertyChange("kodeCustomer", oldKodeCustomer, kodeCustomer);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodePayment != null ? kodePayment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pembayaran)) {
            return false;
        }
        Pembayaran other = (Pembayaran) object;
        if ((this.kodePayment == null && other.kodePayment != null) || (this.kodePayment != null && !this.kodePayment.equals(other.kodePayment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.abaya.Pembayaran[ kodePayment=" + kodePayment + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
