/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0-beta).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ACK;
import org.openapitools.model.EventRequest;
import org.openapitools.model.EventResponse;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T19:41:12.483939300+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "Event", description = "Event is an activity performed by user on a web page. This is usually a click, drag, copy action.")
public interface EventApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /event/_create : Create a new event based on the required set of parameters
     * Create a new event
     *
     * @param eventRequest Create a new Event in the system (required)
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "createEvent",
        summary = "Create a new event based on the required set of parameters",
        description = "Create a new event",
        tags = { "Event" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/event/_create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ACK> createEvent(
        @Parameter(name = "EventRequest", description = "Create a new Event in the system", required = true) @Valid @RequestBody EventRequest eventRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"116bd8d3-e5a9-4e1c-86dc-b2a9c17e3fb1\", \"responseMessage\" : \"Update is succesful\", \"responseCode\" : \"CODE-123\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /event/_search : Find events using supported parameters
     * Search events based on multiple filters
     *
     * @param xAuthToken  (optional)
     * @param eventId Unique id to be considered for filter (optional)
     * @param pageURL Page URL that needs to be considered for filter (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "searchEvents",
        summary = "Find events using supported parameters",
        description = "Search events based on multiple filters",
        tags = { "Event" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = EventResponse.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/event/_search",
        produces = { "application/json" }
    )
    default ResponseEntity<List<EventResponse>> searchEvents(
        @Parameter(name = "X-authToken", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-authToken", required = false) String xAuthToken,
        @Parameter(name = "eventId", description = "Unique id to be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "eventId", required = false) String eventId,
        @Parameter(name = "pageURL", description = "Page URL that needs to be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "pageURL", required = false) String pageURL
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"elementId\" : \"elementId\", \"pointer\" : \"pointer\", \"elementText\" : \"elementText\", \"createdTime\" : \"createdTime\", \"pageURL\" : \"pageURL\", \"id\" : \"id\", \"elementClass\" : \"elementClass\", \"type\" : \"type\", \"elementName\" : \"elementName\" }, { \"elementId\" : \"elementId\", \"pointer\" : \"pointer\", \"elementText\" : \"elementText\", \"createdTime\" : \"createdTime\", \"pageURL\" : \"pageURL\", \"id\" : \"id\", \"elementClass\" : \"elementClass\", \"type\" : \"type\", \"elementName\" : \"elementName\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
