//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.01.03 às 05:52:03 PM BRT 
//


package br.ufc.storm.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de quality_parameter_type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="quality_parameter_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quality_argument" type="{http://storm.lia.ufc.br}quality_argument_type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="qp_id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="kind_id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quality_parameter_type", propOrder = {
    "qualityArgument"
})
public class QualityParameterType {

    @XmlElement(name = "quality_argument")
    protected QualityArgumentType qualityArgument;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "qp_id")
    protected Integer qpId;
    @XmlAttribute(name = "kind_id")
    protected Integer kindId;

    /**
     * Obtém o valor da propriedade qualityArgument.
     * 
     * @return
     *     possible object is
     *     {@link QualityArgumentType }
     *     
     */
    public QualityArgumentType getQualityArgument() {
        return qualityArgument;
    }

    /**
     * Define o valor da propriedade qualityArgument.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityArgumentType }
     *     
     */
    public void setQualityArgument(QualityArgumentType value) {
        this.qualityArgument = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade qpId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQpId() {
        return qpId;
    }

    /**
     * Define o valor da propriedade qpId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQpId(Integer value) {
        this.qpId = value;
    }

    /**
     * Obtém o valor da propriedade kindId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKindId() {
        return kindId;
    }

    /**
     * Define o valor da propriedade kindId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKindId(Integer value) {
        this.kindId = value;
    }

}
