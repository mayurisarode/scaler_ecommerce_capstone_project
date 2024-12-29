package com.ecomm.paymentsvc.domain.models.external.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

    @JsonProperty("contact")
    private String contact;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}