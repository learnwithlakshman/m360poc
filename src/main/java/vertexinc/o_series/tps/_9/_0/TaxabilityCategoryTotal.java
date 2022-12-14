
package vertexinc.o_series.tps._9._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{urn:vertexinc:o-series:tps:9:0}TaxImposition"/&gt;
 *         &lt;element ref="{urn:vertexinc:o-series:tps:9:0}TaxabilityCategory" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:vertexinc:o-series:tps:9:0}CurrencyAmountType"/&gt;
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
    "taxImposition",
    "taxabilityCategory",
    "totalAmount"
})
@XmlRootElement(name = "TaxabilityCategoryTotal")
public class TaxabilityCategoryTotal {

    @XmlElement(name = "TaxImposition", required = true)
    protected TaxImposition taxImposition;
    @XmlElement(name = "TaxabilityCategory")
    protected TaxabilityCategory taxabilityCategory;
    @XmlElement(name = "TotalAmount", required = true)
    protected CurrencyAmountType totalAmount;

    /**
     * Gets the value of the taxImposition property.
     * 
     * @return
     *     possible object is
     *     {@link TaxImposition }
     *     
     */
    public TaxImposition getTaxImposition() {
        return taxImposition;
    }

    /**
     * Sets the value of the taxImposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxImposition }
     *     
     */
    public void setTaxImposition(TaxImposition value) {
        this.taxImposition = value;
    }

    /**
     * Gets the value of the taxabilityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TaxabilityCategory }
     *     
     */
    public TaxabilityCategory getTaxabilityCategory() {
        return taxabilityCategory;
    }

    /**
     * Sets the value of the taxabilityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxabilityCategory }
     *     
     */
    public void setTaxabilityCategory(TaxabilityCategory value) {
        this.taxabilityCategory = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalAmount(CurrencyAmountType value) {
        this.totalAmount = value;
    }

}
