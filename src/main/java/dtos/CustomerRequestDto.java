package dtos;

import lombok.Data;

@Data
public class CustomerRequestDto {
    private int kindOfRequestId;
    private String policyNumber; // Alphanumeric
    private String name; // OnlyLetter
    private String surname; //OnlyLetter
    private String requestMessage; // max length 100 chars
}
