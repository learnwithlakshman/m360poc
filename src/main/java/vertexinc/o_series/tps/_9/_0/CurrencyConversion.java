
package vertexinc.o_series.tps._9._0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attGroup ref="{urn:vertexinc:o-series:tps:9:0}isoCurrencyCode"/&gt;
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
@XmlRootElement(name = "CurrencyConversion")
public class CurrencyConversion {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "isoCurrencyName")
    protected String isoCurrencyName;
    @XmlAttribute(name = "isoCurrencyCodeAlpha")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isoCurrencyCodeAlpha;
    @XmlAttribute(name = "isoCurrencyCodeNum")
    protected Integer isoCurrencyCodeNum;

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
     * Gets the value of the isoCurrencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCurrencyName() {
        return isoCurrencyName;
    }

    /**
     * Sets the value of the isoCurrencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCurrencyName(String value) {
        this.isoCurrencyName = value;
    }

    /**
     * Gets the value of the isoCurrencyCodeAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCurrencyCodeAlpha() {
        return isoCurrencyCodeAlpha;
    }

    /**
     * Sets the value of the isoCurrencyCodeAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCurrencyCodeAlpha(String value) {
        this.isoCurrencyCodeAlpha = value;
    }

    /**
     * Gets the value of the isoCurrencyCodeNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsoCurrencyCodeNum() {
        return isoCurrencyCodeNum;
    }

    /**
     * Sets the value of the isoCurrencyCodeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsoCurrencyCodeNum(Integer value) {
        this.isoCurrencyCodeNum = value;
    }

}
