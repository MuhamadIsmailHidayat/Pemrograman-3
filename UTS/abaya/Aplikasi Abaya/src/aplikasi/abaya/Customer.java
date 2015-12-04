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
@Table(name = "customer", catalog = "abaya", schema = "")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByKodeCustomer", query = "SELECT c FROM Customer c WHERE c.kodeCustomer = :kodeCustomer"),
    @NamedQuery(name = "Customer.findByNama", query = "SELECT c FROM Customer c WHERE c.nama = :nama"),
    @NamedQuery(name = "Customer.findByAlamat", query = "SELECT c FROM Customer c WHERE c.alamat = :alamat"),
    @NamedQuery(name = "Customer.findByNoTelepon", query = "SELECT c FROM Customer c WHERE c.noTelepon = :noTelepon")})
public class Customer implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_customer")
    private Integer kodeCustomer;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "no_telepon")
    private int noTelepon;

    public Customer() {
    }

    public Customer(Integer kodeCustomer) {
        this.kodeCustomer = kodeCustomer;
    }

    public Customer(Integer kodeCustomer, String nama, String alamat, int noTelepon) {
        this.kodeCustomer = kodeCustomer;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public Integer getKodeCustomer() {
        return kodeCustomer;
    }

    public void setKodeCustomer(Integer kodeCustomer) {
        Integer oldKodeCustomer = this.kodeCustomer;
        this.kodeCustomer = kodeCustomer;
        changeSupport.firePropertyChange("kodeCustomer", oldKodeCustomer, kodeCustomer);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public int getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(int noTelepon) {
        int oldNoTelepon = this.noTelepon;
        this.noTelepon = noTelepon;
        changeSupport.firePropertyChange("noTelepon", oldNoTelepon, noTelepon);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeCustomer != null ? kodeCustomer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.kodeCustomer == null && other.kodeCustomer != null) || (this.kodeCustomer != null && !this.kodeCustomer.equals(other.kodeCustomer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.abaya.Customer[ kodeCustomer=" + kodeCustomer + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
