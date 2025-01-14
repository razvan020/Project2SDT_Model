package com.api.project2.model.generated.patientsrecords;

import java.net.URI;
import java.util.Objects;
import com.api.project2.model.generated.patientsrecords.SpecializationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.persistence.*;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Doctor
 */
@Entity
@Table(name = "doctors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class Doctor implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer doctorId;

  private String doctorName;

  private String address;

  @Enumerated(EnumType.STRING)
  private SpecializationType specialization;

  public Doctor doctorId(Integer doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
   */

  @Schema(name = "doctorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("doctorId")
  public Integer getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(Integer doctorId) {
    this.doctorId = doctorId;
  }

  public Doctor doctorName(String doctorName) {
    this.doctorName = doctorName;
    return this;
  }

  /**
   * Get doctorName
   * @return doctorName
   */

  @Schema(name = "doctorName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("doctorName")
  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public Doctor address(String address) {
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

  public Doctor specialization(SpecializationType specialization) {
    this.specialization = specialization;
    return this;
  }

  /**
   * Get specialization
   * @return specialization
   */
  @Valid
  @Schema(name = "specialization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialization")
  public SpecializationType getSpecialization() {
    return specialization;
  }

  public void setSpecialization(SpecializationType specialization) {
    this.specialization = specialization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Doctor doctor = (Doctor) o;
    return Objects.equals(this.doctorId, doctor.doctorId) &&
            Objects.equals(this.doctorName, doctor.doctorName) &&
            Objects.equals(this.address, doctor.address) &&
            Objects.equals(this.specialization, doctor.specialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctorId, doctorName, address, specialization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doctor {\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    doctorName: ").append(toIndentedString(doctorName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
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

