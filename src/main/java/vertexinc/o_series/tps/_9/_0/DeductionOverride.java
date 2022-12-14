
package vertexinc.o_series.tps._9._0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExemptOverride" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:vertexinc:o-series:tps:9:0&gt;AmountType"&gt;
 *                 &lt;attribute name="overrideExemptReasonCode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="4"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NonTaxableOverride" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:vertexinc:o-series:tps:9:0&gt;AmountType"&gt;
 *                 &lt;attribute name="overrideNonTaxableReasonCode" type="{urn:vertexinc:o-series:tps:9:0}ReasonCodeType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exemptOverride",
    "nonTaxableOverride"
})
@XmlRootElement(name = "DeductionOverride")
public class DeductionOverride {

    @XmlElement(name = "ExemptOverride")
    protected DeductionOverride.ExemptOverride exemptOverride;
    @XmlElement(name = "NonTaxableOverride")
    protected DeductionOverride.NonTaxableOverride nonTaxableOverride;

    /**
     * Gets the value of the exemptOverride property.
     * 
     * @return
     *     possible object is
     *     {@link DeductionOverride.ExemptOverride }
     *     
     */
    public DeductionOverride.ExemptOverride getExemptOverride() {
        return exemptOverride;
    }

    /**
     * Sets the value of the exemptOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductionOverride.ExemptOverride }
     *     
     */
    public void setExemptOverride(DeductionOverride.ExemptOverride value) {
        this.exemptOverride = value;
    }

    /**
     * Gets the value of the nonTaxableOverride property.
     * 
     * @return
     *     possible object is
     *     {@link DeductionOverride.NonTaxableOverride }
     *     
     */
    public DeductionOverride.NonTaxableOverride getNonTaxableOverride() {
        return nonTaxableOverride;
    }

    /**
     * Sets the value of the nonTaxableOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductionOverride.NonTaxableOverride }
     *     
     */
    public void setNonTaxableOverride(DeductionOverride.NonTaxableOverride value) {
        this.nonTaxableOverride = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:vertexinc:o-series:tps:9:0&gt;AmountType"&gt;
     *       &lt;attribute name="overrideExemptReasonCode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="4"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ExemptOverride {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "overrideExemptReasonCode")
        protected String overrideExemptReasonCode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the overrideExemptReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverrideExemptReasonCode() {
            return overrideExemptReasonCode;
        }

        /**
         * Sets the value of the overrideExemptReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverrideExemptReasonCode(String value) {
            this.overrideExemptReasonCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:vertexinc:o-series:tps:9:0&gt;AmountType"&gt;
     *       &lt;attribute name="overrideNonTaxableReasonCode" type="{urn:vertexinc:o-series:tps:9:0}ReasonCodeType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NonTaxableOverride {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "overrideNonTaxableReasonCode")
        protected String overrideNonTaxableReasonCode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the overrideNonTaxableReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverrideNonTaxableReasonCode() {
            return overrideNonTaxableReasonCode;
        }

        /**
         * Sets the value of the overrideNonTaxableReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverrideNonTaxableReasonCode(String value) {
            this.overrideNonTaxableReasonCode = value;
        }

    }

}
