
package vn.org.gs1.gepir.www;

/**
 * GepirStatisticsLineCounters bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class GepirStatisticsLineCounters implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * gepirStatisticsLineCounters Namespace URI = http://www.gepir.gs1.org.vn/
	 * Namespace Prefix = ns3
	 */

	/**
	 * field for CountGCP
	 */

	protected org.apache.axis2.databinding.types.NonNegativeInteger localCountGCP;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCountGCPTracker = false;

	public boolean isCountGCPSpecified() {
		return localCountGCPTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axis2.databinding.types.NonNegativeInteger
	 */
	public org.apache.axis2.databinding.types.NonNegativeInteger getCountGCP() {
		return localCountGCP;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CountGCP
	 */
	public void setCountGCP(org.apache.axis2.databinding.types.NonNegativeInteger param) {
		localCountGCPTracker = param != null;

		this.localCountGCP = param;

	}

	/**
	 * field for CountGLN
	 */

	protected org.apache.axis2.databinding.types.NonNegativeInteger localCountGLN;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCountGLNTracker = false;

	public boolean isCountGLNSpecified() {
		return localCountGLNTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axis2.databinding.types.NonNegativeInteger
	 */
	public org.apache.axis2.databinding.types.NonNegativeInteger getCountGLN() {
		return localCountGLN;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CountGLN
	 */
	public void setCountGLN(org.apache.axis2.databinding.types.NonNegativeInteger param) {
		localCountGLNTracker = param != null;

		this.localCountGLN = param;

	}

	/**
	 * field for CountGTIN
	 */

	protected org.apache.axis2.databinding.types.NonNegativeInteger localCountGTIN;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCountGTINTracker = false;

	public boolean isCountGTINSpecified() {
		return localCountGTINTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axis2.databinding.types.NonNegativeInteger
	 */
	public org.apache.axis2.databinding.types.NonNegativeInteger getCountGTIN() {
		return localCountGTIN;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CountGTIN
	 */
	public void setCountGTIN(org.apache.axis2.databinding.types.NonNegativeInteger param) {
		localCountGTINTracker = param != null;

		this.localCountGTIN = param;

	}

	/**
	 * field for CountClient This was an Array!
	 */

	protected vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[] localCountClient;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCountClientTracker = false;

	public boolean isCountClientSpecified() {
		return localCountClientTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[]
	 */
	public vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[] getCountClient() {
		return localCountClient;
	}

	/**
	 * validate the array for CountClient
	 */
	protected void validateCountClient(vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CountClient
	 */
	public void setCountClient(vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[] param) {

		validateCountClient(param);

		localCountClientTracker = param != null;

		this.localCountClient = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient
	 */
	public void addCountClient(vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient param) {
		if (localCountClient == null) {
			localCountClient = new vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[] {};
		}

		// update the setting tracker
		localCountClientTracker = true;

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localCountClient);
		list.add(param);
		this.localCountClient = (vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[]) list
				.toArray(new vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[list.size()]);

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
						namespacePrefix + ":gepirStatisticsLineCounters", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						"gepirStatisticsLineCounters", xmlWriter);
			}

		}
		if (localCountGCPTracker) {
			namespace = "http://www.gepir.gs1.org.vn/";
			writeStartElement(null, namespace, "CountGCP", xmlWriter);

			if (localCountGCP == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("CountGCP cannot be null!!");

			} else {

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountGCP));

			}

			xmlWriter.writeEndElement();
		}
		if (localCountGLNTracker) {
			namespace = "http://www.gepir.gs1.org.vn/";
			writeStartElement(null, namespace, "CountGLN", xmlWriter);

			if (localCountGLN == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("CountGLN cannot be null!!");

			} else {

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountGLN));

			}

			xmlWriter.writeEndElement();
		}
		if (localCountGTINTracker) {
			namespace = "http://www.gepir.gs1.org.vn/";
			writeStartElement(null, namespace, "CountGTIN", xmlWriter);

			if (localCountGTIN == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException("CountGTIN cannot be null!!");

			} else {

				xmlWriter.writeCharacters(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountGTIN));

			}

			xmlWriter.writeEndElement();
		}
		if (localCountClientTracker) {
			if (localCountClient != null) {
				for (int i = 0; i < localCountClient.length; i++) {
					if (localCountClient[i] != null) {
						localCountClient[i].serialize(
								new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountClient"),
								xmlWriter);
					} else {

						// we don't have to do any thing since minOccures is
						// zero

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("CountClient cannot be null!!");

			}
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

		if (localCountGCPTracker) {
			elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountGCP"));

			if (localCountGCP != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountGCP));
			} else {
				throw new org.apache.axis2.databinding.ADBException("CountGCP cannot be null!!");
			}
		}
		if (localCountGLNTracker) {
			elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountGLN"));

			if (localCountGLN != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountGLN));
			} else {
				throw new org.apache.axis2.databinding.ADBException("CountGLN cannot be null!!");
			}
		}
		if (localCountGTINTracker) {
			elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountGTIN"));

			if (localCountGTIN != null) {
				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountGTIN));
			} else {
				throw new org.apache.axis2.databinding.ADBException("CountGTIN cannot be null!!");
			}
		}
		if (localCountClientTracker) {
			if (localCountClient != null) {
				for (int i = 0; i < localCountClient.length; i++) {

					if (localCountClient[i] != null) {
						elementList.add(new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountClient"));
						elementList.add(localCountClient[i]);
					} else {

						// nothing to do

					}

				}
			} else {

				throw new org.apache.axis2.databinding.ADBException("CountClient cannot be null!!");

			}

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
		public static GepirStatisticsLineCounters parse(javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			GepirStatisticsLineCounters object = new GepirStatisticsLineCounters();

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

						if (!"gepirStatisticsLineCounters".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (GepirStatisticsLineCounters) vn.org.gs1.gepir.request.ExtensionMapper
									.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				java.util.ArrayList list4 = new java.util.ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountGCP")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "CountGCP" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCountGCP(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountGLN")
						.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "CountGLN" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCountGLN(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountGTIN")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "CountGTIN" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCountGTIN(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountClient")
								.equals(reader.getName())) {

					// Process the array and step past its final element's end.
					list4.add(vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient.Factory.parse(reader));

					// loop until we find a start element that is not part of
					// this array
					boolean loopDone4 = false;
					while (!loopDone4) {
						// We should be at the end element, but make sure
						while (!reader.isEndElement())
							reader.next();
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()) {
							// two continuous end elements means we are exiting
							// the xml structure
							loopDone4 = true;
						} else {
							if (new javax.xml.namespace.QName("http://www.gepir.gs1.org.vn/", "CountClient")
									.equals(reader.getName())) {
								list4.add(vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient.Factory
										.parse(reader));

							} else {
								loopDone4 = true;
							}
						}
					}
					// call the converter utility to convert and set the array

					object.setCountClient(
							(vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient[]) org.apache.axis2.databinding.utils.ConverterUtil
									.convertToArray(vn.org.gs1.gepir.www.GepirStatisticsLineCountersCountClient.class,
											list4));

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
