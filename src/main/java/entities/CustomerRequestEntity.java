package entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customermessages")
@Data
public class CustomerRequestEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="kindofrequestid")
    private Integer kindOfRequestId;

    @Column(name="policy_number")
    private String policyNumber; // Alphanumeric

    @Column(name="first_name")
    private String name; // OnlyLetter

    @Column(name="last_name")
    private String surname; //OnlyLetter

    @Column(name="customerrequest")
    private String requestMessage; // max length 5000 chars

     public CustomerRequestEntity() {
    }

    public CustomerRequestEntity(Integer id, Integer kindOfRequestId, String policyNumber, String name, String surname, String requestMessage) {
        this.id = id;
        this.kindOfRequestId = kindOfRequestId;
        this.policyNumber = policyNumber;
        this.name = name;
        this.surname = surname;
        this.requestMessage = requestMessage;
    }
}
