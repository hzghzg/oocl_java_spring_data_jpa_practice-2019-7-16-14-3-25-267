package com.tw.apistackbase.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
    @Id
   //@GeneratedValue(strategy = GenerationType.AUTO)
    private int registeredCapital;
    private String certId;

    public Profile() {
    }

    public int getRegisteredCapital() {
        return registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setRegisteredCapital(int registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }
}
