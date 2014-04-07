/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package org.cerberus.entity;

import java.io.Serializable;

/**
 *
 * @author memiks
@Entity
@Table(catalog = "cerberus", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"campaign", "Parameter"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CampaignParameter.findAll", query = "SELECT c FROM CampaignParameter c"),
    @NamedQuery(name = "CampaignParameter.findByCampaignparameterID", query = "SELECT c FROM CampaignParameter c WHERE c.campaignparameterID = :campaignparameterID"),
    @NamedQuery(name = "CampaignParameter.findByParameter", query = "SELECT c FROM CampaignParameter c WHERE c.parameter = :parameter"),
    @NamedQuery(name = "CampaignParameter.findByValue", query = "SELECT c FROM CampaignParameter c WHERE c.value = :value")})
 */
public class CampaignParameter implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer campaignparameterID;
    private String parameter;
    private String value;
    private Campaign campaign;

    public CampaignParameter() {
    }

    public CampaignParameter(Integer campaignparameterID) {
        this.campaignparameterID = campaignparameterID;
    }

    public CampaignParameter(Integer campaignparameterID, String parameter, String value) {
        this.campaignparameterID = campaignparameterID;
        this.parameter = parameter;
        this.value = value;
    }

    public Integer getCampaignparameterID() {
        return campaignparameterID;
    }

    public void setCampaignparameterID(Integer campaignparameterID) {
        this.campaignparameterID = campaignparameterID;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (campaignparameterID != null ? campaignparameterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CampaignParameter)) {
            return false;
        }
        CampaignParameter other = (CampaignParameter) object;
        if ((this.campaignparameterID == null && other.campaignparameterID != null) || (this.campaignparameterID != null && !this.campaignparameterID.equals(other.campaignparameterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.cerberus.entity.CampaignParameter[ campaignparameterID=" + campaignparameterID + " ]";
    }

}
