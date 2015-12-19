

package vn.org.gs1.gepir.www;

/**
 * GetPartyByGLN bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class GetPartyByGLN implements org.apache.axis2.databinding.ADBBean {

	/**
	 * field for RequestedGln This was an Array!
	 */

	protected java.lang.String[] localRequestedGln;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localRequestedGlnTracker = false;

	public boolean isRequestedGlnSpecified() {
		return localRequestedGlnTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String[]
	 */
	public java.lang.String[] getRequestedGln() {
		return localRequestedGln;
	}

	/**
	 * validate the array for RequestedGln
	 */
	protected void validateRequestedGln(java.lang.String[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            RequestedGln
	 */
	public void setRequestedGln(java.lang.String[] param) {

		validateRequestedGln(param);

		localRequestedGlnTracker = param != null;

		this.localRequestedGln = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            java.lang.String
	 */
	public void addRequestedGln(java.lang.String param) {
		if (localRequestedGln == null) {
			localRequestedGln = new java.lang.String[] {};
		}

		// update the setting tracker
		localRequestedGlnTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestedGln);
		list.add(param);
		this.localRequestedGln = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);

	}

	/**
	 * field for RequestedLanguages
	 */

	protected vn.org.gs1.gepir.www.ArrayOfLanguage localRequestedLanguages;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localRequestedLanguagesTracker = false;

	public boolean isRequestedLanguagesSpecified() {
		return localRequestedLanguagesTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return vn.org.gs1.gepir.www.ArrayOfLanguage
	 */
	public vn.org.gs1.gepir.www.ArrayOfLanguage getRequestedLanguages() {
		return localRequestedLanguages;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            RequestedLanguages
	 */
	public void setRequestedLanguages(vn.org.gs1.gepir.www.ArrayOfLanguage param) {
		localRequestedLanguagesTracker = param != null;

		this.localRequestedLanguages = param;

	}

	/**
	 * field for Version This was an Attribute!
	 */

	protected java.math.BigDecimal localVersion;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getVersion() {
		return localVersion;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Version
	 */
	public void setVersion(java.math.BigDecimal param) {

		this.localVersion = param;

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
						namespacePrefix + ":GetPartyByGLN", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GetPartyByGLN", xmlWriter);
			}

		}

		if (localVersion != null) {

			writeAttribute("", "version",
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion), xmlWriter);

		}

		else {
			throw new org.apache.axis2.databinding.ADBException("required attribute localVersion is null");
		}
		if (localRequestedGlnTracker) {
			if (localRequestedGln != null) {
				namespace = "http://www.gepir.gs1.org.vn/";
				for (int i = 0; i < localRequestedGln.length; i++) {

					if (localRequestedGln[i] != null) {

						writeStartElement(null, namespace, "requestedGln", xmlWriter);

						xmlWriter.writeCharacters(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedGln[i]));

						xmlWriter.writeEndElement();

					} else {

						// we have to do nothing since minOccurs is zero

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("requestedGln cannot be null!!");

			}

		}
		if (localRequestedLanguagesTracker) {
			if (localRequestedLanguages == null) {
				throw new org.apache.axis2.databinding.ADBException("requestedLanguages cannot be null!!");
			}
			localRequestedLanguages.serialize(
					new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "requestedLanguages"), xmlWriter);
		}
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

		if (localRequestedGlnTracker) {
			if (localRequestedGln != null) {
				for (int i = 0; i < localRequestedGln.length; i++) {

					if (localRequestedGln[i] != null) {
						elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "requestedGln"));
						elementList.add(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedGln[i]));
					} else {

						// have to do nothing

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("requestedGln cannot be null!!");

			}

		}
		if (localRequestedLanguagesTracker) {
			elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "requestedLanguages"));

			if (localRequestedLanguages == null) {
				throw new org.apache.axis2.databinding.ADBException("requestedLanguages cannot be null!!");
			}
			elementList.add(localRequestedLanguages);
		}
		attribList.add(new javax.xml.namespace.QName("", "version"));

		attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion));

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
		public static GetPartyByGLN parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			GetPartyByGLN object = new GetPartyByGLN();

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

						if (!"GetPartyByGLN".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (GetPartyByGLN) vn.org.gs1.gepir.request.ExtensionMapper.getTypeObject(nsUri, type,
									reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				// handle attribute "version"
				java.lang.String tempAttribVersion =

				reader.getAttributeValue(null, "version");

				if (tempAttribVersion != null) {
					java.lang.String content = tempAttribVersion;

					object.setVersion(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(tempAttribVersion));

				} else {

					throw new org.apache.axis2.databinding.ADBException("Required attribute version is missing");

				}
				handledAttributes.add("version");

				reader.next();

				java.util.ArrayList list1 = new java.util.ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "requestedGln")
								.equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list1.add(reader.getElementText());

					// loop until we find a start element that is not part of
					// this array
					boolean loopDone1 = false;
					while (!loopDone1) {
						// Ensure we are at the EndElement
						while (!reader.isEndElement()) {
							reader.next();
						}
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone1 = true;
						} else {
							if (new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "requestedGln")
									.equals(reader.getName())) {
								list1.add(reader.getElementText());

							} else {
								loopDone1 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setRequestedGln((java.lang.String[]) list1.toArray(new java.lang.String[list1.size()]));

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "requestedLanguages")
								.equals(reader.getName())) {

					object.setRequestedLanguages(vn.org.gs1.gepir.www.ArrayOfLanguage.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {

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
