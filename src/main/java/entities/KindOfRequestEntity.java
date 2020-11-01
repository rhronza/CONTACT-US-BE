package entities;

import dtos.KindOfRequestDto;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "kindofrequest")
@Data
public class KindOfRequestEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "label")
    private String label;

    public KindOfRequestEntity() {
    }

    public KindOfRequestEntity(Integer id, String label) {
        this.id = id;
        this.label = label;
    }



    public KindOfRequestDto convertoToDto() {
        KindOfRequestDto kindOfRequestDto = new KindOfRequestDto();
        kindOfRequestDto.setId(this.id);
        kindOfRequestDto.setLabel(this.label);
        return kindOfRequestDto;
    }


}
