
package vn.org.gs1.gepir.www;

/**
 * GepirResponseHeader bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class GepirResponseHeader implements org.apache.axis2.databinding.ADBBean {

	/**
	 * field for ResponderGln
	 */

	protected java.lang.String localResponderGln;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localResponderGlnTracker = false;

	public boolean isResponderGlnSpecified() {
		return localResponderGlnTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getResponderGln() {
		return localResponderGln;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ResponderGln
	 */
	public void setResponderGln(java.lang.String param) {
		localResponderGlnTracker = param != null;

		this.localResponderGln = param;

	}

	/**
	 * field for NumberOfHits
	 */

	protected int localNumberOfHits;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getNumberOfHits() {
		return localNumberOfHits;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            NumberOfHits
	 */
	public void setNumberOfHits(int param) {

		this.localNumberOfHits = param;

	}

	/**
	 * field for ReturnCode
	 */

	protected int localReturnCode;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getReturnCode() {
		return localReturnCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ReturnCode
	 */
	public void setReturnCode(int param) {

		this.localReturnCode = param;

	}

	/**
	 * field for ExtraAttributes This was an Attribute! This was an Array!
	 */

	protected org.apache.axiom.om.OMAttribute[] localExtraAttributes;

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axiom.om.OMAttribute[]
	 */
	public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
		return localExtraAttributes;
	}

	/**
	 * validate the array for ExtraAttributes
	 */
	protected void validateExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {

		if ((param != null) && (param.length > 1)) {
			throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
		}

		if ((param != null) && (param.length < 1)) {
			throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
		}

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ExtraAttributes
	 */
	public void setExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {

		validateExtraAttributes(param);

		this.localExtraAttributes = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            org.apache.axiom.om.OMAttribute
	 */
	public void addExtraAttributes(org.apache.axiom.om.OMAttribute param) {
		if (localExtraAttributes == null) {
			localExtraAttributes = new org.apache.axiom.om.OMAttribute[] {};
		}

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraAttributes);
		list.add(param);
		this.localExtraAttributes = (org.apache.axiom.om.OMAttribute[]) list
				.toArray(new org.apache.axiom.om.OMAttribute[list.size()]);

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
			boolean serializeType)
					throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.gepir.gs1.org.vn/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":gepirResponseHeader", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "gepirResponseHeader",
						xmlWriter);
			}

		}

		if (localExtraAttributes != null) {
			for (int i = 0; i < localExtraAttributes.length; i++) {
				writeAttribute(localExtraAttributes[i].getNamespace().getName(), localExtraAttributes[i].getLocalName(),
						localExtraAttributes[i].getAttributeValue(), xmlWriter);
			}
		}
		if (localResponderGlnTracker) {
			namespace = "http://www.gepir.gs1.org.vn/";
			writeStartElement(null, namespace, "responderGln", xmlWriter);

			if (localResponderGln == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("responderGln cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localResponderGln);

			}

			xmlWriter.writeEndElement();
		}
		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "numberOfHits", xmlWriter);

		if (localNumberOfHits == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException("numberOfHits cannot be null!!");

		} else {
			xmlWriter.writeCharacters(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfHits));
		}

		xmlWriter.writeEndElement();

		namespace = "http://www.gepir.gs1.org.vn/";
		writeStartElement(null, namespace, "returnCode", xmlWriter);

		if (localReturnCode == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException("returnCode cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
		}

		xmlWriter.writeEndElement();

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://www.gepir.gs1.org.vn/")) {
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
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException {

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
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
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
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
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
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
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
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		if (localResponderGlnTracker) {
			elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "responderGln"));

			if (localResponderGln != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponderGln));
			} else {
				throw new org.apache.axis2.databinding.ADBException("responderGln cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "numberOfHits"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfHits));

		elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "returnCode"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));

		for (int i = 0; i < localExtraAttributes.length; i++) {
			attribList.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
			attribList.add(localExtraAttributes[i]);
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
				attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static GepirResponseHeader parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			GepirResponseHeader object = new GepirResponseHeader();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"gepirResponseHeader".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (GepirResponseHeader) vn.org.gs1.gepir.request.ExtensionMapper.getTypeObject(nsUri,
									type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				// now run through all any or extra attributes
				// which were not reflected until now
				for (int i = 0; i < reader.getAttributeCount(); i++) {
					if (!handledAttributes.contains(reader.getAttributeLocalName(i))) {
						// this is an anyAttribute and we create
						// an OMAttribute for this
						org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
						org.apache.axiom.om.OMAttribute attr = factory.createOMAttribute(
								reader.getAttributeLocalName(i),
								factory.createOMNamespace(reader.getAttributeNamespace(i),
										reader.getAttributePrefix(i)),
								reader.getAttributeValue(i));

						// and add it to the extra attributes

						object.addExtraAttributes(attr);

					}
				}

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "responderGln")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "responderGln" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setResponderGln(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "numberOfHits")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "numberOfHits" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setNumberOfHits(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "returnCode")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "returnCode" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setReturnCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
