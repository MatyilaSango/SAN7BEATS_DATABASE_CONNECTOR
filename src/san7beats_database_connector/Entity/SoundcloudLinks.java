/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san7beats_database_connector.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sango
 */
@Entity
@Table(name = "soundcloud_links")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoundcloudLinks.findAll", query = "SELECT s FROM SoundcloudLinks s")
    , @NamedQuery(name = "SoundcloudLinks.findById", query = "SELECT s FROM SoundcloudLinks s WHERE s.id = :id")
    , @NamedQuery(name = "SoundcloudLinks.findByCode", query = "SELECT s FROM SoundcloudLinks s WHERE s.code = :code")})
public class SoundcloudLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "code")
    private String code;

    public SoundcloudLinks() {
    }

    public SoundcloudLinks(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoundcloudLinks)) {
            return false;
        }
        SoundcloudLinks other = (SoundcloudLinks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "san7beats_database_connector.SoundcloudLinks[ id=" + id + " ]";
    }
    
}
