package fpt.testejb.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Product details")
public class Product {
    @Id
    private long ProdID;
    private String ProdName;
    private String Decription;
    private Date DateOtManf;
    private double Price;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "product")
    private Sale sale;


    public long getProdID() {
        return ProdID;
    }

    public void setProdID(long prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String decription) {
        Decription = decription;
    }

    public Date getDateOtManf() {
        return DateOtManf;
    }

    public void setDateOtManf(Date dateOtManf) {
        DateOtManf = dateOtManf;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
