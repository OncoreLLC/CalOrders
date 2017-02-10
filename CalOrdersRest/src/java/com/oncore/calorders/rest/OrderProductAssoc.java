/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncore.calorders.rest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oncore
 */
@Entity
@Table(name = "ORDER_PRODUCT_ASSOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderProductAssoc.findAll", query = "SELECT o FROM OrderProductAssoc o")
    , @NamedQuery(name = "OrderProductAssoc.findByOpaUid", query = "SELECT o FROM OrderProductAssoc o WHERE o.opaUid = :opaUid")
    , @NamedQuery(name = "OrderProductAssoc.findByOpaQuantity", query = "SELECT o FROM OrderProductAssoc o WHERE o.opaQuantity = :opaQuantity")
    , @NamedQuery(name = "OrderProductAssoc.findByOpaPrice", query = "SELECT o FROM OrderProductAssoc o WHERE o.opaPrice = :opaPrice")
    , @NamedQuery(name = "OrderProductAssoc.findByCreateUserId", query = "SELECT o FROM OrderProductAssoc o WHERE o.createUserId = :createUserId")
    , @NamedQuery(name = "OrderProductAssoc.findByCreateTs", query = "SELECT o FROM OrderProductAssoc o WHERE o.createTs = :createTs")
    , @NamedQuery(name = "OrderProductAssoc.findByUpdateUserId", query = "SELECT o FROM OrderProductAssoc o WHERE o.updateUserId = :updateUserId")
    , @NamedQuery(name = "OrderProductAssoc.findByUpdateTs", query = "SELECT o FROM OrderProductAssoc o WHERE o.updateTs = :updateTs")})
public class OrderProductAssoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OPA_UID")
    private Integer opaUid;
    @Column(name = "OPA_QUANTITY")
    private Integer opaQuantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "OPA_PRICE")
    private BigDecimal opaPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CREATE_USER_ID")
    private String createUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTs;
    @JoinColumn(name = "ORD_UID_FK", referencedColumnName = "ORD_UID")
    @ManyToOne(optional = false)
    private Order1 ordUidFk;
    @JoinColumn(name = "PRS_UID_FK", referencedColumnName = "PRS_UID")
    @ManyToOne(optional = false)
    private PrdRelService prsUidFk;
    @JoinColumn(name = "PRD_UID_FK", referencedColumnName = "PRD_UID")
    @ManyToOne(optional = false)
    private Product prdUidFk;

    public OrderProductAssoc() {
    }

    public OrderProductAssoc(Integer opaUid) {
        this.opaUid = opaUid;
    }

    public OrderProductAssoc(Integer opaUid, String createUserId, Date createTs, String updateUserId, Date updateTs) {
        this.opaUid = opaUid;
        this.createUserId = createUserId;
        this.createTs = createTs;
        this.updateUserId = updateUserId;
        this.updateTs = updateTs;
    }

    public Integer getOpaUid() {
        return opaUid;
    }

    public void setOpaUid(Integer opaUid) {
        this.opaUid = opaUid;
    }

    public Integer getOpaQuantity() {
        return opaQuantity;
    }

    public void setOpaQuantity(Integer opaQuantity) {
        this.opaQuantity = opaQuantity;
    }

    public BigDecimal getOpaPrice() {
        return opaPrice;
    }

    public void setOpaPrice(BigDecimal opaPrice) {
        this.opaPrice = opaPrice;
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

    public Order1 getOrdUidFk() {
        return ordUidFk;
    }

    public void setOrdUidFk(Order1 ordUidFk) {
        this.ordUidFk = ordUidFk;
    }

    public PrdRelService getPrsUidFk() {
        return prsUidFk;
    }

    public void setPrsUidFk(PrdRelService prsUidFk) {
        this.prsUidFk = prsUidFk;
    }

    public Product getPrdUidFk() {
        return prdUidFk;
    }

    public void setPrdUidFk(Product prdUidFk) {
        this.prdUidFk = prdUidFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opaUid != null ? opaUid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderProductAssoc)) {
            return false;
        }
        OrderProductAssoc other = (OrderProductAssoc) object;
        if ((this.opaUid == null && other.opaUid != null) || (this.opaUid != null && !this.opaUid.equals(other.opaUid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oncore.calorders.rest.OrderProductAssoc[ opaUid=" + opaUid + " ]";
    }
    
}
