/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.api.project2.controller.generated.patientsrecords;

import com.api.project2.model.generated.patientsrecords.CreatePatientRecordsRequest;
import com.api.project2.model.generated.patientsrecords.CreatePatientRecordsResponse;
import com.api.project2.model.generated.patientsrecords.Errors;
import com.api.project2.model.generated.patientsrecords.PatientRecord;
import com.api.project2.model.generated.patientsrecords.UpdatePatientRecordsRequest;
import com.api.project2.model.generated.patientsrecords.UpdatePatientRecordsResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "Create Patient Records", description = "the Create Patient Records API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/patient-records/createPatientRecord : Create Patient Records
     * Create Patient Records
     *
     * @param createPatientRecordsRequest  (optional)
     * @return Valid request (status code 200)
     *         or Invalid request (status code 400)
     *         or server error (status code 500)
     */
    @Operation(
        operationId = "createPatientRecords",
        summary = "Create Patient Records",
        description = "Create Patient Records",
        tags = { "Create Patient Records" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreatePatientRecordsResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))
            }),
            @ApiResponse(responseCode = "500", description = "server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))
            })
        },
        security = {
            @SecurityRequirement(name = "basicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/patient-records/createPatientRecord",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<CreatePatientRecordsResponse> createPatientRecords(
        @Parameter(name = "CreatePatientRecordsRequest", description = "") @Valid @RequestBody(required = false) CreatePatientRecordsRequest createPatientRecordsRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : \"result\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestId\" : \"requestId\", \"errors\" : [ { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" }, { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestId\" : \"requestId\", \"errors\" : [ { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" }, { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/patient-records/getPatientRecord : Get Patient Records
     * Get Patient Records
     *
     * @param patientId  (required)
     * @return Valid request (status code 200)
     *         or Invalid request (status code 400)
     *         or server error (status code 500)
     */
    @Operation(
        operationId = "getPatientRecords",
        summary = "Get Patient Records",
        description = "Get Patient Records",
        tags = { "Get Patient Records" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PatientRecord.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))
            }),
            @ApiResponse(responseCode = "500", description = "server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))
            })
        },
        security = {
            @SecurityRequirement(name = "basicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/patient-records/getPatientRecord",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PatientRecord> getPatientRecords(
        @NotNull @Parameter(name = "patientId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "patientId", required = true) Integer patientId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"patientName\" : \"patientName\", \"treatment\" : \"treatment\", \"notes\" : \"notes\", \"patientId\" : 0, \"diagnosis\" : \"diagnosis\", \"appointmentDate\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestId\" : \"requestId\", \"errors\" : [ { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" }, { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestId\" : \"requestId\", \"errors\" : [ { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" }, { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v1/patient-records/updatePatientRecord : Update Patient Records
     * Update Patient Records
     *
     * @param patientId  (required)
     * @param updatePatientRecordsRequest  (optional)
     * @return Valid request (status code 200)
     *         or Invalid request (status code 400)
     *         or server error (status code 500)
     */
    @Operation(
        operationId = "updatePatientRecords",
        summary = "Update Patient Records",
        description = "Update Patient Records",
        tags = { "Update Patient Records" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UpdatePatientRecordsResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))
            }),
            @ApiResponse(responseCode = "500", description = "server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))
            })
        },
        security = {
            @SecurityRequirement(name = "basicAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/patient-records/updatePatientRecord",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<UpdatePatientRecordsResponse> updatePatientRecords(
        @NotNull @Parameter(name = "patientId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "patientId", required = true) Integer patientId,
        @Parameter(name = "UpdatePatientRecordsRequest", description = "") @Valid @RequestBody(required = false) UpdatePatientRecordsRequest updatePatientRecordsRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"result\" : \"result\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestId\" : \"requestId\", \"errors\" : [ { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" }, { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestId\" : \"requestId\", \"errors\" : [ { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" }, { \"code\" : \"Internal_Server_Error\", \"error\" : \"error\", \"message\" : \"error message\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
