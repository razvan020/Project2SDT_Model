package com.api.project2.model.generated.patientsrecords;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdatePatientRecordsRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class UpdatePatientRecordsRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer patientId;

  private String diagnosis;

  private String treatment;

  private String notes;

  public UpdatePatientRecordsRequest patientId(Integer patientId) {
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

  public UpdatePatientRecordsRequest diagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
    return this;
  }

  /**
   * Get diagnosis
   * @return diagnosis
   */
  
  @Schema(name = "diagnosis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diagnosis")
  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public UpdatePatientRecordsRequest treatment(String treatment) {
    this.treatment = treatment;
    return this;
  }

  /**
   * Get treatment
   * @return treatment
   */
  
  @Schema(name = "treatment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("treatment")
  public String getTreatment() {
    return treatment;
  }

  public void setTreatment(String treatment) {
    this.treatment = treatment;
  }

  public UpdatePatientRecordsRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePatientRecordsRequest updatePatientRecordsRequest = (UpdatePatientRecordsRequest) o;
    return Objects.equals(this.patientId, updatePatientRecordsRequest.patientId) &&
        Objects.equals(this.diagnosis, updatePatientRecordsRequest.diagnosis) &&
        Objects.equals(this.treatment, updatePatientRecordsRequest.treatment) &&
        Objects.equals(this.notes, updatePatientRecordsRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patientId, diagnosis, treatment, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePatientRecordsRequest {\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    diagnosis: ").append(toIndentedString(diagnosis)).append("\n");
    sb.append("    treatment: ").append(toIndentedString(treatment)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

