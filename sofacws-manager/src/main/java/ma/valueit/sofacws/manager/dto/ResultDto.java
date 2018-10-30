package ma.valueit.sofacws.manager.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultDto {
    @Getter @Setter
    @XmlElement
    private String p_flag_fichage;
    @Getter @Setter
    @XmlElement
    private String p_reference_tiers;
}