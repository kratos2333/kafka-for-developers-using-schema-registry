/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.learnavro.domain.generated;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CoffeeOrder extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 447184593723694569L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CoffeeOrder\",\"namespace\":\"com.learnavro.domain.generated\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"nickName\",\"type\":\"string\",\"doc\":\"Optional Field represents the nick name of the user\",\"default\":\"\"},{\"name\":\"orderLineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderLineItem\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"size\",\"type\":{\"type\":\"enum\",\"name\":\"Size\",\"symbols\":[\"LARGE\",\"MEDIUM\",\"SMALL\"]}},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"cost\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":3,\"scale\":2}}]}}},{\"name\":\"ordered_time\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"status\",\"type\":\"string\",\"default\":\"NEW\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<CoffeeOrder> ENCODER =
      new BinaryMessageEncoder<CoffeeOrder>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CoffeeOrder> DECODER =
      new BinaryMessageDecoder<CoffeeOrder>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CoffeeOrder> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CoffeeOrder> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CoffeeOrder> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CoffeeOrder>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CoffeeOrder to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CoffeeOrder from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CoffeeOrder instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CoffeeOrder fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.UUID id;
  @Deprecated public java.lang.CharSequence name;
  /** Optional Field represents the nick name of the user */
  @Deprecated public java.lang.CharSequence nickName;
  @Deprecated public java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems;
  @Deprecated public java.time.Instant ordered_time;
  @Deprecated public java.lang.CharSequence status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CoffeeOrder() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param nickName Optional Field represents the nick name of the user
   * @param orderLineItems The new value for orderLineItems
   * @param ordered_time The new value for ordered_time
   * @param status The new value for status
   */
  public CoffeeOrder(java.util.UUID id, java.lang.CharSequence name, java.lang.CharSequence nickName, java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems, java.time.Instant ordered_time, java.lang.CharSequence status) {
    this.id = id;
    this.name = name;
    this.nickName = nickName;
    this.orderLineItems = orderLineItems;
    this.ordered_time = ordered_time.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.status = status;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return nickName;
    case 3: return orderLineItems;
    case 4: return ordered_time;
    case 5: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.util.UUID)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: nickName = (java.lang.CharSequence)value$; break;
    case 3: orderLineItems = (java.util.List<com.learnavro.domain.generated.OrderLineItem>)value$; break;
    case 4: ordered_time = (java.time.Instant)value$; break;
    case 5: status = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.UUID getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.UUID value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'nickName' field.
   * @return Optional Field represents the nick name of the user
   */
  public java.lang.CharSequence getNickName() {
    return nickName;
  }


  /**
   * Sets the value of the 'nickName' field.
   * Optional Field represents the nick name of the user
   * @param value the value to set.
   */
  public void setNickName(java.lang.CharSequence value) {
    this.nickName = value;
  }

  /**
   * Gets the value of the 'orderLineItems' field.
   * @return The value of the 'orderLineItems' field.
   */
  public java.util.List<com.learnavro.domain.generated.OrderLineItem> getOrderLineItems() {
    return orderLineItems;
  }


  /**
   * Sets the value of the 'orderLineItems' field.
   * @param value the value to set.
   */
  public void setOrderLineItems(java.util.List<com.learnavro.domain.generated.OrderLineItem> value) {
    this.orderLineItems = value;
  }

  /**
   * Gets the value of the 'ordered_time' field.
   * @return The value of the 'ordered_time' field.
   */
  public java.time.Instant getOrderedTime() {
    return ordered_time;
  }


  /**
   * Sets the value of the 'ordered_time' field.
   * @param value the value to set.
   */
  public void setOrderedTime(java.time.Instant value) {
    this.ordered_time = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Creates a new CoffeeOrder RecordBuilder.
   * @return A new CoffeeOrder RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrder.Builder newBuilder() {
    return new com.learnavro.domain.generated.CoffeeOrder.Builder();
  }

  /**
   * Creates a new CoffeeOrder RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CoffeeOrder RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrder.Builder newBuilder(com.learnavro.domain.generated.CoffeeOrder.Builder other) {
    if (other == null) {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder();
    } else {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder(other);
    }
  }

  /**
   * Creates a new CoffeeOrder RecordBuilder by copying an existing CoffeeOrder instance.
   * @param other The existing instance to copy.
   * @return A new CoffeeOrder RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrder.Builder newBuilder(com.learnavro.domain.generated.CoffeeOrder other) {
    if (other == null) {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder();
    } else {
      return new com.learnavro.domain.generated.CoffeeOrder.Builder(other);
    }
  }

  /**
   * RecordBuilder for CoffeeOrder instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CoffeeOrder>
    implements org.apache.avro.data.RecordBuilder<CoffeeOrder> {

    private java.util.UUID id;
    private java.lang.CharSequence name;
    /** Optional Field represents the nick name of the user */
    private java.lang.CharSequence nickName;
    private java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems;
    private java.time.Instant ordered_time;
    private java.lang.CharSequence status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.learnavro.domain.generated.CoffeeOrder.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.nickName)) {
        this.nickName = data().deepCopy(fields()[2].schema(), other.nickName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.orderLineItems)) {
        this.orderLineItems = data().deepCopy(fields()[3].schema(), other.orderLineItems);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.ordered_time)) {
        this.ordered_time = data().deepCopy(fields()[4].schema(), other.ordered_time);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing CoffeeOrder instance
     * @param other The existing instance to copy.
     */
    private Builder(com.learnavro.domain.generated.CoffeeOrder other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nickName)) {
        this.nickName = data().deepCopy(fields()[2].schema(), other.nickName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orderLineItems)) {
        this.orderLineItems = data().deepCopy(fields()[3].schema(), other.orderLineItems);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ordered_time)) {
        this.ordered_time = data().deepCopy(fields()[4].schema(), other.ordered_time);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.UUID getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setId(java.util.UUID value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'nickName' field.
      * Optional Field represents the nick name of the user
      * @return The value.
      */
    public java.lang.CharSequence getNickName() {
      return nickName;
    }


    /**
      * Sets the value of the 'nickName' field.
      * Optional Field represents the nick name of the user
      * @param value The value of 'nickName'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setNickName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.nickName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'nickName' field has been set.
      * Optional Field represents the nick name of the user
      * @return True if the 'nickName' field has been set, false otherwise.
      */
    public boolean hasNickName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'nickName' field.
      * Optional Field represents the nick name of the user
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearNickName() {
      nickName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderLineItems' field.
      * @return The value.
      */
    public java.util.List<com.learnavro.domain.generated.OrderLineItem> getOrderLineItems() {
      return orderLineItems;
    }


    /**
      * Sets the value of the 'orderLineItems' field.
      * @param value The value of 'orderLineItems'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setOrderLineItems(java.util.List<com.learnavro.domain.generated.OrderLineItem> value) {
      validate(fields()[3], value);
      this.orderLineItems = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'orderLineItems' field has been set.
      * @return True if the 'orderLineItems' field has been set, false otherwise.
      */
    public boolean hasOrderLineItems() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'orderLineItems' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearOrderLineItems() {
      orderLineItems = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'ordered_time' field.
      * @return The value.
      */
    public java.time.Instant getOrderedTime() {
      return ordered_time;
    }


    /**
      * Sets the value of the 'ordered_time' field.
      * @param value The value of 'ordered_time'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setOrderedTime(java.time.Instant value) {
      validate(fields()[4], value);
      this.ordered_time = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'ordered_time' field has been set.
      * @return True if the 'ordered_time' field has been set, false otherwise.
      */
    public boolean hasOrderedTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'ordered_time' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearOrderedTime() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.status = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrder.Builder clearStatus() {
      status = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CoffeeOrder build() {
      try {
        CoffeeOrder record = new CoffeeOrder();
        record.id = fieldSetFlags()[0] ? this.id : (java.util.UUID) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.nickName = fieldSetFlags()[2] ? this.nickName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.orderLineItems = fieldSetFlags()[3] ? this.orderLineItems : (java.util.List<com.learnavro.domain.generated.OrderLineItem>) defaultValue(fields()[3]);
        record.ordered_time = fieldSetFlags()[4] ? this.ordered_time : (java.time.Instant) defaultValue(fields()[4]);
        record.status = fieldSetFlags()[5] ? this.status : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CoffeeOrder>
    WRITER$ = (org.apache.avro.io.DatumWriter<CoffeeOrder>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CoffeeOrder>
    READER$ = (org.apache.avro.io.DatumReader<CoffeeOrder>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










