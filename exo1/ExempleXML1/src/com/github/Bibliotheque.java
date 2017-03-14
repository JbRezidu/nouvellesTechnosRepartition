//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.01.26 à 11:50:43 AM CET 
//


package com.github;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ouvrage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="auteur" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="editeur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="refs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="refLivre" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="isbn" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ibsn" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ouvrage"
})
@XmlRootElement(name = "bibliotheque")
public class Bibliotheque {

    protected List<Bibliotheque.Ouvrage> ouvrage;

    /**
     * Gets the value of the ouvrage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ouvrage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOuvrage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bibliotheque.Ouvrage }
     * 
     * 
     */
    public List<Bibliotheque.Ouvrage> getOuvrage() {
        if (ouvrage == null) {
            ouvrage = new ArrayList<Bibliotheque.Ouvrage>();
        }
        return this.ouvrage;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="auteur" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="editeur" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="refs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="refLivre" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="isbn" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ibsn" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titre",
        "auteur",
        "editeur",
        "prix",
        "refs"
    })
    public static class Ouvrage {

        @XmlElement(required = true)
        protected String titre;
        @XmlElement(required = true)
        protected List<String> auteur;
        @XmlElement(required = true)
        protected String editeur;
        protected int prix;
        protected Bibliotheque.Ouvrage.Refs refs;
        @XmlAttribute(name = "ibsn")
        protected Integer ibsn;

        /**
         * Obtient la valeur de la propriété titre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitre() {
            return titre;
        }

        /**
         * Définit la valeur de la propriété titre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitre(String value) {
            this.titre = value;
        }

        /**
         * Gets the value of the auteur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the auteur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuteur().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAuteur() {
            if (auteur == null) {
                auteur = new ArrayList<String>();
            }
            return this.auteur;
        }

        /**
         * Obtient la valeur de la propriété editeur.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEditeur() {
            return editeur;
        }

        /**
         * Définit la valeur de la propriété editeur.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEditeur(String value) {
            this.editeur = value;
        }

        /**
         * Obtient la valeur de la propriété prix.
         * 
         */
        public int getPrix() {
            return prix;
        }

        /**
         * Définit la valeur de la propriété prix.
         * 
         */
        public void setPrix(int value) {
            this.prix = value;
        }

        /**
         * Obtient la valeur de la propriété refs.
         * 
         * @return
         *     possible object is
         *     {@link Bibliotheque.Ouvrage.Refs }
         *     
         */
        public Bibliotheque.Ouvrage.Refs getRefs() {
            return refs;
        }

        /**
         * Définit la valeur de la propriété refs.
         * 
         * @param value
         *     allowed object is
         *     {@link Bibliotheque.Ouvrage.Refs }
         *     
         */
        public void setRefs(Bibliotheque.Ouvrage.Refs value) {
            this.refs = value;
        }

        /**
         * Obtient la valeur de la propriété ibsn.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIbsn() {
            return ibsn;
        }

        /**
         * Définit la valeur de la propriété ibsn.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIbsn(Integer value) {
            this.ibsn = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="refLivre" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="isbn" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "refLivre"
        })
        public static class Refs {

            protected List<Bibliotheque.Ouvrage.Refs.RefLivre> refLivre;

            /**
             * Gets the value of the refLivre property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the refLivre property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRefLivre().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Bibliotheque.Ouvrage.Refs.RefLivre }
             * 
             * 
             */
            public List<Bibliotheque.Ouvrage.Refs.RefLivre> getRefLivre() {
                if (refLivre == null) {
                    refLivre = new ArrayList<Bibliotheque.Ouvrage.Refs.RefLivre>();
                }
                return this.refLivre;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="isbn" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class RefLivre {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "isbn")
                protected Integer isbn;

                /**
                 * Obtient la valeur de la propriété value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Définit la valeur de la propriété value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtient la valeur de la propriété isbn.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getIsbn() {
                    return isbn;
                }

                /**
                 * Définit la valeur de la propriété isbn.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setIsbn(Integer value) {
                    this.isbn = value;
                }

            }

        }

    }

}
