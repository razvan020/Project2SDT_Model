package com.api.project2.model.generated.appointmentscheduling;

import java.net.URI;
import java.util.Objects;
import com.api.project2.model.generated.appointmentscheduling.ErrorType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Errors
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class Errors implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid ErrorType> errors = new ArrayList<>();

  private String requestId;

  public Errors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Errors(List<@Valid ErrorType> errors) {
    this.errors = errors;
  }

  public Errors errors(List<@Valid ErrorType> errors) {
    this.errors = errors;
    return this;
  }

  public Errors addErrorsItem(ErrorType errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @NotNull @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ErrorType> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorType> errors) {
    this.errors = errors;
  }

  public Errors requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   * @return requestId
   */
  
  @Schema(name = "requestId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errors errors = (Errors) o;
    return Objects.equals(this.errors, errors.errors) &&
        Objects.equals(this.requestId, errors.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errors {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

