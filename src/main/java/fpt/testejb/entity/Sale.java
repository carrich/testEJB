package fpt.testejb.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Sales Details")
public class Sale {
    @Id
    private long SINo;

    private int SalesmanID;

    private String SalesmanName;
    private long DOS;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn()
    private Product product;


    public Sale() {
        this.DOS = Calendar.getInstance().getTimeInMillis();
    }

    public long getSINo() {
        return SINo;
    }

    public void setSINo(long SINo) {
        this.SINo = SINo;
    }

    public int getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        SalesmanID = salesmanID;
    }



    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public long getDOS() {
        return DOS;
    }

    public void setDOS(long DOS) {
        this.DOS = DOS;
    }
}
