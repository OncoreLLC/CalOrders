/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncore.calorders.rest;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author oncore
 */
@Entity
@Table(name = "PRD_CATEGORY_CD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrdCategoryCd.findAll", query = "SELECT p FROM PrdCategoryCd p")
    , @NamedQuery(name = "PrdCategoryCd.findByCode", query = "SELECT p FROM PrdCategoryCd p WHERE p.code = :code")
    , @NamedQuery(name = "PrdCategoryCd.findByShortDesc", query = "SELECT p FROM PrdCategoryCd p WHERE p.shortDesc = :shortDesc")
    , @NamedQuery(name = "PrdCategoryCd.findByLongDesc", query = "SELECT p FROM PrdCategoryCd p WHERE p.longDesc = :longDesc")
    , @NamedQuery(name = "PrdCategoryCd.findByCreateUserId", query = "SELECT p FROM PrdCategoryCd p WHERE p.createUserId = :createUserId")
    , @NamedQuery(name = "PrdCategoryCd.findByCreateTs", query = "SELECT p FROM PrdCategoryCd p WHERE p.createTs = :createTs")
    , @NamedQuery(name = "PrdCategoryCd.findByUpdateUserId", query = "SELECT p FROM PrdCategoryCd p WHERE p.updateUserId = :updateUserId")
    , @NamedQuery(name = "PrdCategoryCd.findByUpdateTs", query = "SELECT p FROM PrdCategoryCd p WHERE p.updateTs = :updateTs")})
public class PrdCategoryCd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "SHORT_DESC")
    private String shortDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "LONG_DESC")
    private String longDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "CREATE_USER_ID")
    private String createUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdCategoryCd")
    private Collection<Product> productCollection;

    public PrdCategoryCd() {
    }

    public PrdCategoryCd(String code) {
        this.code = code;
    }

    public PrdCategoryCd(String code, String shortDesc, String longDesc, String createUserId, Date createTs, String updateUserId, Date updateTs) {
        this.code = code;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.createUserId = createUserId;
        this.createTs = createTs;
        this.updateUserId = updateUserId;
        this.updateTs = updateTs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdCategoryCd)) {
            return false;
        }
        PrdCategoryCd other = (PrdCategoryCd) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oncore.calorders.rest.PrdCategoryCd[ code=" + code + " ]";
    }
    
}
