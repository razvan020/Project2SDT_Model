package com.api.project2.model.generated.patientsrecords;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Patient
 */
@Entity
@Table(name = "patients")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class Patient implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer patientId;

  private String patientName;

  private String address;

  private BigDecimal weight;

  private BigDecimal height;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date birthDate = null;

  public Patient patientId(Integer patientId) {
    this.patientId = patientId;
    return this;
  }

  /**
   * Get patientId
   * @return patientId
   */

  @Schema(name = "patientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("patientId")
  public Integer getPatientId() {
    return patientId;
  }

  public void setPatientId(Integer patientId) {
    this.patientId = patientId;
  }

  public Patient patientName(String patientName) {
    this.patientName = patientName;
    return this;
  }

  /**
   * Get patientName
   * @return patientName
   */

  @Schema(name = "patientName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("patientName")
  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public Patient address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */

  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Patient weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  @Valid
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public Patient height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  @Valid
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public Patient birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
   */
  @Valid
  @Schema(name = "birthDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDate")
  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.patientId, patient.patientId) &&
            Objects.equals(this.patientName, patient.patientName) &&
            Objects.equals(this.address, patient.address) &&
            Objects.equals(this.weight, patient.weight) &&
            Objects.equals(this.height, patient.height) &&
            Objects.equals(this.birthDate, patient.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patientId, patientName, address, weight, height, birthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    patientName: ").append(toIndentedString(patientName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

