package com.api.project2.model.generated.appointmentscheduling;

import java.net.URI;
import java.util.Objects;
import com.api.project2.model.generated.appointmentscheduling.AppointmentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateAppointmentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class CreateAppointmentRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer idPatient;

  private Integer idDoctor;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date timestamp;

  private AppointmentType type;

  public CreateAppointmentRequest idPatient(Integer idPatient) {
    this.idPatient = idPatient;
    return this;
  }

  /**
   * Get idPatient
   * @return idPatient
   */
  
  @Schema(name = "idPatient", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idPatient")
  public Integer getIdPatient() {
    return idPatient;
  }

  public void setIdPatient(Integer idPatient) {
    this.idPatient = idPatient;
  }

  public CreateAppointmentRequest idDoctor(Integer idDoctor) {
    this.idDoctor = idDoctor;
    return this;
  }

  /**
   * Get idDoctor
   * @return idDoctor
   */
  
  @Schema(name = "idDoctor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idDoctor")
  public Integer getIdDoctor() {
    return idDoctor;
  }

  public void setIdDoctor(Integer idDoctor) {
    this.idDoctor = idDoctor;
  }

  public CreateAppointmentRequest timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @Valid 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public CreateAppointmentRequest type(AppointmentType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public AppointmentType getType() {
    return type;
  }

  public void setType(AppointmentType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppointmentRequest createAppointmentRequest = (CreateAppointmentRequest) o;
    return Objects.equals(this.idPatient, createAppointmentRequest.idPatient) &&
        Objects.equals(this.idDoctor, createAppointmentRequest.idDoctor) &&
        Objects.equals(this.timestamp, createAppointmentRequest.timestamp) &&
        Objects.equals(this.type, createAppointmentRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPatient, idDoctor, timestamp, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppointmentRequest {\n");
    sb.append("    idPatient: ").append(toIndentedString(idPatient)).append("\n");
    sb.append("    idDoctor: ").append(toIndentedString(idDoctor)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

