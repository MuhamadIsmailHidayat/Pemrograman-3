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
@Table(name = "payment", catalog = "abaya", schema = "")
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findByKodePayment", query = "SELECT p FROM Payment p WHERE p.kodePayment = :kodePayment"),
    @NamedQuery(name = "Payment.findByTanggal", query = "SELECT p FROM Payment p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "Payment.findByNama", query = "SELECT p FROM Payment p WHERE p.nama = :nama"),
    @NamedQuery(name = "Payment.findByTipe", query = "SELECT p FROM Payment p WHERE p.tipe = :tipe"),
    @NamedQuery(name = "Payment.findByUkuran", query = "SELECT p FROM Payment p WHERE p.ukuran = :ukuran"),
    @NamedQuery(name = "Payment.findByItem", query = "SELECT p FROM Payment p WHERE p.item = :item"),
    @NamedQuery(name = "Payment.findByKodeAbaya", query = "SELECT p FROM Payment p WHERE p.kodeAbaya = :kodeAbaya"),
    @NamedQuery(name = "Payment.findByKodeCustomer", query = "SELECT p FROM Payment p WHERE p.kodeCustomer = :kodeCustomer"),
    @NamedQuery(name = "Payment.findByTotalHarga", query = "SELECT p FROM Payment p WHERE p.totalHarga = :totalHarga")})
public class Payment implements Serializable {
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
    @Basic(optional = false)
    @Column(name = "total_harga")
    private int totalHarga;

    public Payment() {
    }

    public Payment(Integer kodePayment) {
        this.kodePayment = kodePayment;
    }

    public Payment(Integer kodePayment, String tanggal, String nama, String tipe, String ukuran, String item, int kodeAbaya, int kodeCustomer, int totalHarga) {
        this.kodePayment = kodePayment;
        this.tanggal = tanggal;
        this.nama = nama;
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.item = item;
        this.kodeAbaya = kodeAbaya;
        this.kodeCustomer = kodeCustomer;
        this.totalHarga = totalHarga;
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

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        int oldTotalHarga = this.totalHarga;
        this.totalHarga = totalHarga;
        changeSupport.firePropertyChange("totalHarga", oldTotalHarga, totalHarga);
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.kodePayment == null && other.kodePayment != null) || (this.kodePayment != null && !this.kodePayment.equals(other.kodePayment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.abaya.Payment[ kodePayment=" + kodePayment + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
