
/**
 * GetPartyByName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */

            
                package vn.org.gs1.gepir.www;
            

            /**
            *  GetPartyByName bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GetPartyByName
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GetPartyByName
                Namespace URI = http://www.gepir.gs1.org.vn/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for RequestedPartyName
                        */

                        
                                    protected java.lang.String localRequestedPartyName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedPartyNameTracker = false ;

                           public boolean isRequestedPartyNameSpecified(){
                               return localRequestedPartyNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestedPartyName(){
                               return localRequestedPartyName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedPartyName
                               */
                               public void setRequestedPartyName(java.lang.String param){
                            localRequestedPartyNameTracker = param != null;
                                   
                                            this.localRequestedPartyName=param;
                                       

                               }
                            

                        /**
                        * field for RequestedStreetAddress
                        */

                        
                                    protected java.lang.String localRequestedStreetAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedStreetAddressTracker = false ;

                           public boolean isRequestedStreetAddressSpecified(){
                               return localRequestedStreetAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestedStreetAddress(){
                               return localRequestedStreetAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedStreetAddress
                               */
                               public void setRequestedStreetAddress(java.lang.String param){
                            localRequestedStreetAddressTracker = param != null;
                                   
                                            this.localRequestedStreetAddress=param;
                                       

                               }
                            

                        /**
                        * field for RequestedPostalCode
                        */

                        
                                    protected java.lang.String localRequestedPostalCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedPostalCodeTracker = false ;

                           public boolean isRequestedPostalCodeSpecified(){
                               return localRequestedPostalCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestedPostalCode(){
                               return localRequestedPostalCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedPostalCode
                               */
                               public void setRequestedPostalCode(java.lang.String param){
                            localRequestedPostalCodeTracker = param != null;
                                   
                                            this.localRequestedPostalCode=param;
                                       

                               }
                            

                        /**
                        * field for RequestedCity
                        */

                        
                                    protected java.lang.String localRequestedCity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedCityTracker = false ;

                           public boolean isRequestedCitySpecified(){
                               return localRequestedCityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestedCity(){
                               return localRequestedCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedCity
                               */
                               public void setRequestedCity(java.lang.String param){
                            localRequestedCityTracker = param != null;
                                   
                                            this.localRequestedCity=param;
                                       

                               }
                            

                        /**
                        * field for RequestedCountry
                        */

                        
                                    protected java.lang.String localRequestedCountry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedCountryTracker = false ;

                           public boolean isRequestedCountrySpecified(){
                               return localRequestedCountryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestedCountry(){
                               return localRequestedCountry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedCountry
                               */
                               public void setRequestedCountry(java.lang.String param){
                            localRequestedCountryTracker = param != null;
                                   
                                            this.localRequestedCountry=param;
                                       

                               }
                            

                        /**
                        * field for RequestedKeywords
                        */

                        
                                    protected vn.org.gs1.gepir.www.ArrayOfString localRequestedKeywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedKeywordsTracker = false ;

                           public boolean isRequestedKeywordsSpecified(){
                               return localRequestedKeywordsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return vn.org.gs1.gepir.www.ArrayOfString
                           */
                           public  vn.org.gs1.gepir.www.ArrayOfString getRequestedKeywords(){
                               return localRequestedKeywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedKeywords
                               */
                               public void setRequestedKeywords(vn.org.gs1.gepir.www.ArrayOfString param){
                            localRequestedKeywordsTracker = param != null;
                                   
                                            this.localRequestedKeywords=param;
                                       

                               }
                            

                        /**
                        * field for RequestedLanguages
                        */

                        
                                    protected vn.org.gs1.gepir.www.ArrayOfLanguage localRequestedLanguages ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedLanguagesTracker = false ;

                           public boolean isRequestedLanguagesSpecified(){
                               return localRequestedLanguagesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return vn.org.gs1.gepir.www.ArrayOfLanguage
                           */
                           public  vn.org.gs1.gepir.www.ArrayOfLanguage getRequestedLanguages(){
                               return localRequestedLanguages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedLanguages
                               */
                               public void setRequestedLanguages(vn.org.gs1.gepir.www.ArrayOfLanguage param){
                            localRequestedLanguagesTracker = param != null;
                                   
                                            this.localRequestedLanguages=param;
                                       

                               }
                            

                        /**
                        * field for Version
                        * This was an Attribute!
                        */

                        
                                    protected java.math.BigDecimal localVersion ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigDecimal
                           */
                           public  java.math.BigDecimal getVersion(){
                               return localVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Version
                               */
                               public void setVersion(java.math.BigDecimal param){
                            
                                            this.localVersion=param;
                                       

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.gepir.gs1.org.vn/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":GetPartyByName",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GetPartyByName",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localVersion != null){
                                        
                                                writeAttribute("",
                                                         "version",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localVersion is null");
                                      }
                                     if (localRequestedPartyNameTracker){
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "requestedPartyName", xmlWriter);
                             

                                          if (localRequestedPartyName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requestedPartyName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestedPartyName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestedStreetAddressTracker){
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "requestedStreetAddress", xmlWriter);
                             

                                          if (localRequestedStreetAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requestedStreetAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestedStreetAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestedPostalCodeTracker){
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "requestedPostalCode", xmlWriter);
                             

                                          if (localRequestedPostalCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requestedPostalCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestedPostalCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestedCityTracker){
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "requestedCity", xmlWriter);
                             

                                          if (localRequestedCity==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requestedCity cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestedCity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestedCountryTracker){
                                    namespace = "http://www.gepir.gs1.org.vn/";
                                    writeStartElement(null, namespace, "requestedCountry", xmlWriter);
                             

                                          if (localRequestedCountry==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("requestedCountry cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestedCountry);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestedKeywordsTracker){
                                            if (localRequestedKeywords==null){
                                                 throw new org.apache.axis2.databinding.ADBException("requestedKeywords cannot be null!!");
                                            }
                                           localRequestedKeywords.serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedKeywords"),
                                               xmlWriter);
                                        } if (localRequestedLanguagesTracker){
                                            if (localRequestedLanguages==null){
                                                 throw new org.apache.axis2.databinding.ADBException("requestedLanguages cannot be null!!");
                                            }
                                           localRequestedLanguages.serialize(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedLanguages"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.gepir.gs1.org.vn/")){
                return "ns3";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localRequestedPartyNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "requestedPartyName"));
                                 
                                        if (localRequestedPartyName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedPartyName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requestedPartyName cannot be null!!");
                                        }
                                    } if (localRequestedStreetAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "requestedStreetAddress"));
                                 
                                        if (localRequestedStreetAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedStreetAddress));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requestedStreetAddress cannot be null!!");
                                        }
                                    } if (localRequestedPostalCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "requestedPostalCode"));
                                 
                                        if (localRequestedPostalCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedPostalCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requestedPostalCode cannot be null!!");
                                        }
                                    } if (localRequestedCityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "requestedCity"));
                                 
                                        if (localRequestedCity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedCity));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requestedCity cannot be null!!");
                                        }
                                    } if (localRequestedCountryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "requestedCountry"));
                                 
                                        if (localRequestedCountry != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedCountry));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("requestedCountry cannot be null!!");
                                        }
                                    } if (localRequestedKeywordsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "requestedKeywords"));
                            
                            
                                    if (localRequestedKeywords==null){
                                         throw new org.apache.axis2.databinding.ADBException("requestedKeywords cannot be null!!");
                                    }
                                    elementList.add(localRequestedKeywords);
                                } if (localRequestedLanguagesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/",
                                                                      "requestedLanguages"));
                            
                            
                                    if (localRequestedLanguages==null){
                                         throw new org.apache.axis2.databinding.ADBException("requestedLanguages cannot be null!!");
                                    }
                                    elementList.add(localRequestedLanguages);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","version"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static GetPartyByName parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GetPartyByName object =
                new GetPartyByName();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"GetPartyByName".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GetPartyByName)vn.org.gs1.gepir.request.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "version"
                    java.lang.String tempAttribVersion =
                        
                                reader.getAttributeValue(null,"version");
                            
                   if (tempAttribVersion!=null){
                         java.lang.String content = tempAttribVersion;
                        
                                                 object.setVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(tempAttribVersion));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute version is missing");
                           
                    }
                    handledAttributes.add("version");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedPartyName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestedPartyName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestedPartyName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedStreetAddress").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestedStreetAddress" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestedStreetAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedPostalCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestedPostalCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestedPostalCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedCity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestedCity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestedCity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedCountry").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestedCountry" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestedCountry(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedKeywords").equals(reader.getName())){
                                
                                                object.setRequestedKeywords(vn.org.gs1.gepir.www.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/","requestedLanguages").equals(reader.getName())){
                                
                                                object.setRequestedLanguages(vn.org.gs1.gepir.www.ArrayOfLanguage.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    